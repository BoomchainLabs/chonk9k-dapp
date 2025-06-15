// File generated from our OpenAPI spec by Stainless.

package com.earn_app.api.services.async

import com.earn_app.api.core.ClientOptions
import com.earn_app.api.core.RequestOptions
import com.earn_app.api.core.http.HttpResponseFor
import com.earn_app.api.models.token.TokenRetrieveInfoParams
import com.earn_app.api.models.token.TokenRetrieveInfoResponse
import com.google.errorprone.annotations.MustBeClosed

interface TokenServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TokenServiceAsync

    /** Retrieve current information about the $LERF token */
    suspend fun retrieveInfo(
        params: TokenRetrieveInfoParams = TokenRetrieveInfoParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TokenRetrieveInfoResponse

    /** @see [retrieveInfo] */
    suspend fun retrieveInfo(requestOptions: RequestOptions): TokenRetrieveInfoResponse =
        retrieveInfo(TokenRetrieveInfoParams.none(), requestOptions)

    /** A view of [TokenServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): TokenServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /token/info`, but is otherwise the same as
         * [TokenServiceAsync.retrieveInfo].
         */
        @MustBeClosed
        suspend fun retrieveInfo(
            params: TokenRetrieveInfoParams = TokenRetrieveInfoParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TokenRetrieveInfoResponse>

        /** @see [retrieveInfo] */
        @MustBeClosed
        suspend fun retrieveInfo(
            requestOptions: RequestOptions
        ): HttpResponseFor<TokenRetrieveInfoResponse> =
            retrieveInfo(TokenRetrieveInfoParams.none(), requestOptions)
    }
}
