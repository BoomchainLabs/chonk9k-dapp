// File generated from our OpenAPI spec by Stainless.

package com.earn_app.api.models.token

import com.earn_app.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TokenRetrieveInfoResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val tokenRetrieveInfoResponse =
            TokenRetrieveInfoResponse.builder()
                .address("address")
                .circulatingSupply(0.0f)
                .decimals(0L)
                .addListing(
                    TokenRetrieveInfoResponse.Listing.builder()
                        .exchange("exchange")
                        .pair("pair")
                        .url("https://example.com")
                        .build()
                )
                .marketCap(0.0f)
                .name("name")
                .price(0.0f)
                .priceChange24h(0.0f)
                .symbol("symbol")
                .totalSupply(0.0f)
                .volume24h(0.0f)
                .build()

        assertThat(tokenRetrieveInfoResponse.address()).isEqualTo("address")
        assertThat(tokenRetrieveInfoResponse.circulatingSupply()).isEqualTo(0.0f)
        assertThat(tokenRetrieveInfoResponse.decimals()).isEqualTo(0L)
        assertThat(tokenRetrieveInfoResponse.listings())
            .containsExactly(
                TokenRetrieveInfoResponse.Listing.builder()
                    .exchange("exchange")
                    .pair("pair")
                    .url("https://example.com")
                    .build()
            )
        assertThat(tokenRetrieveInfoResponse.marketCap()).isEqualTo(0.0f)
        assertThat(tokenRetrieveInfoResponse.name()).isEqualTo("name")
        assertThat(tokenRetrieveInfoResponse.price()).isEqualTo(0.0f)
        assertThat(tokenRetrieveInfoResponse.priceChange24h()).isEqualTo(0.0f)
        assertThat(tokenRetrieveInfoResponse.symbol()).isEqualTo("symbol")
        assertThat(tokenRetrieveInfoResponse.totalSupply()).isEqualTo(0.0f)
        assertThat(tokenRetrieveInfoResponse.volume24h()).isEqualTo(0.0f)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tokenRetrieveInfoResponse =
            TokenRetrieveInfoResponse.builder()
                .address("address")
                .circulatingSupply(0.0f)
                .decimals(0L)
                .addListing(
                    TokenRetrieveInfoResponse.Listing.builder()
                        .exchange("exchange")
                        .pair("pair")
                        .url("https://example.com")
                        .build()
                )
                .marketCap(0.0f)
                .name("name")
                .price(0.0f)
                .priceChange24h(0.0f)
                .symbol("symbol")
                .totalSupply(0.0f)
                .volume24h(0.0f)
                .build()

        val roundtrippedTokenRetrieveInfoResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tokenRetrieveInfoResponse),
                jacksonTypeRef<TokenRetrieveInfoResponse>(),
            )

        assertThat(roundtrippedTokenRetrieveInfoResponse).isEqualTo(tokenRetrieveInfoResponse)
    }
}
