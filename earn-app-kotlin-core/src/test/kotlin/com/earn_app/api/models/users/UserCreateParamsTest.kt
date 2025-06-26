// File generated from our OpenAPI spec by Stainless.

package com.earn_app.api.models.users

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserCreateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        UserCreateParams.builder()
            .walletAddress("walletAddress")
            .email("dev@stainless.com")
            .referralCode("referralCode")
            .username("username")
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            UserCreateParams.builder()
                .walletAddress("walletAddress")
                .email("dev@stainless.com")
                .referralCode("referralCode")
                .username("username")
                .build()

        val body = params._body()

        assertThat(body.walletAddress()).isEqualTo("walletAddress")
        assertThat(body.email()).isEqualTo("dev@stainless.com")
        assertThat(body.referralCode()).isEqualTo("referralCode")
        assertThat(body.username()).isEqualTo("username")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params = UserCreateParams.builder().walletAddress("walletAddress").build()

        val body = params._body()

        assertThat(body.walletAddress()).isEqualTo("walletAddress")
    }
}
