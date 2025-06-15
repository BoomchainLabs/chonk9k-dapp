// File generated from our OpenAPI spec by Stainless.

package com.earn_app.api.models.users

import com.earn_app.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserListReferralsResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val userListReferralsResponse =
            UserListReferralsResponse.builder()
                .id(0L)
                .code("code")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .referee(
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
                )
                .refereeId(0L)
                .referrerId(0L)
                .rewardAmount(0.0f)
                .rewardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(UserListReferralsResponse.Status.PENDING)
                .build()

        assertThat(userListReferralsResponse.id()).isEqualTo(0L)
        assertThat(userListReferralsResponse.code()).isEqualTo("code")
        assertThat(userListReferralsResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(userListReferralsResponse.referee())
            .isEqualTo(
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
            )
        assertThat(userListReferralsResponse.refereeId()).isEqualTo(0L)
        assertThat(userListReferralsResponse.referrerId()).isEqualTo(0L)
        assertThat(userListReferralsResponse.rewardAmount()).isEqualTo(0.0f)
        assertThat(userListReferralsResponse.rewardedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(userListReferralsResponse.status())
            .isEqualTo(UserListReferralsResponse.Status.PENDING)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userListReferralsResponse =
            UserListReferralsResponse.builder()
                .id(0L)
                .code("code")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .referee(
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
                )
                .refereeId(0L)
                .referrerId(0L)
                .rewardAmount(0.0f)
                .rewardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(UserListReferralsResponse.Status.PENDING)
                .build()

        val roundtrippedUserListReferralsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userListReferralsResponse),
                jacksonTypeRef<UserListReferralsResponse>(),
            )

        assertThat(roundtrippedUserListReferralsResponse).isEqualTo(userListReferralsResponse)
    }
}
