// File generated from our OpenAPI spec by Stainless.

package com.earn_app.api.services.blocking

import com.earn_app.api.core.ClientOptions
import com.earn_app.api.core.RequestOptions
import com.earn_app.api.core.http.HttpResponseFor
import com.earn_app.api.models.missions.Mission
import com.earn_app.api.models.missions.MissionListParams
import com.earn_app.api.models.missions.MissionRetrieveParams
import com.google.errorprone.annotations.MustBeClosed

interface MissionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): MissionService

    /** Retrieve detailed information about a specific mission */
    fun retrieve(
        id: Long,
        params: MissionRetrieveParams = MissionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Mission = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        params: MissionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Mission

    /** @see [retrieve] */
    fun retrieve(id: Long, requestOptions: RequestOptions): Mission =
        retrieve(id, MissionRetrieveParams.none(), requestOptions)

    /** Retrieve the list of all available missions */
    fun list(
        params: MissionListParams = MissionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Mission>

    /** @see [list] */
    fun list(requestOptions: RequestOptions): List<Mission> =
        list(MissionListParams.none(), requestOptions)

    /** A view of [MissionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): MissionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /missions/{id}`, but is otherwise the same as
         * [MissionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: Long,
            params: MissionRetrieveParams = MissionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Mission> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: MissionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Mission>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(id: Long, requestOptions: RequestOptions): HttpResponseFor<Mission> =
            retrieve(id, MissionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /missions`, but is otherwise the same as
         * [MissionService.list].
         */
        @MustBeClosed
        fun list(
            params: MissionListParams = MissionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Mission>>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<Mission>> =
            list(MissionListParams.none(), requestOptions)
    }
}
