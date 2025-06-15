// File generated from our OpenAPI spec by Stainless.

package com.earn_app.api.models.users.stakes

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class StakeListParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        StakeListParams.builder().userId(0L).build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun pathParams() {
        val params = StakeListParams.builder().userId(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
