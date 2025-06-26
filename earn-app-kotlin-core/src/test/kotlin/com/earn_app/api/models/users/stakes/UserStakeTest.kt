// File generated from our OpenAPI spec by Stainless.

package com.earn_app.api.models.users.stakes

import com.earn_app.api.core.jsonMapper
import com.earn_app.api.models.staking.StakingVault
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserStakeTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val userStake =
            UserStake.builder()
                .id(0L)
                .amount(0.0f)
                .autoCompound(true)
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lockPeriod(0L)
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(UserStake.Status.ACTIVE)
                .totalRewards(0.0f)
                .userId(0L)
                .vault(
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
                )
                .vaultId(0L)
                .build()

        assertThat(userStake.id()).isEqualTo(0L)
        assertThat(userStake.amount()).isEqualTo(0.0f)
        assertThat(userStake.autoCompound()).isEqualTo(true)
        assertThat(userStake.endDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(userStake.lockPeriod()).isEqualTo(0L)
        assertThat(userStake.startDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(userStake.status()).isEqualTo(UserStake.Status.ACTIVE)
        assertThat(userStake.totalRewards()).isEqualTo(0.0f)
        assertThat(userStake.userId()).isEqualTo(0L)
        assertThat(userStake.vault())
            .isEqualTo(
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
            )
        assertThat(userStake.vaultId()).isEqualTo(0L)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userStake =
            UserStake.builder()
                .id(0L)
                .amount(0.0f)
                .autoCompound(true)
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lockPeriod(0L)
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(UserStake.Status.ACTIVE)
                .totalRewards(0.0f)
                .userId(0L)
                .vault(
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
                )
                .vaultId(0L)
                .build()

        val roundtrippedUserStake =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userStake),
                jacksonTypeRef<UserStake>(),
            )

        assertThat(roundtrippedUserStake).isEqualTo(userStake)
    }
}
