// File generated from our OpenAPI spec by Stainless.

package com.earn_app.api.services.blocking

import com.earn_app.api.TestServerExtension
import com.earn_app.api.client.okhttp.EarnAppOkHttpClient
import com.earn_app.api.models.missions.MissionListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MissionServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            EarnAppOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val missionService = client.missions()

        val mission = missionService.retrieve(0L)

        mission.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
        val client =
            EarnAppOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val missionService = client.missions()

        val missions =
            missionService.list(
                MissionListParams.builder()
                    .category("category")
                    .status(MissionListParams.Status.ACTIVE)
                    .build()
            )

        missions.forEach { it.validate() }
    }
}
