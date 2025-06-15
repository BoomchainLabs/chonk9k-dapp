// File generated from our OpenAPI spec by Stainless.

package com.earn_app.api.services.blocking

import com.earn_app.api.core.ClientOptions
import com.earn_app.api.core.RequestOptions
import com.earn_app.api.core.http.HttpResponseFor
import com.earn_app.api.models.stats.StatRetrieveParams
import com.earn_app.api.models.stats.StatRetrieveResponse
import com.google.errorprone.annotations.MustBeClosed

interface StatService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): StatService

    /** Retrieve overall platform statistics and metrics */
    fun retrieve(
        params: StatRetrieveParams = StatRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StatRetrieveResponse

    /** @see [retrieve] */
    fun retrieve(requestOptions: RequestOptions): StatRetrieveResponse =
        retrieve(StatRetrieveParams.none(), requestOptions)

    /** A view of [StatService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): StatService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /stats`, but is otherwise the same as
         * [StatService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: StatRetrieveParams = StatRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StatRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(requestOptions: RequestOptions): HttpResponseFor<StatRetrieveResponse> =
            retrieve(StatRetrieveParams.none(), requestOptions)
    }
}
