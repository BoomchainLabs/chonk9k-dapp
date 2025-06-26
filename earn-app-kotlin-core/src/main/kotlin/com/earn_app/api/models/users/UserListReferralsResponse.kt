// File generated from our OpenAPI spec by Stainless.

package com.earn_app.api.models.users

import com.earn_app.api.core.Enum
import com.earn_app.api.core.ExcludeMissing
import com.earn_app.api.core.JsonField
import com.earn_app.api.core.JsonMissing
import com.earn_app.api.core.JsonValue
import com.earn_app.api.errors.EarnAppInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class UserListReferralsResponse
private constructor(
    private val id: JsonField<Long>,
    private val code: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val referee: JsonField<User>,
    private val refereeId: JsonField<Long>,
    private val referrerId: JsonField<Long>,
    private val rewardAmount: JsonField<Float>,
    private val rewardedAt: JsonField<OffsetDateTime>,
    private val status: JsonField<Status>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("referee") @ExcludeMissing referee: JsonField<User> = JsonMissing.of(),
        @JsonProperty("refereeId") @ExcludeMissing refereeId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("referrerId") @ExcludeMissing referrerId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("rewardAmount")
        @ExcludeMissing
        rewardAmount: JsonField<Float> = JsonMissing.of(),
        @JsonProperty("rewardedAt")
        @ExcludeMissing
        rewardedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
    ) : this(
        id,
        code,
        createdAt,
        referee,
        refereeId,
        referrerId,
        rewardAmount,
        rewardedAt,
        status,
        mutableMapOf(),
    )

    /**
     * Unique referral identifier
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Long? = id.getNullable("id")

    /**
     * Referral code used
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun code(): String? = code.getNullable("code")

    /**
     * Referral creation timestamp
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime? = createdAt.getNullable("createdAt")

    /**
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun referee(): User? = referee.getNullable("referee")

    /**
     * Referred user identifier
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun refereeId(): Long? = refereeId.getNullable("refereeId")

    /**
     * Referrer user identifier
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun referrerId(): Long? = referrerId.getNullable("referrerId")

    /**
     * Reward amount given to referrer
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rewardAmount(): Float? = rewardAmount.getNullable("rewardAmount")

    /**
     * Reward timestamp
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rewardedAt(): OffsetDateTime? = rewardedAt.getNullable("rewardedAt")

    /**
     * Referral status
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Status? = status.getNullable("status")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Long> = id

    /**
     * Returns the raw JSON value of [code].
     *
     * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [referee].
     *
     * Unlike [referee], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("referee") @ExcludeMissing fun _referee(): JsonField<User> = referee

    /**
     * Returns the raw JSON value of [refereeId].
     *
     * Unlike [refereeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("refereeId") @ExcludeMissing fun _refereeId(): JsonField<Long> = refereeId

    /**
     * Returns the raw JSON value of [referrerId].
     *
     * Unlike [referrerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("referrerId") @ExcludeMissing fun _referrerId(): JsonField<Long> = referrerId

    /**
     * Returns the raw JSON value of [rewardAmount].
     *
     * Unlike [rewardAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rewardAmount")
    @ExcludeMissing
    fun _rewardAmount(): JsonField<Float> = rewardAmount

    /**
     * Returns the raw JSON value of [rewardedAt].
     *
     * Unlike [rewardedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rewardedAt")
    @ExcludeMissing
    fun _rewardedAt(): JsonField<OffsetDateTime> = rewardedAt

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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

        /**
         * Returns a mutable builder for constructing an instance of [UserListReferralsResponse].
         */
        fun builder() = Builder()
    }

    /** A builder for [UserListReferralsResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<Long> = JsonMissing.of()
        private var code: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var referee: JsonField<User> = JsonMissing.of()
        private var refereeId: JsonField<Long> = JsonMissing.of()
        private var referrerId: JsonField<Long> = JsonMissing.of()
        private var rewardAmount: JsonField<Float> = JsonMissing.of()
        private var rewardedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(userListReferralsResponse: UserListReferralsResponse) = apply {
            id = userListReferralsResponse.id
            code = userListReferralsResponse.code
            createdAt = userListReferralsResponse.createdAt
            referee = userListReferralsResponse.referee
            refereeId = userListReferralsResponse.refereeId
            referrerId = userListReferralsResponse.referrerId
            rewardAmount = userListReferralsResponse.rewardAmount
            rewardedAt = userListReferralsResponse.rewardedAt
            status = userListReferralsResponse.status
            additionalProperties = userListReferralsResponse.additionalProperties.toMutableMap()
        }

        /** Unique referral identifier */
        fun id(id: Long) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<Long>) = apply { this.id = id }

        /** Referral code used */
        fun code(code: String) = code(JsonField.of(code))

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<String>) = apply { this.code = code }

        /** Referral creation timestamp */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun referee(referee: User) = referee(JsonField.of(referee))

        /**
         * Sets [Builder.referee] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referee] with a well-typed [User] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun referee(referee: JsonField<User>) = apply { this.referee = referee }

        /** Referred user identifier */
        fun refereeId(refereeId: Long) = refereeId(JsonField.of(refereeId))

        /**
         * Sets [Builder.refereeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.refereeId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun refereeId(refereeId: JsonField<Long>) = apply { this.refereeId = refereeId }

        /** Referrer user identifier */
        fun referrerId(referrerId: Long) = referrerId(JsonField.of(referrerId))

        /**
         * Sets [Builder.referrerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referrerId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun referrerId(referrerId: JsonField<Long>) = apply { this.referrerId = referrerId }

        /** Reward amount given to referrer */
        fun rewardAmount(rewardAmount: Float) = rewardAmount(JsonField.of(rewardAmount))

        /**
         * Sets [Builder.rewardAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rewardAmount] with a well-typed [Float] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rewardAmount(rewardAmount: JsonField<Float>) = apply {
            this.rewardAmount = rewardAmount
        }

        /** Reward timestamp */
        fun rewardedAt(rewardedAt: OffsetDateTime) = rewardedAt(JsonField.of(rewardedAt))

        /**
         * Sets [Builder.rewardedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rewardedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rewardedAt(rewardedAt: JsonField<OffsetDateTime>) = apply {
            this.rewardedAt = rewardedAt
        }

        /** Referral status */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

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
         * Returns an immutable instance of [UserListReferralsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UserListReferralsResponse =
            UserListReferralsResponse(
                id,
                code,
                createdAt,
                referee,
                refereeId,
                referrerId,
                rewardAmount,
                rewardedAt,
                status,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): UserListReferralsResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        code()
        createdAt()
        referee()?.validate()
        refereeId()
        referrerId()
        rewardAmount()
        rewardedAt()
        status()?.validate()
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
            (if (code.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (referee.asKnown()?.validity() ?: 0) +
            (if (refereeId.asKnown() == null) 0 else 1) +
            (if (referrerId.asKnown() == null) 0 else 1) +
            (if (rewardAmount.asKnown() == null) 0 else 1) +
            (if (rewardedAt.asKnown() == null) 0 else 1) +
            (status.asKnown()?.validity() ?: 0)

    /** Referral status */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val PENDING = of("pending")

            val REWARDED = of("rewarded")

            val EXPIRED = of("expired")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PENDING,
            REWARDED,
            EXPIRED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PENDING,
            REWARDED,
            EXPIRED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                REWARDED -> Value.REWARDED
                EXPIRED -> Value.EXPIRED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws EarnAppInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                REWARDED -> Known.REWARDED
                EXPIRED -> Known.EXPIRED
                else -> throw EarnAppInvalidDataException("Unknown Status: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws EarnAppInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw EarnAppInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        fun validate(): Status = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is UserListReferralsResponse && id == other.id && code == other.code && createdAt == other.createdAt && referee == other.referee && refereeId == other.refereeId && referrerId == other.referrerId && rewardAmount == other.rewardAmount && rewardedAt == other.rewardedAt && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, code, createdAt, referee, refereeId, referrerId, rewardAmount, rewardedAt, status, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UserListReferralsResponse{id=$id, code=$code, createdAt=$createdAt, referee=$referee, refereeId=$refereeId, referrerId=$referrerId, rewardAmount=$rewardAmount, rewardedAt=$rewardedAt, status=$status, additionalProperties=$additionalProperties}"
}
