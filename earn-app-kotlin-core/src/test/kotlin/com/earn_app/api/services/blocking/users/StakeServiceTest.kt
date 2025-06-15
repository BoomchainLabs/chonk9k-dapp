// File generated from our OpenAPI spec by Stainless.

package com.earn_app.api.services.blocking.users

import com.earn_app.api.TestServerExtension
import com.earn_app.api.client.okhttp.EarnAppOkHttpClient
import com.earn_app.api.models.users.stakes.StakeCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class StakeServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            EarnAppOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val stakeService = client.users().stakes()

        val userStake =
            stakeService.create(
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
    fun list() {
        val client =
            EarnAppOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val stakeService = client.users().stakes()

        val userStakes = stakeService.list(0L)

        userStakes.forEach { it.validate() }
    }
}
