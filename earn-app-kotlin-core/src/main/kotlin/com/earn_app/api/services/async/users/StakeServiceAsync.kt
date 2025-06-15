// File generated from our OpenAPI spec by Stainless.

package com.earn_app.api.services.async.users

import com.earn_app.api.core.ClientOptions
import com.earn_app.api.core.RequestOptions
import com.earn_app.api.core.http.HttpResponseFor
import com.earn_app.api.models.users.stakes.StakeCreateParams
import com.earn_app.api.models.users.stakes.StakeListParams
import com.earn_app.api.models.users.stakes.UserStake
import com.google.errorprone.annotations.MustBeClosed

interface StakeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): StakeServiceAsync

    /** Stake tokens in a vault */
    suspend fun create(
        userId: Long,
        params: StakeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserStake = create(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see [create] */
    suspend fun create(
        params: StakeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserStake

    /** Retrieve all staking positions for a specific user */
    suspend fun list(
        userId: Long,
        params: StakeListParams = StakeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<UserStake> = list(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see [list] */
    suspend fun list(
        params: StakeListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<UserStake>

    /** @see [list] */
    suspend fun list(userId: Long, requestOptions: RequestOptions): List<UserStake> =
        list(userId, StakeListParams.none(), requestOptions)

    /** A view of [StakeServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): StakeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /users/{userId}/stakes`, but is otherwise the same
         * as [StakeServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            userId: Long,
            params: StakeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserStake> =
            create(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see [create] */
        @MustBeClosed
        suspend fun create(
            params: StakeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserStake>

        /**
         * Returns a raw HTTP response for `get /users/{userId}/stakes`, but is otherwise the same
         * as [StakeServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            userId: Long,
            params: StakeListParams = StakeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<UserStake>> =
            list(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            params: StakeListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<UserStake>>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            userId: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<UserStake>> = list(userId, StakeListParams.none(), requestOptions)
    }
}
