// File generated from our OpenAPI spec by Stainless.

package com.earn_app.api.client

import com.earn_app.api.core.ClientOptions
import com.earn_app.api.core.getPackageVersion
import com.earn_app.api.services.async.MissionServiceAsync
import com.earn_app.api.services.async.MissionServiceAsyncImpl
import com.earn_app.api.services.async.StakingServiceAsync
import com.earn_app.api.services.async.StakingServiceAsyncImpl
import com.earn_app.api.services.async.StatServiceAsync
import com.earn_app.api.services.async.StatServiceAsyncImpl
import com.earn_app.api.services.async.TokenServiceAsync
import com.earn_app.api.services.async.TokenServiceAsyncImpl
import com.earn_app.api.services.async.UserServiceAsync
import com.earn_app.api.services.async.UserServiceAsyncImpl

class EarnAppClientAsyncImpl(private val clientOptions: ClientOptions) : EarnAppClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Kotlin ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: EarnAppClient by lazy { EarnAppClientImpl(clientOptions) }

    private val withRawResponse: EarnAppClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val users: UserServiceAsync by lazy { UserServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val missions: MissionServiceAsync by lazy {
        MissionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val staking: StakingServiceAsync by lazy {
        StakingServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val stats: StatServiceAsync by lazy { StatServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val token: TokenServiceAsync by lazy {
        TokenServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): EarnAppClient = sync

    override fun withRawResponse(): EarnAppClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EarnAppClientAsync =
        EarnAppClientAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun users(): UserServiceAsync = users

    override fun missions(): MissionServiceAsync = missions

    override fun staking(): StakingServiceAsync = staking

    override fun stats(): StatServiceAsync = stats

    override fun token(): TokenServiceAsync = token

    override fun close() = clientOptions.httpClient.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EarnAppClientAsync.WithRawResponse {

        private val users: UserServiceAsync.WithRawResponse by lazy {
            UserServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val missions: MissionServiceAsync.WithRawResponse by lazy {
            MissionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val staking: StakingServiceAsync.WithRawResponse by lazy {
            StakingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val stats: StatServiceAsync.WithRawResponse by lazy {
            StatServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val token: TokenServiceAsync.WithRawResponse by lazy {
            TokenServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): EarnAppClientAsync.WithRawResponse =
            EarnAppClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun users(): UserServiceAsync.WithRawResponse = users

        override fun missions(): MissionServiceAsync.WithRawResponse = missions

        override fun staking(): StakingServiceAsync.WithRawResponse = staking

        override fun stats(): StatServiceAsync.WithRawResponse = stats

        override fun token(): TokenServiceAsync.WithRawResponse = token
    }
}
