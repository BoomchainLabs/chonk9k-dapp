// File generated from our OpenAPI spec by Stainless.

package com.earn_app.api.services.async.users

import com.earn_app.api.TestServerExtension
import com.earn_app.api.client.okhttp.EarnAppOkHttpClientAsync
import com.earn_app.api.models.users.stakes.StakeCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class StakeServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun create() {
        val client =
            EarnAppOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val stakeServiceAsync = client.users().stakes()

        val userStake =
            stakeServiceAsync.create(
                StakeCreateParams.builder()
                    .userId(0L)
                    .amount(0.0f)
                    .vaultId(0L)
                    .autoCompound(true)
                    .lockPeriod(0L)
                    .build()
            )

        userStake.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun list() {
        val client =
            EarnAppOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val stakeServiceAsync = client.users().stakes()

        val userStakes = stakeServiceAsync.list(0L)

        userStakes.forEach { it.validate() }
    }
}
