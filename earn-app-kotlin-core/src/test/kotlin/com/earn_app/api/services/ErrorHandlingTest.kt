// File generated from our OpenAPI spec by Stainless.

package com.earn_app.api.services

import com.earn_app.api.client.EarnAppClient
import com.earn_app.api.client.okhttp.EarnAppOkHttpClient
import com.earn_app.api.core.JsonValue
import com.earn_app.api.core.http.Headers
import com.earn_app.api.core.jsonMapper
import com.earn_app.api.errors.BadRequestException
import com.earn_app.api.errors.EarnAppException
import com.earn_app.api.errors.InternalServerException
import com.earn_app.api.errors.NotFoundException
import com.earn_app.api.errors.PermissionDeniedException
import com.earn_app.api.errors.RateLimitException
import com.earn_app.api.errors.UnauthorizedException
import com.earn_app.api.errors.UnexpectedStatusCodeException
import com.earn_app.api.errors.UnprocessableEntityException
import com.earn_app.api.models.users.UserCreateParams
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.entry
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ErrorHandlingTest {

    companion object {

        private val ERROR_JSON: JsonValue = JsonValue.from(mapOf("errorProperty" to "42"))

        private val ERROR_JSON_BYTES: ByteArray = jsonMapper().writeValueAsBytes(ERROR_JSON)

        private const val HEADER_NAME: String = "Error-Header"

        private const val HEADER_VALUE: String = "42"

        private const val NOT_JSON: String = "Not JSON"
    }

    private lateinit var client: EarnAppClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            EarnAppOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun usersCreate400() {
        val userService = client.users()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                userService.create(
                    UserCreateParams.builder()
                        .walletAddress("walletAddress")
                        .email("dev@stainless.com")
                        .referralCode("referralCode")
                        .username("username")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun usersCreate401() {
        val userService = client.users()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                userService.create(
                    UserCreateParams.builder()
                        .walletAddress("walletAddress")
                        .email("dev@stainless.com")
                        .referralCode("referralCode")
                        .username("username")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun usersCreate403() {
        val userService = client.users()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                userService.create(
                    UserCreateParams.builder()
                        .walletAddress("walletAddress")
                        .email("dev@stainless.com")
                        .referralCode("referralCode")
                        .username("username")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun usersCreate404() {
        val userService = client.users()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                userService.create(
                    UserCreateParams.builder()
                        .walletAddress("walletAddress")
                        .email("dev@stainless.com")
                        .referralCode("referralCode")
                        .username("username")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun usersCreate422() {
        val userService = client.users()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                userService.create(
                    UserCreateParams.builder()
                        .walletAddress("walletAddress")
                        .email("dev@stainless.com")
                        .referralCode("referralCode")
                        .username("username")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun usersCreate429() {
        val userService = client.users()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                userService.create(
                    UserCreateParams.builder()
                        .walletAddress("walletAddress")
                        .email("dev@stainless.com")
                        .referralCode("referralCode")
                        .username("username")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun usersCreate500() {
        val userService = client.users()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                userService.create(
                    UserCreateParams.builder()
                        .walletAddress("walletAddress")
                        .email("dev@stainless.com")
                        .referralCode("referralCode")
                        .username("username")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun usersCreate999() {
        val userService = client.users()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                userService.create(
                    UserCreateParams.builder()
                        .walletAddress("walletAddress")
                        .email("dev@stainless.com")
                        .referralCode("referralCode")
                        .username("username")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun usersCreateInvalidJsonBody() {
        val userService = client.users()
        stubFor(
            post(anyUrl())
                .willReturn(status(200).withHeader(HEADER_NAME, HEADER_VALUE).withBody(NOT_JSON))
        )

        val e =
            assertThrows<EarnAppException> {
                userService.create(
                    UserCreateParams.builder()
                        .walletAddress("walletAddress")
                        .email("dev@stainless.com")
                        .referralCode("referralCode")
                        .username("username")
                        .build()
                )
            }

        assertThat(e).hasMessage("Error reading response")
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
