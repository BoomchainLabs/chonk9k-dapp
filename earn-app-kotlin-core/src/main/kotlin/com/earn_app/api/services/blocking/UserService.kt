// File generated from our OpenAPI spec by Stainless.

package com.earn_app.api.services.blocking

import com.earn_app.api.core.ClientOptions
import com.earn_app.api.core.RequestOptions
import com.earn_app.api.core.http.HttpResponseFor
import com.earn_app.api.models.users.User
import com.earn_app.api.models.users.UserCreateParams
import com.earn_app.api.models.users.UserListMissionsParams
import com.earn_app.api.models.users.UserListMissionsResponse
import com.earn_app.api.models.users.UserListReferralsParams
import com.earn_app.api.models.users.UserListReferralsResponse
import com.earn_app.api.models.users.UserRetrieveByWalletParams
import com.earn_app.api.services.blocking.users.StakeService
import com.google.errorprone.annotations.MustBeClosed

interface UserService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UserService

    fun stakes(): StakeService

    /** Register a new user in the system with their wallet address */
    fun create(
        params: UserCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): User

    /** Retrieve all missions for a specific user */
    fun listMissions(
        userId: Long,
        params: UserListMissionsParams = UserListMissionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<UserListMissionsResponse> =
        listMissions(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see [listMissions] */
    fun listMissions(
        params: UserListMissionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<UserListMissionsResponse>

    /** @see [listMissions] */
    fun listMissions(userId: Long, requestOptions: RequestOptions): List<UserListMissionsResponse> =
        listMissions(userId, UserListMissionsParams.none(), requestOptions)

    /** Retrieve all referrals made by a specific user */
    fun listReferrals(
        userId: Long,
        params: UserListReferralsParams = UserListReferralsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<UserListReferralsResponse> =
        listReferrals(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see [listReferrals] */
    fun listReferrals(
        params: UserListReferralsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<UserListReferralsResponse>

    /** @see [listReferrals] */
    fun listReferrals(
        userId: Long,
        requestOptions: RequestOptions,
    ): List<UserListReferralsResponse> =
        listReferrals(userId, UserListReferralsParams.none(), requestOptions)

    /** Retrieve user details by their blockchain wallet address */
    fun retrieveByWallet(
        address: String,
        params: UserRetrieveByWalletParams = UserRetrieveByWalletParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): User = retrieveByWallet(params.toBuilder().address(address).build(), requestOptions)

    /** @see [retrieveByWallet] */
    fun retrieveByWallet(
        params: UserRetrieveByWalletParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): User

    /** @see [retrieveByWallet] */
    fun retrieveByWallet(address: String, requestOptions: RequestOptions): User =
        retrieveByWallet(address, UserRetrieveByWalletParams.none(), requestOptions)

    /** A view of [UserService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UserService.WithRawResponse

        fun stakes(): StakeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /users`, but is otherwise the same as
         * [UserService.create].
         */
        @MustBeClosed
        fun create(
            params: UserCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<User>

        /**
         * Returns a raw HTTP response for `get /users/{userId}/missions`, but is otherwise the same
         * as [UserService.listMissions].
         */
        @MustBeClosed
        fun listMissions(
            userId: Long,
            params: UserListMissionsParams = UserListMissionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<UserListMissionsResponse>> =
            listMissions(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see [listMissions] */
        @MustBeClosed
        fun listMissions(
            params: UserListMissionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<UserListMissionsResponse>>

        /** @see [listMissions] */
        @MustBeClosed
        fun listMissions(
            userId: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<UserListMissionsResponse>> =
            listMissions(userId, UserListMissionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /users/{userId}/referrals`, but is otherwise the
         * same as [UserService.listReferrals].
         */
        @MustBeClosed
        fun listReferrals(
            userId: Long,
            params: UserListReferralsParams = UserListReferralsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<UserListReferralsResponse>> =
            listReferrals(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see [listReferrals] */
        @MustBeClosed
        fun listReferrals(
            params: UserListReferralsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<UserListReferralsResponse>>

        /** @see [listReferrals] */
        @MustBeClosed
        fun listReferrals(
            userId: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<UserListReferralsResponse>> =
            listReferrals(userId, UserListReferralsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /users/wallet/{address}`, but is otherwise the same
         * as [UserService.retrieveByWallet].
         */
        @MustBeClosed
        fun retrieveByWallet(
            address: String,
            params: UserRetrieveByWalletParams = UserRetrieveByWalletParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<User> =
            retrieveByWallet(params.toBuilder().address(address).build(), requestOptions)

        /** @see [retrieveByWallet] */
        @MustBeClosed
        fun retrieveByWallet(
            params: UserRetrieveByWalletParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<User>

        /** @see [retrieveByWallet] */
        @MustBeClosed
        fun retrieveByWallet(
            address: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<User> =
            retrieveByWallet(address, UserRetrieveByWalletParams.none(), requestOptions)
    }
}
