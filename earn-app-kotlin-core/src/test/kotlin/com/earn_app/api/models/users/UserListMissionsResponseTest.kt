// File generated from our OpenAPI spec by Stainless.

package com.earn_app.api.models.users

import com.earn_app.api.core.jsonMapper
import com.earn_app.api.models.missions.Mission
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserListMissionsResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val userListMissionsResponse =
            UserListMissionsResponse.builder()
                .id(0L)
                .claimed(true)
                .claimedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .completed(true)
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .mission(
                    Mission.builder()
                        .id(0L)
                        .category("category")
                        .description("description")
                        .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .points(0L)
                        .addRequirement(
                            Mission.Requirement.builder()
                                .id(0L)
                                .description("description")
                                .target(0L)
                                .type(Mission.Requirement.Type.TRANSACTION)
                                .verificationMethod(
                                    Mission.Requirement.VerificationMethod.AUTOMATIC
                                )
                                .build()
                        )
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(Mission.Status.ACTIVE)
                        .title("title")
                        .tokenReward(0.0f)
                        .build()
                )
                .missionId(0L)
                .progress(0.0)
                .userId(0L)
                .build()

        assertThat(userListMissionsResponse.id()).isEqualTo(0L)
        assertThat(userListMissionsResponse.claimed()).isEqualTo(true)
        assertThat(userListMissionsResponse.claimedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(userListMissionsResponse.completed()).isEqualTo(true)
        assertThat(userListMissionsResponse.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(userListMissionsResponse.mission())
            .isEqualTo(
                Mission.builder()
                    .id(0L)
                    .category("category")
                    .description("description")
                    .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .points(0L)
                    .addRequirement(
                        Mission.Requirement.builder()
                            .id(0L)
                            .description("description")
                            .target(0L)
                            .type(Mission.Requirement.Type.TRANSACTION)
                            .verificationMethod(Mission.Requirement.VerificationMethod.AUTOMATIC)
                            .build()
                    )
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(Mission.Status.ACTIVE)
                    .title("title")
                    .tokenReward(0.0f)
                    .build()
            )
        assertThat(userListMissionsResponse.missionId()).isEqualTo(0L)
        assertThat(userListMissionsResponse.progress()).isEqualTo(0.0)
        assertThat(userListMissionsResponse.userId()).isEqualTo(0L)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userListMissionsResponse =
            UserListMissionsResponse.builder()
                .id(0L)
                .claimed(true)
                .claimedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .completed(true)
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .mission(
                    Mission.builder()
                        .id(0L)
                        .category("category")
                        .description("description")
                        .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .points(0L)
                        .addRequirement(
                            Mission.Requirement.builder()
                                .id(0L)
                                .description("description")
                                .target(0L)
                                .type(Mission.Requirement.Type.TRANSACTION)
                                .verificationMethod(
                                    Mission.Requirement.VerificationMethod.AUTOMATIC
                                )
                                .build()
                        )
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(Mission.Status.ACTIVE)
                        .title("title")
                        .tokenReward(0.0f)
                        .build()
                )
                .missionId(0L)
                .progress(0.0)
                .userId(0L)
                .build()

        val roundtrippedUserListMissionsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userListMissionsResponse),
                jacksonTypeRef<UserListMissionsResponse>(),
            )

        assertThat(roundtrippedUserListMissionsResponse).isEqualTo(userListMissionsResponse)
    }
}
