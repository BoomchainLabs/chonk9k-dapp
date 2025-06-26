// File generated from our OpenAPI spec by Stainless.

package com.earn_app.api.services.blocking

import com.earn_app.api.core.ClientOptions
import com.earn_app.api.core.JsonValue
import com.earn_app.api.core.RequestOptions
import com.earn_app.api.core.handlers.errorHandler
import com.earn_app.api.core.handlers.jsonHandler
import com.earn_app.api.core.handlers.withErrorHandler
import com.earn_app.api.core.http.HttpMethod
import com.earn_app.api.core.http.HttpRequest
import com.earn_app.api.core.http.HttpResponse.Handler
import com.earn_app.api.core.http.HttpResponseFor
import com.earn_app.api.core.http.parseable
import com.earn_app.api.core.prepare
import com.earn_app.api.models.stats.StatRetrieveParams
import com.earn_app.api.models.stats.StatRetrieveResponse

class StatServiceImpl internal constructor(private val clientOptions: ClientOptions) : StatService {

    private val withRawResponse: StatService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): StatService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): StatService =
        StatServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun retrieve(
        params: StatRetrieveParams,
        requestOptions: RequestOptions,
    ): StatRetrieveResponse =
        // get /stats
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StatService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): StatService.WithRawResponse =
            StatServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val retrieveHandler: Handler<StatRetrieveResponse> =
            jsonHandler<StatRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: StatRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StatRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("stats")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
