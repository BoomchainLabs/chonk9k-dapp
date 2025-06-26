// File generated from our OpenAPI spec by Stainless.

package com.earn_app.api.models.staking

import com.earn_app.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class StakingVaultTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val stakingVault =
            StakingVault.builder()
                .id(0L)
                .active(true)
                .apr(0.0f)
                .description("description")
                .minLockPeriod(0L)
                .name("name")
                .addReward(
                    StakingVault.Reward.builder()
                        .id(0L)
                        .description("description")
                        .distribution(StakingVault.Reward.Distribution.DAILY)
                        .rate(0.0f)
                        .type(StakingVault.Reward.Type.TOKEN)
                        .build()
                )
                .totalStaked(0.0f)
                .build()

        assertThat(stakingVault.id()).isEqualTo(0L)
        assertThat(stakingVault.active()).isEqualTo(true)
        assertThat(stakingVault.apr()).isEqualTo(0.0f)
        assertThat(stakingVault.description()).isEqualTo("description")
        assertThat(stakingVault.minLockPeriod()).isEqualTo(0L)
        assertThat(stakingVault.name()).isEqualTo("name")
        assertThat(stakingVault.rewards())
            .containsExactly(
                StakingVault.Reward.builder()
                    .id(0L)
                    .description("description")
                    .distribution(StakingVault.Reward.Distribution.DAILY)
                    .rate(0.0f)
                    .type(StakingVault.Reward.Type.TOKEN)
                    .build()
            )
        assertThat(stakingVault.totalStaked()).isEqualTo(0.0f)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val stakingVault =
            StakingVault.builder()
                .id(0L)
                .active(true)
                .apr(0.0f)
                .description("description")
                .minLockPeriod(0L)
                .name("name")
                .addReward(
                    StakingVault.Reward.builder()
                        .id(0L)
                        .description("description")
                        .distribution(StakingVault.Reward.Distribution.DAILY)
                        .rate(0.0f)
                        .type(StakingVault.Reward.Type.TOKEN)
                        .build()
                )
                .totalStaked(0.0f)
                .build()

        val roundtrippedStakingVault =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(stakingVault),
                jacksonTypeRef<StakingVault>(),
            )

        assertThat(roundtrippedStakingVault).isEqualTo(stakingVault)
    }
}
