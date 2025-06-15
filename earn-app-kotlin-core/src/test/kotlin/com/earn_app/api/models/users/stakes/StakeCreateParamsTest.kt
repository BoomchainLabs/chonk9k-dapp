// File generated from our OpenAPI spec by Stainless.

package com.earn_app.api.models.users.stakes

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class StakeCreateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        StakeCreateParams.builder()
            .userId(0L)
            .amount(0.0f)
            .vaultId(0L)
            .autoCompound(true)
            .lockPeriod(0L)
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun pathParams() {
        val params = StakeCreateParams.builder().userId(0L).amount(0.0f).vaultId(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            StakeCreateParams.builder()
                .userId(0L)
                .amount(0.0f)
                .vaultId(0L)
                .autoCompound(true)
                .lockPeriod(0L)
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(0.0f)
        assertThat(body.vaultId()).isEqualTo(0L)
        assertThat(body.autoCompound()).isEqualTo(true)
        assertThat(body.lockPeriod()).isEqualTo(0L)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params = StakeCreateParams.builder().userId(0L).amount(0.0f).vaultId(0L).build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(0.0f)
        assertThat(body.vaultId()).isEqualTo(0L)
    }
}
