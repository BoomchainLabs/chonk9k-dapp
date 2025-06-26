// File generated from our OpenAPI spec by Stainless.

package com.earn_app.api.services.async

import com.earn_app.api.core.ClientOptions
import com.earn_app.api.core.RequestOptions
import com.earn_app.api.core.http.HttpResponseFor
import com.earn_app.api.models.stats.StatRetrieveParams
import com.earn_app.api.models.stats.StatRetrieveResponse
import com.google.errorprone.annotations.MustBeClosed

interface StatServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): StatServiceAsync

    /** Retrieve overall platform statistics and metrics */
    suspend fun retrieve(
        params: StatRetrieveParams = StatRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StatRetrieveResponse

    /** @see [retrieve] */
    suspend fun retrieve(requestOptions: RequestOptions): StatRetrieveResponse =
        retrieve(StatRetrieveParams.none(), requestOptions)

    /** A view of [StatServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): StatServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /stats`, but is otherwise the same as
         * [StatServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: StatRetrieveParams = StatRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StatRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            requestOptions: RequestOptions
        ): HttpResponseFor<StatRetrieveResponse> =
            retrieve(StatRetrieveParams.none(), requestOptions)
    }
}
