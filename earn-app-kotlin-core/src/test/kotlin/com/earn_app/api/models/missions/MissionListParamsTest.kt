// File generated from our OpenAPI spec by Stainless.

package com.earn_app.api.models.missions

import com.earn_app.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MissionListParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        MissionListParams.builder()
            .category("category")
            .status(MissionListParams.Status.ACTIVE)
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            MissionListParams.builder()
                .category("category")
                .status(MissionListParams.Status.ACTIVE)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("category", "category").put("status", "active").build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = MissionListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
