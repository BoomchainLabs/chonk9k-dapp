// File generated from our OpenAPI spec by Stainless.

package com.earn_app.api.models.users

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserRetrieveByWalletParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        UserRetrieveByWalletParams.builder().address("address").build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun pathParams() {
        val params = UserRetrieveByWalletParams.builder().address("address").build()

        assertThat(params._pathParam(0)).isEqualTo("address")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
