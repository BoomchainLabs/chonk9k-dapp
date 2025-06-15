// File generated from our OpenAPI spec by Stainless.

package com.earn_app.api.models.missions

import com.earn_app.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MissionTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val mission =
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

        assertThat(mission.id()).isEqualTo(0L)
        assertThat(mission.category()).isEqualTo("category")
        assertThat(mission.description()).isEqualTo("description")
        assertThat(mission.endDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(mission.points()).isEqualTo(0L)
        assertThat(mission.requirements())
            .containsExactly(
                Mission.Requirement.builder()
                    .id(0L)
                    .description("description")
                    .target(0L)
                    .type(Mission.Requirement.Type.TRANSACTION)
                    .verificationMethod(Mission.Requirement.VerificationMethod.AUTOMATIC)
                    .build()
            )
        assertThat(mission.startDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(mission.status()).isEqualTo(Mission.Status.ACTIVE)
        assertThat(mission.title()).isEqualTo("title")
        assertThat(mission.tokenReward()).isEqualTo(0.0f)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mission =
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

        val roundtrippedMission =
            jsonMapper.readValue(jsonMapper.writeValueAsString(mission), jacksonTypeRef<Mission>())

        assertThat(roundtrippedMission).isEqualTo(mission)
    }
}
