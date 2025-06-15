// File generated from our OpenAPI spec by Stainless.

package com.earn_app.api.services.blocking

import com.earn_app.api.core.ClientOptions
import com.earn_app.api.core.JsonValue
import com.earn_app.api.core.RequestOptions
import com.earn_app.api.core.checkRequired
import com.earn_app.api.core.handlers.errorHandler
import com.earn_app.api.core.handlers.jsonHandler
import com.earn_app.api.core.handlers.withErrorHandler
import com.earn_app.api.core.http.HttpMethod
import com.earn_app.api.core.http.HttpRequest
import com.earn_app.api.core.http.HttpResponse.Handler
import com.earn_app.api.core.http.HttpResponseFor
import com.earn_app.api.core.http.parseable
import com.earn_app.api.core.prepare
import com.earn_app.api.models.missions.Mission
import com.earn_app.api.models.missions.MissionListParams
import com.earn_app.api.models.missions.MissionRetrieveParams

class MissionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MissionService {

    private val withRawResponse: MissionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MissionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): MissionService =
        MissionServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun retrieve(params: MissionRetrieveParams, requestOptions: RequestOptions): Mission =
        // get /missions/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: MissionListParams, requestOptions: RequestOptions): List<Mission> =
        // get /missions
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MissionService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): MissionService.WithRawResponse =
            MissionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<Mission> =
            jsonHandler<Mission>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: MissionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Mission> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("missions", params._pathParam(0))
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

        private val listHandler: Handler<List<Mission>> =
            jsonHandler<List<Mission>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(
            params: MissionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<Mission>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("missions")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }
    }
}
