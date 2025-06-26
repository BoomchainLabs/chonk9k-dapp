// File generated from our OpenAPI spec by Stainless.

package com.earn_app.api.services.blocking

import com.earn_app.api.core.ClientOptions
import com.earn_app.api.core.RequestOptions
import com.earn_app.api.core.http.HttpResponseFor
import com.earn_app.api.models.token.TokenRetrieveInfoParams
import com.earn_app.api.models.token.TokenRetrieveInfoResponse
import com.google.errorprone.annotations.MustBeClosed

interface TokenService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TokenService

    /** Retrieve current information about the $LERF token */
    fun retrieveInfo(
        params: TokenRetrieveInfoParams = TokenRetrieveInfoParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TokenRetrieveInfoResponse

    /** @see [retrieveInfo] */
    fun retrieveInfo(requestOptions: RequestOptions): TokenRetrieveInfoResponse =
        retrieveInfo(TokenRetrieveInfoParams.none(), requestOptions)

    /** A view of [TokenService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TokenService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /token/info`, but is otherwise the same as
         * [TokenService.retrieveInfo].
         */
        @MustBeClosed
        fun retrieveInfo(
            params: TokenRetrieveInfoParams = TokenRetrieveInfoParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TokenRetrieveInfoResponse>

        /** @see [retrieveInfo] */
        @MustBeClosed
        fun retrieveInfo(
            requestOptions: RequestOptions
        ): HttpResponseFor<TokenRetrieveInfoResponse> =
            retrieveInfo(TokenRetrieveInfoParams.none(), requestOptions)
    }
}
