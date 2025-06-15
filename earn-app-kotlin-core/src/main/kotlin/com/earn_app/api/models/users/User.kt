// File generated from our OpenAPI spec by Stainless.

package com.earn_app.api.models.users

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

class User
private constructor(
    private val id: JsonField<Long>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val email: JsonField<String>,
    private val level: JsonField<Long>,
    private val referralCode: JsonField<String>,
    private val totalPoints: JsonField<Long>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val username: JsonField<String>,
    private val walletAddress: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("level") @ExcludeMissing level: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("referralCode")
        @ExcludeMissing
        referralCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("totalPoints")
        @ExcludeMissing
        totalPoints: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("username") @ExcludeMissing username: JsonField<String> = JsonMissing.of(),
        @JsonProperty("walletAddress")
        @ExcludeMissing
        walletAddress: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        email,
        level,
        referralCode,
        totalPoints,
        updatedAt,
        username,
        walletAddress,
        mutableMapOf(),
    )

    /**
     * Unique user identifier
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Long? = id.getNullable("id")

    /**
     * User creation timestamp
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime? = createdAt.getNullable("createdAt")

    /**
     * User's email address
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun email(): String? = email.getNullable("email")

    /**
     * User's current level
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun level(): Long? = level.getNullable("level")

    /**
     * User's unique referral code
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun referralCode(): String? = referralCode.getNullable("referralCode")

    /**
     * Total points earned by the user
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalPoints(): Long? = totalPoints.getNullable("totalPoints")

    /**
     * Last update timestamp
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime? = updatedAt.getNullable("updatedAt")

    /**
     * User's chosen username
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun username(): String? = username.getNullable("username")

    /**
     * User's blockchain wallet address
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun walletAddress(): String? = walletAddress.getNullable("walletAddress")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Long> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /**
     * Returns the raw JSON value of [level].
     *
     * Unlike [level], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("level") @ExcludeMissing fun _level(): JsonField<Long> = level

    /**
     * Returns the raw JSON value of [referralCode].
     *
     * Unlike [referralCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("referralCode")
    @ExcludeMissing
    fun _referralCode(): JsonField<String> = referralCode

    /**
     * Returns the raw JSON value of [totalPoints].
     *
     * Unlike [totalPoints], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("totalPoints") @ExcludeMissing fun _totalPoints(): JsonField<Long> = totalPoints

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [username].
     *
     * Unlike [username], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("username") @ExcludeMissing fun _username(): JsonField<String> = username

    /**
     * Returns the raw JSON value of [walletAddress].
     *
     * Unlike [walletAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("walletAddress")
    @ExcludeMissing
    fun _walletAddress(): JsonField<String> = walletAddress

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

        /** Returns a mutable builder for constructing an instance of [User]. */
        fun builder() = Builder()
    }

    /** A builder for [User]. */
    class Builder internal constructor() {

        private var id: JsonField<Long> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var email: JsonField<String> = JsonMissing.of()
        private var level: JsonField<Long> = JsonMissing.of()
        private var referralCode: JsonField<String> = JsonMissing.of()
        private var totalPoints: JsonField<Long> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var username: JsonField<String> = JsonMissing.of()
        private var walletAddress: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(user: User) = apply {
            id = user.id
            createdAt = user.createdAt
            email = user.email
            level = user.level
            referralCode = user.referralCode
            totalPoints = user.totalPoints
            updatedAt = user.updatedAt
            username = user.username
            walletAddress = user.walletAddress
            additionalProperties = user.additionalProperties.toMutableMap()
        }

        /** Unique user identifier */
        fun id(id: Long) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<Long>) = apply { this.id = id }

        /** User creation timestamp */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** User's email address */
        fun email(email: String) = email(JsonField.of(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /** User's current level */
        fun level(level: Long) = level(JsonField.of(level))

        /**
         * Sets [Builder.level] to an arbitrary JSON value.
         *
         * You should usually call [Builder.level] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun level(level: JsonField<Long>) = apply { this.level = level }

        /** User's unique referral code */
        fun referralCode(referralCode: String) = referralCode(JsonField.of(referralCode))

        /**
         * Sets [Builder.referralCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referralCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun referralCode(referralCode: JsonField<String>) = apply {
            this.referralCode = referralCode
        }

        /** Total points earned by the user */
        fun totalPoints(totalPoints: Long) = totalPoints(JsonField.of(totalPoints))

        /**
         * Sets [Builder.totalPoints] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalPoints] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalPoints(totalPoints: JsonField<Long>) = apply { this.totalPoints = totalPoints }

        /** Last update timestamp */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** User's chosen username */
        fun username(username: String) = username(JsonField.of(username))

        /**
         * Sets [Builder.username] to an arbitrary JSON value.
         *
         * You should usually call [Builder.username] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun username(username: JsonField<String>) = apply { this.username = username }

        /** User's blockchain wallet address */
        fun walletAddress(walletAddress: String) = walletAddress(JsonField.of(walletAddress))

        /**
         * Sets [Builder.walletAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.walletAddress] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun walletAddress(walletAddress: JsonField<String>) = apply {
            this.walletAddress = walletAddress
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
         * Returns an immutable instance of [User].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): User =
            User(
                id,
                createdAt,
                email,
                level,
                referralCode,
                totalPoints,
                updatedAt,
                username,
                walletAddress,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): User = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        email()
        level()
        referralCode()
        totalPoints()
        updatedAt()
        username()
        walletAddress()
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
            (if (createdAt.asKnown() == null) 0 else 1) +
            (if (email.asKnown() == null) 0 else 1) +
            (if (level.asKnown() == null) 0 else 1) +
            (if (referralCode.asKnown() == null) 0 else 1) +
            (if (totalPoints.asKnown() == null) 0 else 1) +
            (if (updatedAt.asKnown() == null) 0 else 1) +
            (if (username.asKnown() == null) 0 else 1) +
            (if (walletAddress.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is User && id == other.id && createdAt == other.createdAt && email == other.email && level == other.level && referralCode == other.referralCode && totalPoints == other.totalPoints && updatedAt == other.updatedAt && username == other.username && walletAddress == other.walletAddress && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, createdAt, email, level, referralCode, totalPoints, updatedAt, username, walletAddress, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "User{id=$id, createdAt=$createdAt, email=$email, level=$level, referralCode=$referralCode, totalPoints=$totalPoints, updatedAt=$updatedAt, username=$username, walletAddress=$walletAddress, additionalProperties=$additionalProperties}"
}
