// File generated from our OpenAPI spec by Stainless.

package com.earn_app.api.services.blocking

import com.earn_app.api.core.ClientOptions
import com.earn_app.api.core.RequestOptions
import com.earn_app.api.core.http.HttpResponseFor
import com.earn_app.api.models.staking.StakingListVaultsParams
import com.earn_app.api.models.staking.StakingVault
import com.google.errorprone.annotations.MustBeClosed

interface StakingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): StakingService

    /** Retrieve all available staking vaults */
    fun listVaults(
        params: StakingListVaultsParams = StakingListVaultsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<StakingVault>

    /** @see [listVaults] */
    fun listVaults(requestOptions: RequestOptions): List<StakingVault> =
        listVaults(StakingListVaultsParams.none(), requestOptions)

    /** A view of [StakingService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): StakingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /staking/vaults`, but is otherwise the same as
         * [StakingService.listVaults].
         */
        @MustBeClosed
        fun listVaults(
            params: StakingListVaultsParams = StakingListVaultsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<StakingVault>>

        /** @see [listVaults] */
        @MustBeClosed
        fun listVaults(requestOptions: RequestOptions): HttpResponseFor<List<StakingVault>> =
            listVaults(StakingListVaultsParams.none(), requestOptions)
    }
}
