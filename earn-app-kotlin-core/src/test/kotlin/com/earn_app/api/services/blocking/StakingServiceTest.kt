// File generated from our OpenAPI spec by Stainless.

package com.earn_app.api.services.blocking

import com.earn_app.api.TestServerExtension
import com.earn_app.api.client.okhttp.EarnAppOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class StakingServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun listVaults() {
        val client =
            EarnAppOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val stakingService = client.staking()

        val stakingVaults = stakingService.listVaults()

        stakingVaults.forEach { it.validate() }
    }
}
