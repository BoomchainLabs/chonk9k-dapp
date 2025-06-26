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
import com.earn_app.api.models.staking.StakingListVaultsParams
import com.earn_app.api.models.staking.StakingVault

class StakingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    StakingService {

    private val withRawResponse: StakingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): StakingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): StakingService =
        StakingServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun listVaults(
        params: StakingListVaultsParams,
        requestOptions: RequestOptions,
    ): List<StakingVault> =
        // get /staking/vaults
        withRawResponse().listVaults(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StakingService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): StakingService.WithRawResponse =
            StakingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val listVaultsHandler: Handler<List<StakingVault>> =
            jsonHandler<List<StakingVault>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun listVaults(
            params: StakingListVaultsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<StakingVault>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("staking", "vaults")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listVaultsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }
    }
}
