// File generated from our OpenAPI spec by Stainless.

package com.earn_app.api.services.blocking.users

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
import com.earn_app.api.core.http.json
import com.earn_app.api.core.http.parseable
import com.earn_app.api.core.prepare
import com.earn_app.api.models.users.stakes.StakeCreateParams
import com.earn_app.api.models.users.stakes.StakeListParams
import com.earn_app.api.models.users.stakes.UserStake

class StakeServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    StakeService {

    private val withRawResponse: StakeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): StakeService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): StakeService =
        StakeServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun create(params: StakeCreateParams, requestOptions: RequestOptions): UserStake =
        // post /users/{userId}/stakes
        withRawResponse().create(params, requestOptions).parse()

    override fun list(params: StakeListParams, requestOptions: RequestOptions): List<UserStake> =
        // get /users/{userId}/stakes
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StakeService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): StakeService.WithRawResponse =
            StakeServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val createHandler: Handler<UserStake> =
            jsonHandler<UserStake>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: StakeCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserStake> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("users", params._pathParam(0), "stakes")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<List<UserStake>> =
            jsonHandler<List<UserStake>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(
            params: StakeListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<UserStake>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("users", params._pathParam(0), "stakes")
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
