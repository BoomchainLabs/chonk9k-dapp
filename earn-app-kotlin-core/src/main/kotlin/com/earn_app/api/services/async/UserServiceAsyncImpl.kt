// File generated from our OpenAPI spec by Stainless.

package com.earn_app.api.services.async

import com.earn_app.api.core.ClientOptions
import com.earn_app.api.core.JsonValue
import com.earn_app.api.core.RequestOptions
import com.earn_app.api.core.checkRequired
import com.earn_app.api.core.handlers.errorHandler
import com.earn_app.api.core.handlers.jsonHandler
import com.earn_app.api.core.handlers.withErrorHandler
import com.earn_app.api.core.http.HttpMethod
import com.earn_app.api.core.http.HttpRequest
import com.earn_app.api.core.http.HttpResponse.Handler
import com.earn_app.api.core.http.HttpResponseFor
import com.earn_app.api.core.http.json
import com.earn_app.api.core.http.parseable
import com.earn_app.api.core.prepareAsync
import com.earn_app.api.models.users.User
import com.earn_app.api.models.users.UserCreateParams
import com.earn_app.api.models.users.UserListMissionsParams
import com.earn_app.api.models.users.UserListMissionsResponse
import com.earn_app.api.models.users.UserListReferralsParams
import com.earn_app.api.models.users.UserListReferralsResponse
import com.earn_app.api.models.users.UserRetrieveByWalletParams
import com.earn_app.api.services.async.users.StakeServiceAsync
import com.earn_app.api.services.async.users.StakeServiceAsyncImpl

class UserServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    UserServiceAsync {

    private val withRawResponse: UserServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val stakes: StakeServiceAsync by lazy { StakeServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): UserServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UserServiceAsync =
        UserServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun stakes(): StakeServiceAsync = stakes

    override suspend fun create(params: UserCreateParams, requestOptions: RequestOptions): User =
        // post /users
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun listMissions(
        params: UserListMissionsParams,
        requestOptions: RequestOptions,
    ): List<UserListMissionsResponse> =
        // get /users/{userId}/missions
        withRawResponse().listMissions(params, requestOptions).parse()

    override suspend fun listReferrals(
        params: UserListReferralsParams,
        requestOptions: RequestOptions,
    ): List<UserListReferralsResponse> =
        // get /users/{userId}/referrals
        withRawResponse().listReferrals(params, requestOptions).parse()

    override suspend fun retrieveByWallet(
        params: UserRetrieveByWalletParams,
        requestOptions: RequestOptions,
    ): User =
        // get /users/wallet/{address}
        withRawResponse().retrieveByWallet(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UserServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val stakes: StakeServiceAsync.WithRawResponse by lazy {
            StakeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): UserServiceAsync.WithRawResponse =
            UserServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun stakes(): StakeServiceAsync.WithRawResponse = stakes

        private val createHandler: Handler<User> =
            jsonHandler<User>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun create(
            params: UserCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<User> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("users")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listMissionsHandler: Handler<List<UserListMissionsResponse>> =
            jsonHandler<List<UserListMissionsResponse>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun listMissions(
            params: UserListMissionsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<UserListMissionsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("users", params._pathParam(0), "missions")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { listMissionsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val listReferralsHandler: Handler<List<UserListReferralsResponse>> =
            jsonHandler<List<UserListReferralsResponse>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun listReferrals(
            params: UserListReferralsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<UserListReferralsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("users", params._pathParam(0), "referrals")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { listReferralsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val retrieveByWalletHandler: Handler<User> =
            jsonHandler<User>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun retrieveByWallet(
            params: UserRetrieveByWalletParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<User> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("address", params.address())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("users", "wallet", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveByWalletHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
