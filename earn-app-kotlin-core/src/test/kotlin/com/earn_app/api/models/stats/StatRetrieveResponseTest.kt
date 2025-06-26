// File generated from our OpenAPI spec by Stainless.

package com.earn_app.api.models.stats

import com.earn_app.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class StatRetrieveResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val statRetrieveResponse =
            StatRetrieveResponse.builder()
                .activeMissions(0L)
                .activeQuests(0L)
                .dailyActiveUsers(0L)
                .monthlyActiveUsers(0L)
                .totalStaked(0.0f)
                .totalTokensDistributed(0.0f)
                .totalUsers(0L)
                .weeklyActiveUsers(0L)
                .build()

        assertThat(statRetrieveResponse.activeMissions()).isEqualTo(0L)
        assertThat(statRetrieveResponse.activeQuests()).isEqualTo(0L)
        assertThat(statRetrieveResponse.dailyActiveUsers()).isEqualTo(0L)
        assertThat(statRetrieveResponse.monthlyActiveUsers()).isEqualTo(0L)
        assertThat(statRetrieveResponse.totalStaked()).isEqualTo(0.0f)
        assertThat(statRetrieveResponse.totalTokensDistributed()).isEqualTo(0.0f)
        assertThat(statRetrieveResponse.totalUsers()).isEqualTo(0L)
        assertThat(statRetrieveResponse.weeklyActiveUsers()).isEqualTo(0L)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val statRetrieveResponse =
            StatRetrieveResponse.builder()
                .activeMissions(0L)
                .activeQuests(0L)
                .dailyActiveUsers(0L)
                .monthlyActiveUsers(0L)
                .totalStaked(0.0f)
                .totalTokensDistributed(0.0f)
                .totalUsers(0L)
                .weeklyActiveUsers(0L)
                .build()

        val roundtrippedStatRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(statRetrieveResponse),
                jacksonTypeRef<StatRetrieveResponse>(),
            )

        assertThat(roundtrippedStatRetrieveResponse).isEqualTo(statRetrieveResponse)
    }
}
