// File generated from our OpenAPI spec by Stainless.

package com.earn_app.api.models.stats

import com.earn_app.api.core.ExcludeMissing
import com.earn_app.api.core.JsonField
import com.earn_app.api.core.JsonMissing
import com.earn_app.api.core.JsonValue
import com.earn_app.api.errors.EarnAppInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

class StatRetrieveResponse
private constructor(
    private val activeMissions: JsonField<Long>,
    private val activeQuests: JsonField<Long>,
    private val dailyActiveUsers: JsonField<Long>,
    private val monthlyActiveUsers: JsonField<Long>,
    private val totalStaked: JsonField<Float>,
    private val totalTokensDistributed: JsonField<Float>,
    private val totalUsers: JsonField<Long>,
    private val weeklyActiveUsers: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("activeMissions")
        @ExcludeMissing
        activeMissions: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("activeQuests")
        @ExcludeMissing
        activeQuests: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("dailyActiveUsers")
        @ExcludeMissing
        dailyActiveUsers: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("monthlyActiveUsers")
        @ExcludeMissing
        monthlyActiveUsers: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("totalStaked")
        @ExcludeMissing
        totalStaked: JsonField<Float> = JsonMissing.of(),
        @JsonProperty("totalTokensDistributed")
        @ExcludeMissing
        totalTokensDistributed: JsonField<Float> = JsonMissing.of(),
        @JsonProperty("totalUsers") @ExcludeMissing totalUsers: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("weeklyActiveUsers")
        @ExcludeMissing
        weeklyActiveUsers: JsonField<Long> = JsonMissing.of(),
    ) : this(
        activeMissions,
        activeQuests,
        dailyActiveUsers,
        monthlyActiveUsers,
        totalStaked,
        totalTokensDistributed,
        totalUsers,
        weeklyActiveUsers,
        mutableMapOf(),
    )

    /**
     * Number of active missions
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun activeMissions(): Long? = activeMissions.getNullable("activeMissions")

    /**
     * Number of active quests
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun activeQuests(): Long? = activeQuests.getNullable("activeQuests")

    /**
     * Daily active users
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dailyActiveUsers(): Long? = dailyActiveUsers.getNullable("dailyActiveUsers")

    /**
     * Monthly active users
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun monthlyActiveUsers(): Long? = monthlyActiveUsers.getNullable("monthlyActiveUsers")

    /**
     * Total amount staked across all vaults
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalStaked(): Float? = totalStaked.getNullable("totalStaked")

    /**
     * Total tokens distributed as rewards
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalTokensDistributed(): Float? =
        totalTokensDistributed.getNullable("totalTokensDistributed")

    /**
     * Total number of users
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalUsers(): Long? = totalUsers.getNullable("totalUsers")

    /**
     * Weekly active users
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun weeklyActiveUsers(): Long? = weeklyActiveUsers.getNullable("weeklyActiveUsers")

    /**
     * Returns the raw JSON value of [activeMissions].
     *
     * Unlike [activeMissions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("activeMissions")
    @ExcludeMissing
    fun _activeMissions(): JsonField<Long> = activeMissions

    /**
     * Returns the raw JSON value of [activeQuests].
     *
     * Unlike [activeQuests], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("activeQuests")
    @ExcludeMissing
    fun _activeQuests(): JsonField<Long> = activeQuests

    /**
     * Returns the raw JSON value of [dailyActiveUsers].
     *
     * Unlike [dailyActiveUsers], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("dailyActiveUsers")
    @ExcludeMissing
    fun _dailyActiveUsers(): JsonField<Long> = dailyActiveUsers

    /**
     * Returns the raw JSON value of [monthlyActiveUsers].
     *
     * Unlike [monthlyActiveUsers], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("monthlyActiveUsers")
    @ExcludeMissing
    fun _monthlyActiveUsers(): JsonField<Long> = monthlyActiveUsers

    /**
     * Returns the raw JSON value of [totalStaked].
     *
     * Unlike [totalStaked], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("totalStaked") @ExcludeMissing fun _totalStaked(): JsonField<Float> = totalStaked

    /**
     * Returns the raw JSON value of [totalTokensDistributed].
     *
     * Unlike [totalTokensDistributed], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("totalTokensDistributed")
    @ExcludeMissing
    fun _totalTokensDistributed(): JsonField<Float> = totalTokensDistributed

    /**
     * Returns the raw JSON value of [totalUsers].
     *
     * Unlike [totalUsers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("totalUsers") @ExcludeMissing fun _totalUsers(): JsonField<Long> = totalUsers

    /**
     * Returns the raw JSON value of [weeklyActiveUsers].
     *
     * Unlike [weeklyActiveUsers], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("weeklyActiveUsers")
    @ExcludeMissing
    fun _weeklyActiveUsers(): JsonField<Long> = weeklyActiveUsers

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

        /** Returns a mutable builder for constructing an instance of [StatRetrieveResponse]. */
        fun builder() = Builder()
    }

    /** A builder for [StatRetrieveResponse]. */
    class Builder internal constructor() {

        private var activeMissions: JsonField<Long> = JsonMissing.of()
        private var activeQuests: JsonField<Long> = JsonMissing.of()
        private var dailyActiveUsers: JsonField<Long> = JsonMissing.of()
        private var monthlyActiveUsers: JsonField<Long> = JsonMissing.of()
        private var totalStaked: JsonField<Float> = JsonMissing.of()
        private var totalTokensDistributed: JsonField<Float> = JsonMissing.of()
        private var totalUsers: JsonField<Long> = JsonMissing.of()
        private var weeklyActiveUsers: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(statRetrieveResponse: StatRetrieveResponse) = apply {
            activeMissions = statRetrieveResponse.activeMissions
            activeQuests = statRetrieveResponse.activeQuests
            dailyActiveUsers = statRetrieveResponse.dailyActiveUsers
            monthlyActiveUsers = statRetrieveResponse.monthlyActiveUsers
            totalStaked = statRetrieveResponse.totalStaked
            totalTokensDistributed = statRetrieveResponse.totalTokensDistributed
            totalUsers = statRetrieveResponse.totalUsers
            weeklyActiveUsers = statRetrieveResponse.weeklyActiveUsers
            additionalProperties = statRetrieveResponse.additionalProperties.toMutableMap()
        }

        /** Number of active missions */
        fun activeMissions(activeMissions: Long) = activeMissions(JsonField.of(activeMissions))

        /**
         * Sets [Builder.activeMissions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.activeMissions] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun activeMissions(activeMissions: JsonField<Long>) = apply {
            this.activeMissions = activeMissions
        }

        /** Number of active quests */
        fun activeQuests(activeQuests: Long) = activeQuests(JsonField.of(activeQuests))

        /**
         * Sets [Builder.activeQuests] to an arbitrary JSON value.
         *
         * You should usually call [Builder.activeQuests] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun activeQuests(activeQuests: JsonField<Long>) = apply { this.activeQuests = activeQuests }

        /** Daily active users */
        fun dailyActiveUsers(dailyActiveUsers: Long) =
            dailyActiveUsers(JsonField.of(dailyActiveUsers))

        /**
         * Sets [Builder.dailyActiveUsers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dailyActiveUsers] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dailyActiveUsers(dailyActiveUsers: JsonField<Long>) = apply {
            this.dailyActiveUsers = dailyActiveUsers
        }

        /** Monthly active users */
        fun monthlyActiveUsers(monthlyActiveUsers: Long) =
            monthlyActiveUsers(JsonField.of(monthlyActiveUsers))

        /**
         * Sets [Builder.monthlyActiveUsers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.monthlyActiveUsers] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun monthlyActiveUsers(monthlyActiveUsers: JsonField<Long>) = apply {
            this.monthlyActiveUsers = monthlyActiveUsers
        }

        /** Total amount staked across all vaults */
        fun totalStaked(totalStaked: Float) = totalStaked(JsonField.of(totalStaked))

        /**
         * Sets [Builder.totalStaked] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalStaked] with a well-typed [Float] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalStaked(totalStaked: JsonField<Float>) = apply { this.totalStaked = totalStaked }

        /** Total tokens distributed as rewards */
        fun totalTokensDistributed(totalTokensDistributed: Float) =
            totalTokensDistributed(JsonField.of(totalTokensDistributed))

        /**
         * Sets [Builder.totalTokensDistributed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalTokensDistributed] with a well-typed [Float] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun totalTokensDistributed(totalTokensDistributed: JsonField<Float>) = apply {
            this.totalTokensDistributed = totalTokensDistributed
        }

        /** Total number of users */
        fun totalUsers(totalUsers: Long) = totalUsers(JsonField.of(totalUsers))

        /**
         * Sets [Builder.totalUsers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalUsers] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun totalUsers(totalUsers: JsonField<Long>) = apply { this.totalUsers = totalUsers }

        /** Weekly active users */
        fun weeklyActiveUsers(weeklyActiveUsers: Long) =
            weeklyActiveUsers(JsonField.of(weeklyActiveUsers))

        /**
         * Sets [Builder.weeklyActiveUsers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.weeklyActiveUsers] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun weeklyActiveUsers(weeklyActiveUsers: JsonField<Long>) = apply {
            this.weeklyActiveUsers = weeklyActiveUsers
        }

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
         * Returns an immutable instance of [StatRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): StatRetrieveResponse =
            StatRetrieveResponse(
                activeMissions,
                activeQuests,
                dailyActiveUsers,
                monthlyActiveUsers,
                totalStaked,
                totalTokensDistributed,
                totalUsers,
                weeklyActiveUsers,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): StatRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        activeMissions()
        activeQuests()
        dailyActiveUsers()
        monthlyActiveUsers()
        totalStaked()
        totalTokensDistributed()
        totalUsers()
        weeklyActiveUsers()
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
        (if (activeMissions.asKnown() == null) 0 else 1) +
            (if (activeQuests.asKnown() == null) 0 else 1) +
            (if (dailyActiveUsers.asKnown() == null) 0 else 1) +
            (if (monthlyActiveUsers.asKnown() == null) 0 else 1) +
            (if (totalStaked.asKnown() == null) 0 else 1) +
            (if (totalTokensDistributed.asKnown() == null) 0 else 1) +
            (if (totalUsers.asKnown() == null) 0 else 1) +
            (if (weeklyActiveUsers.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is StatRetrieveResponse && activeMissions == other.activeMissions && activeQuests == other.activeQuests && dailyActiveUsers == other.dailyActiveUsers && monthlyActiveUsers == other.monthlyActiveUsers && totalStaked == other.totalStaked && totalTokensDistributed == other.totalTokensDistributed && totalUsers == other.totalUsers && weeklyActiveUsers == other.weeklyActiveUsers && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(activeMissions, activeQuests, dailyActiveUsers, monthlyActiveUsers, totalStaked, totalTokensDistributed, totalUsers, weeklyActiveUsers, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "StatRetrieveResponse{activeMissions=$activeMissions, activeQuests=$activeQuests, dailyActiveUsers=$dailyActiveUsers, monthlyActiveUsers=$monthlyActiveUsers, totalStaked=$totalStaked, totalTokensDistributed=$totalTokensDistributed, totalUsers=$totalUsers, weeklyActiveUsers=$weeklyActiveUsers, additionalProperties=$additionalProperties}"
}
