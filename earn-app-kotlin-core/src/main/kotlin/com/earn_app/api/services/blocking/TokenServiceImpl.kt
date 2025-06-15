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
import com.earn_app.api.models.token.TokenRetrieveInfoParams
import com.earn_app.api.models.token.TokenRetrieveInfoResponse

class TokenServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TokenService {

    private val withRawResponse: TokenService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TokenService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TokenService =
        TokenServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun retrieveInfo(
        params: TokenRetrieveInfoParams,
        requestOptions: RequestOptions,
    ): TokenRetrieveInfoResponse =
        // get /token/info
        withRawResponse().retrieveInfo(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TokenService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): TokenService.WithRawResponse =
            TokenServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val retrieveInfoHandler: Handler<TokenRetrieveInfoResponse> =
            jsonHandler<TokenRetrieveInfoResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieveInfo(
            params: TokenRetrieveInfoParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TokenRetrieveInfoResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("token", "info")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveInfoHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
