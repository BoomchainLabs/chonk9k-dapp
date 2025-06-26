// File generated from our OpenAPI spec by Stainless.

package com.earn_app.api.models.users.stakes

import com.earn_app.api.core.Enum
import com.earn_app.api.core.ExcludeMissing
import com.earn_app.api.core.JsonField
import com.earn_app.api.core.JsonMissing
import com.earn_app.api.core.JsonValue
import com.earn_app.api.errors.EarnAppInvalidDataException
import com.earn_app.api.models.staking.StakingVault
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class UserStake
private constructor(
    private val id: JsonField<Long>,
    private val amount: JsonField<Float>,
    private val autoCompound: JsonField<Boolean>,
    private val endDate: JsonField<OffsetDateTime>,
    private val lockPeriod: JsonField<Long>,
    private val startDate: JsonField<OffsetDateTime>,
    private val status: JsonField<Status>,
    private val totalRewards: JsonField<Float>,
    private val userId: JsonField<Long>,
    private val vault: JsonField<StakingVault>,
    private val vaultId: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Float> = JsonMissing.of(),
        @JsonProperty("autoCompound")
        @ExcludeMissing
        autoCompound: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("endDate")
        @ExcludeMissing
        endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("lockPeriod") @ExcludeMissing lockPeriod: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("startDate")
        @ExcludeMissing
        startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("totalRewards")
        @ExcludeMissing
        totalRewards: JsonField<Float> = JsonMissing.of(),
        @JsonProperty("userId") @ExcludeMissing userId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("vault") @ExcludeMissing vault: JsonField<StakingVault> = JsonMissing.of(),
        @JsonProperty("vaultId") @ExcludeMissing vaultId: JsonField<Long> = JsonMissing.of(),
    ) : this(
        id,
        amount,
        autoCompound,
        endDate,
        lockPeriod,
        startDate,
        status,
        totalRewards,
        userId,
        vault,
        vaultId,
        mutableMapOf(),
    )

    /**
     * Unique stake identifier
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Long? = id.getNullable("id")

    /**
     * Staked amount
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun amount(): Float? = amount.getNullable("amount")

    /**
     * Whether rewards are auto-compounded
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun autoCompound(): Boolean? = autoCompound.getNullable("autoCompound")

    /**
     * End timestamp
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endDate(): OffsetDateTime? = endDate.getNullable("endDate")

    /**
     * Lock period in days
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lockPeriod(): Long? = lockPeriod.getNullable("lockPeriod")

    /**
     * Start timestamp
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startDate(): OffsetDateTime? = startDate.getNullable("startDate")

    /**
     * Stake status
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Status? = status.getNullable("status")

    /**
     * Total rewards earned
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalRewards(): Float? = totalRewards.getNullable("totalRewards")

    /**
     * User identifier
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userId(): Long? = userId.getNullable("userId")

    /**
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun vault(): StakingVault? = vault.getNullable("vault")

    /**
     * Vault identifier
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun vaultId(): Long? = vaultId.getNullable("vaultId")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Long> = id

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Float> = amount

    /**
     * Returns the raw JSON value of [autoCompound].
     *
     * Unlike [autoCompound], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("autoCompound")
    @ExcludeMissing
    fun _autoCompound(): JsonField<Boolean> = autoCompound

    /**
     * Returns the raw JSON value of [endDate].
     *
     * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endDate") @ExcludeMissing fun _endDate(): JsonField<OffsetDateTime> = endDate

    /**
     * Returns the raw JSON value of [lockPeriod].
     *
     * Unlike [lockPeriod], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lockPeriod") @ExcludeMissing fun _lockPeriod(): JsonField<Long> = lockPeriod

    /**
     * Returns the raw JSON value of [startDate].
     *
     * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("startDate")
    @ExcludeMissing
    fun _startDate(): JsonField<OffsetDateTime> = startDate

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [totalRewards].
     *
     * Unlike [totalRewards], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("totalRewards")
    @ExcludeMissing
    fun _totalRewards(): JsonField<Float> = totalRewards

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("userId") @ExcludeMissing fun _userId(): JsonField<Long> = userId

    /**
     * Returns the raw JSON value of [vault].
     *
     * Unlike [vault], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vault") @ExcludeMissing fun _vault(): JsonField<StakingVault> = vault

    /**
     * Returns the raw JSON value of [vaultId].
     *
     * Unlike [vaultId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vaultId") @ExcludeMissing fun _vaultId(): JsonField<Long> = vaultId

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

        /** Returns a mutable builder for constructing an instance of [UserStake]. */
        fun builder() = Builder()
    }

    /** A builder for [UserStake]. */
    class Builder internal constructor() {

        private var id: JsonField<Long> = JsonMissing.of()
        private var amount: JsonField<Float> = JsonMissing.of()
        private var autoCompound: JsonField<Boolean> = JsonMissing.of()
        private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var lockPeriod: JsonField<Long> = JsonMissing.of()
        private var startDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var totalRewards: JsonField<Float> = JsonMissing.of()
        private var userId: JsonField<Long> = JsonMissing.of()
        private var vault: JsonField<StakingVault> = JsonMissing.of()
        private var vaultId: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(userStake: UserStake) = apply {
            id = userStake.id
            amount = userStake.amount
            autoCompound = userStake.autoCompound
            endDate = userStake.endDate
            lockPeriod = userStake.lockPeriod
            startDate = userStake.startDate
            status = userStake.status
            totalRewards = userStake.totalRewards
            userId = userStake.userId
            vault = userStake.vault
            vaultId = userStake.vaultId
            additionalProperties = userStake.additionalProperties.toMutableMap()
        }

        /** Unique stake identifier */
        fun id(id: Long) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<Long>) = apply { this.id = id }

        /** Staked amount */
        fun amount(amount: Float) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Float] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Float>) = apply { this.amount = amount }

        /** Whether rewards are auto-compounded */
        fun autoCompound(autoCompound: Boolean) = autoCompound(JsonField.of(autoCompound))

        /**
         * Sets [Builder.autoCompound] to an arbitrary JSON value.
         *
         * You should usually call [Builder.autoCompound] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun autoCompound(autoCompound: JsonField<Boolean>) = apply {
            this.autoCompound = autoCompound
        }

        /** End timestamp */
        fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

        /**
         * Sets [Builder.endDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

        /** Lock period in days */
        fun lockPeriod(lockPeriod: Long) = lockPeriod(JsonField.of(lockPeriod))

        /**
         * Sets [Builder.lockPeriod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lockPeriod] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lockPeriod(lockPeriod: JsonField<Long>) = apply { this.lockPeriod = lockPeriod }

        /** Start timestamp */
        fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

        /**
         * Sets [Builder.startDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startDate(startDate: JsonField<OffsetDateTime>) = apply { this.startDate = startDate }

        /** Stake status */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** Total rewards earned */
        fun totalRewards(totalRewards: Float) = totalRewards(JsonField.of(totalRewards))

        /**
         * Sets [Builder.totalRewards] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalRewards] with a well-typed [Float] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalRewards(totalRewards: JsonField<Float>) = apply {
            this.totalRewards = totalRewards
        }

        /** User identifier */
        fun userId(userId: Long) = userId(JsonField.of(userId))

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<Long>) = apply { this.userId = userId }

        fun vault(vault: StakingVault) = vault(JsonField.of(vault))

        /**
         * Sets [Builder.vault] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vault] with a well-typed [StakingVault] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun vault(vault: JsonField<StakingVault>) = apply { this.vault = vault }

        /** Vault identifier */
        fun vaultId(vaultId: Long) = vaultId(JsonField.of(vaultId))

        /**
         * Sets [Builder.vaultId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vaultId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun vaultId(vaultId: JsonField<Long>) = apply { this.vaultId = vaultId }

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
         * Returns an immutable instance of [UserStake].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UserStake =
            UserStake(
                id,
                amount,
                autoCompound,
                endDate,
                lockPeriod,
                startDate,
                status,
                totalRewards,
                userId,
                vault,
                vaultId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): UserStake = apply {
        if (validated) {
            return@apply
        }

        id()
        amount()
        autoCompound()
        endDate()
        lockPeriod()
        startDate()
        status()?.validate()
        totalRewards()
        userId()
        vault()?.validate()
        vaultId()
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
            (if (amount.asKnown() == null) 0 else 1) +
            (if (autoCompound.asKnown() == null) 0 else 1) +
            (if (endDate.asKnown() == null) 0 else 1) +
            (if (lockPeriod.asKnown() == null) 0 else 1) +
            (if (startDate.asKnown() == null) 0 else 1) +
            (status.asKnown()?.validity() ?: 0) +
            (if (totalRewards.asKnown() == null) 0 else 1) +
            (if (userId.asKnown() == null) 0 else 1) +
            (vault.asKnown()?.validity() ?: 0) +
            (if (vaultId.asKnown() == null) 0 else 1)

    /** Stake status */
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

            val ACTIVE = of("active")

            val COMPLETED = of("completed")

            val CLAIMED = of("claimed")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            ACTIVE,
            COMPLETED,
            CLAIMED,
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
            ACTIVE,
            COMPLETED,
            CLAIMED,
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
                ACTIVE -> Value.ACTIVE
                COMPLETED -> Value.COMPLETED
                CLAIMED -> Value.CLAIMED
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
                ACTIVE -> Known.ACTIVE
                COMPLETED -> Known.COMPLETED
                CLAIMED -> Known.CLAIMED
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

        return /* spotless:off */ other is UserStake && id == other.id && amount == other.amount && autoCompound == other.autoCompound && endDate == other.endDate && lockPeriod == other.lockPeriod && startDate == other.startDate && status == other.status && totalRewards == other.totalRewards && userId == other.userId && vault == other.vault && vaultId == other.vaultId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, amount, autoCompound, endDate, lockPeriod, startDate, status, totalRewards, userId, vault, vaultId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UserStake{id=$id, amount=$amount, autoCompound=$autoCompound, endDate=$endDate, lockPeriod=$lockPeriod, startDate=$startDate, status=$status, totalRewards=$totalRewards, userId=$userId, vault=$vault, vaultId=$vaultId, additionalProperties=$additionalProperties}"
}
