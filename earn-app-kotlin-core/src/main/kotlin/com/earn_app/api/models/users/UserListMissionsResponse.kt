// File generated from our OpenAPI spec by Stainless.

package com.earn_app.api.models.users

import com.earn_app.api.core.ExcludeMissing
import com.earn_app.api.core.JsonField
import com.earn_app.api.core.JsonMissing
import com.earn_app.api.core.JsonValue
import com.earn_app.api.errors.EarnAppInvalidDataException
import com.earn_app.api.models.missions.Mission
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class UserListMissionsResponse
private constructor(
    private val id: JsonField<Long>,
    private val claimed: JsonField<Boolean>,
    private val claimedAt: JsonField<OffsetDateTime>,
    private val completed: JsonField<Boolean>,
    private val completedAt: JsonField<OffsetDateTime>,
    private val mission: JsonField<Mission>,
    private val missionId: JsonField<Long>,
    private val progress: JsonField<Double>,
    private val userId: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("claimed") @ExcludeMissing claimed: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("claimedAt")
        @ExcludeMissing
        claimedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("completed") @ExcludeMissing completed: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("completedAt")
        @ExcludeMissing
        completedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("mission") @ExcludeMissing mission: JsonField<Mission> = JsonMissing.of(),
        @JsonProperty("missionId") @ExcludeMissing missionId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("progress") @ExcludeMissing progress: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("userId") @ExcludeMissing userId: JsonField<Long> = JsonMissing.of(),
    ) : this(
        id,
        claimed,
        claimedAt,
        completed,
        completedAt,
        mission,
        missionId,
        progress,
        userId,
        mutableMapOf(),
    )

    /**
     * Unique progress identifier
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Long? = id.getNullable("id")

    /**
     * Whether the reward has been claimed
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun claimed(): Boolean? = claimed.getNullable("claimed")

    /**
     * Reward claim timestamp
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun claimedAt(): OffsetDateTime? = claimedAt.getNullable("claimedAt")

    /**
     * Whether the mission is completed
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun completed(): Boolean? = completed.getNullable("completed")

    /**
     * Completion timestamp
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun completedAt(): OffsetDateTime? = completedAt.getNullable("completedAt")

    /**
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mission(): Mission? = mission.getNullable("mission")

    /**
     * Mission identifier
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun missionId(): Long? = missionId.getNullable("missionId")

    /**
     * Current progress percentage (0-100)
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun progress(): Double? = progress.getNullable("progress")

    /**
     * User identifier
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userId(): Long? = userId.getNullable("userId")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Long> = id

    /**
     * Returns the raw JSON value of [claimed].
     *
     * Unlike [claimed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("claimed") @ExcludeMissing fun _claimed(): JsonField<Boolean> = claimed

    /**
     * Returns the raw JSON value of [claimedAt].
     *
     * Unlike [claimedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("claimedAt")
    @ExcludeMissing
    fun _claimedAt(): JsonField<OffsetDateTime> = claimedAt

    /**
     * Returns the raw JSON value of [completed].
     *
     * Unlike [completed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("completed") @ExcludeMissing fun _completed(): JsonField<Boolean> = completed

    /**
     * Returns the raw JSON value of [completedAt].
     *
     * Unlike [completedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("completedAt")
    @ExcludeMissing
    fun _completedAt(): JsonField<OffsetDateTime> = completedAt

    /**
     * Returns the raw JSON value of [mission].
     *
     * Unlike [mission], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mission") @ExcludeMissing fun _mission(): JsonField<Mission> = mission

    /**
     * Returns the raw JSON value of [missionId].
     *
     * Unlike [missionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("missionId") @ExcludeMissing fun _missionId(): JsonField<Long> = missionId

    /**
     * Returns the raw JSON value of [progress].
     *
     * Unlike [progress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("progress") @ExcludeMissing fun _progress(): JsonField<Double> = progress

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("userId") @ExcludeMissing fun _userId(): JsonField<Long> = userId

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [UserListMissionsResponse]. */
        fun builder() = Builder()
    }

    /** A builder for [UserListMissionsResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<Long> = JsonMissing.of()
        private var claimed: JsonField<Boolean> = JsonMissing.of()
        private var claimedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var completed: JsonField<Boolean> = JsonMissing.of()
        private var completedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var mission: JsonField<Mission> = JsonMissing.of()
        private var missionId: JsonField<Long> = JsonMissing.of()
        private var progress: JsonField<Double> = JsonMissing.of()
        private var userId: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(userListMissionsResponse: UserListMissionsResponse) = apply {
            id = userListMissionsResponse.id
            claimed = userListMissionsResponse.claimed
            claimedAt = userListMissionsResponse.claimedAt
            completed = userListMissionsResponse.completed
            completedAt = userListMissionsResponse.completedAt
            mission = userListMissionsResponse.mission
            missionId = userListMissionsResponse.missionId
            progress = userListMissionsResponse.progress
            userId = userListMissionsResponse.userId
            additionalProperties = userListMissionsResponse.additionalProperties.toMutableMap()
        }

        /** Unique progress identifier */
        fun id(id: Long) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<Long>) = apply { this.id = id }

        /** Whether the reward has been claimed */
        fun claimed(claimed: Boolean) = claimed(JsonField.of(claimed))

        /**
         * Sets [Builder.claimed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.claimed] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun claimed(claimed: JsonField<Boolean>) = apply { this.claimed = claimed }

        /** Reward claim timestamp */
        fun claimedAt(claimedAt: OffsetDateTime) = claimedAt(JsonField.of(claimedAt))

        /**
         * Sets [Builder.claimedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.claimedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun claimedAt(claimedAt: JsonField<OffsetDateTime>) = apply { this.claimedAt = claimedAt }

        /** Whether the mission is completed */
        fun completed(completed: Boolean) = completed(JsonField.of(completed))

        /**
         * Sets [Builder.completed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.completed] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun completed(completed: JsonField<Boolean>) = apply { this.completed = completed }

        /** Completion timestamp */
        fun completedAt(completedAt: OffsetDateTime) = completedAt(JsonField.of(completedAt))

        /**
         * Sets [Builder.completedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.completedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun completedAt(completedAt: JsonField<OffsetDateTime>) = apply {
            this.completedAt = completedAt
        }

        fun mission(mission: Mission) = mission(JsonField.of(mission))

        /**
         * Sets [Builder.mission] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mission] with a well-typed [Mission] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mission(mission: JsonField<Mission>) = apply { this.mission = mission }

        /** Mission identifier */
        fun missionId(missionId: Long) = missionId(JsonField.of(missionId))

        /**
         * Sets [Builder.missionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.missionId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun missionId(missionId: JsonField<Long>) = apply { this.missionId = missionId }

        /** Current progress percentage (0-100) */
        fun progress(progress: Double) = progress(JsonField.of(progress))

        /**
         * Sets [Builder.progress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.progress] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun progress(progress: JsonField<Double>) = apply { this.progress = progress }

        /** User identifier */
        fun userId(userId: Long) = userId(JsonField.of(userId))

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<Long>) = apply { this.userId = userId }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [UserListMissionsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UserListMissionsResponse =
            UserListMissionsResponse(
                id,
                claimed,
                claimedAt,
                completed,
                completedAt,
                mission,
                missionId,
                progress,
                userId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): UserListMissionsResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        claimed()
        claimedAt()
        completed()
        completedAt()
        mission()?.validate()
        missionId()
        progress()
        userId()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: EarnAppInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (id.asKnown() == null) 0 else 1) +
            (if (claimed.asKnown() == null) 0 else 1) +
            (if (claimedAt.asKnown() == null) 0 else 1) +
            (if (completed.asKnown() == null) 0 else 1) +
            (if (completedAt.asKnown() == null) 0 else 1) +
            (mission.asKnown()?.validity() ?: 0) +
            (if (missionId.asKnown() == null) 0 else 1) +
            (if (progress.asKnown() == null) 0 else 1) +
            (if (userId.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is UserListMissionsResponse && id == other.id && claimed == other.claimed && claimedAt == other.claimedAt && completed == other.completed && completedAt == other.completedAt && mission == other.mission && missionId == other.missionId && progress == other.progress && userId == other.userId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, claimed, claimedAt, completed, completedAt, mission, missionId, progress, userId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UserListMissionsResponse{id=$id, claimed=$claimed, claimedAt=$claimedAt, completed=$completed, completedAt=$completedAt, mission=$mission, missionId=$missionId, progress=$progress, userId=$userId, additionalProperties=$additionalProperties}"
}
