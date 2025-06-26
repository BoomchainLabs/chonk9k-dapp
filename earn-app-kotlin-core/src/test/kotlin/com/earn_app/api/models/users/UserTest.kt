// File generated from our OpenAPI spec by Stainless.

package com.earn_app.api.models.users

import com.earn_app.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val user =
            User.builder()
                .id(0L)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .email("dev@stainless.com")
                .level(0L)
                .referralCode("referralCode")
                .totalPoints(0L)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .username("username")
                .walletAddress("walletAddress")
                .build()

        assertThat(user.id()).isEqualTo(0L)
        assertThat(user.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(user.email()).isEqualTo("dev@stainless.com")
        assertThat(user.level()).isEqualTo(0L)
        assertThat(user.referralCode()).isEqualTo("referralCode")
        assertThat(user.totalPoints()).isEqualTo(0L)
        assertThat(user.updatedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(user.username()).isEqualTo("username")
        assertThat(user.walletAddress()).isEqualTo("walletAddress")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val user =
            User.builder()
                .id(0L)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .email("dev@stainless.com")
                .level(0L)
                .referralCode("referralCode")
                .totalPoints(0L)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .username("username")
                .walletAddress("walletAddress")
                .build()

        val roundtrippedUser =
            jsonMapper.readValue(jsonMapper.writeValueAsString(user), jacksonTypeRef<User>())

        assertThat(roundtrippedUser).isEqualTo(user)
    }
}
