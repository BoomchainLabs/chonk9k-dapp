// File generated from our OpenAPI spec by Stainless.

package com.earn_app.api.services.async

import com.earn_app.api.TestServerExtension
import com.earn_app.api.client.okhttp.EarnAppOkHttpClientAsync
import com.earn_app.api.models.users.UserCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UserServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun create() {
        val client =
            EarnAppOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userServiceAsync = client.users()

        val user =
            userServiceAsync.create(
                UserCreateParams.builder()
                    .walletAddress("walletAddress")
                    .email("dev@stainless.com")
                    .referralCode("referralCode")
                    .username("username")
                    .build()
            )

        user.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun listMissions() {
        val client =
            EarnAppOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userServiceAsync = client.users()

        val response = userServiceAsync.listMissions(0L)

        response.forEach { it.validate() }
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun listReferrals() {
        val client =
            EarnAppOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userServiceAsync = client.users()

        val response = userServiceAsync.listReferrals(0L)

        response.forEach { it.validate() }
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun retrieveByWallet() {
        val client =
            EarnAppOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userServiceAsync = client.users()

        val user = userServiceAsync.retrieveByWallet("address")

        user.validate()
    }
}
