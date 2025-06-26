// File generated from our OpenAPI spec by Stainless.

package com.earn_app.api.services.async

import com.earn_app.api.TestServerExtension
import com.earn_app.api.client.okhttp.EarnAppOkHttpClientAsync
import com.earn_app.api.models.missions.MissionListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MissionServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun retrieve() {
        val client =
            EarnAppOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val missionServiceAsync = client.missions()

        val mission = missionServiceAsync.retrieve(0L)

        mission.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun list() {
        val client =
            EarnAppOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val missionServiceAsync = client.missions()

        val missions =
            missionServiceAsync.list(
                MissionListParams.builder()
                    .category("category")
                    .status(MissionListParams.Status.ACTIVE)
                    .build()
            )

        missions.forEach { it.validate() }
    }
}
