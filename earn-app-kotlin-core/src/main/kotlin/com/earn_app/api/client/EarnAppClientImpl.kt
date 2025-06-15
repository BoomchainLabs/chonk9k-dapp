// File generated from our OpenAPI spec by Stainless.

package com.earn_app.api.client

import com.earn_app.api.core.ClientOptions
import com.earn_app.api.core.getPackageVersion
import com.earn_app.api.services.blocking.MissionService
import com.earn_app.api.services.blocking.MissionServiceImpl
import com.earn_app.api.services.blocking.StakingService
import com.earn_app.api.services.blocking.StakingServiceImpl
import com.earn_app.api.services.blocking.StatService
import com.earn_app.api.services.blocking.StatServiceImpl
import com.earn_app.api.services.blocking.TokenService
import com.earn_app.api.services.blocking.TokenServiceImpl
import com.earn_app.api.services.blocking.UserService
import com.earn_app.api.services.blocking.UserServiceImpl

class EarnAppClientImpl(private val clientOptions: ClientOptions) : EarnAppClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Kotlin ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: EarnAppClientAsync by lazy { EarnAppClientAsyncImpl(clientOptions) }

    private val withRawResponse: EarnAppClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val users: UserService by lazy { UserServiceImpl(clientOptionsWithUserAgent) }

    private val missions: MissionService by lazy { MissionServiceImpl(clientOptionsWithUserAgent) }

    private val staking: StakingService by lazy { StakingServiceImpl(clientOptionsWithUserAgent) }

    private val stats: StatService by lazy { StatServiceImpl(clientOptionsWithUserAgent) }

    private val token: TokenService by lazy { TokenServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): EarnAppClientAsync = async

    override fun withRawResponse(): EarnAppClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EarnAppClient =
        EarnAppClientImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun users(): UserService = users

    override fun missions(): MissionService = missions

    override fun staking(): StakingService = staking

    override fun stats(): StatService = stats

    override fun token(): TokenService = token

    override fun close() = clientOptions.httpClient.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EarnAppClient.WithRawResponse {

        private val users: UserService.WithRawResponse by lazy {
            UserServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val missions: MissionService.WithRawResponse by lazy {
            MissionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val staking: StakingService.WithRawResponse by lazy {
            StakingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val stats: StatService.WithRawResponse by lazy {
            StatServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val token: TokenService.WithRawResponse by lazy {
            TokenServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): EarnAppClient.WithRawResponse =
            EarnAppClientImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        override fun users(): UserService.WithRawResponse = users

        override fun missions(): MissionService.WithRawResponse = missions

        override fun staking(): StakingService.WithRawResponse = staking

        override fun stats(): StatService.WithRawResponse = stats

        override fun token(): TokenService.WithRawResponse = token
    }
}
