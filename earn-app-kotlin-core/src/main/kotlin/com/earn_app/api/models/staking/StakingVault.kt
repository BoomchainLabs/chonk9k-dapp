// File generated from our OpenAPI spec by Stainless.

package com.earn_app.api.models.staking

import com.earn_app.api.core.Enum
import com.earn_app.api.core.ExcludeMissing
import com.earn_app.api.core.JsonField
import com.earn_app.api.core.JsonMissing
import com.earn_app.api.core.JsonValue
import com.earn_app.api.core.checkKnown
import com.earn_app.api.core.toImmutable
import com.earn_app.api.errors.EarnAppInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

class StakingVault
private constructor(
    private val id: JsonField<Long>,
    private val active: JsonField<Boolean>,
    private val apr: JsonField<Float>,
    private val description: JsonField<String>,
    private val minLockPeriod: JsonField<Long>,
    private val name: JsonField<String>,
    private val rewards: JsonField<List<Reward>>,
    private val totalStaked: JsonField<Float>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("active") @ExcludeMissing active: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("apr") @ExcludeMissing apr: JsonField<Float> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("minLockPeriod")
        @ExcludeMissing
        minLockPeriod: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rewards")
        @ExcludeMissing
        rewards: JsonField<List<Reward>> = JsonMissing.of(),
        @JsonProperty("totalStaked")
        @ExcludeMissing
        totalStaked: JsonField<Float> = JsonMissing.of(),
    ) : this(
        id,
        active,
        apr,
        description,
        minLockPeriod,
        name,
        rewards,
        totalStaked,
        mutableMapOf(),
    )

    /**
     * Unique vault identifier
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Long? = id.getNullable("id")

    /**
     * Whether the vault is active
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun active(): Boolean? = active.getNullable("active")

    /**
     * Annual percentage rate
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun apr(): Float? = apr.getNullable("apr")

    /**
     * Vault description
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): String? = description.getNullable("description")

    /**
     * Minimum lock period in days
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun minLockPeriod(): Long? = minLockPeriod.getNullable("minLockPeriod")

    /**
     * Vault name
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): String? = name.getNullable("name")

    /**
     * Rewards offered by this vault
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rewards(): List<Reward>? = rewards.getNullable("rewards")

    /**
     * Total amount staked in this vault
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalStaked(): Float? = totalStaked.getNullable("totalStaked")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Long> = id

    /**
     * Returns the raw JSON value of [active].
     *
     * Unlike [active], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("active") @ExcludeMissing fun _active(): JsonField<Boolean> = active

    /**
     * Returns the raw JSON value of [apr].
     *
     * Unlike [apr], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("apr") @ExcludeMissing fun _apr(): JsonField<Float> = apr

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [minLockPeriod].
     *
     * Unlike [minLockPeriod], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("minLockPeriod")
    @ExcludeMissing
    fun _minLockPeriod(): JsonField<Long> = minLockPeriod

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [rewards].
     *
     * Unlike [rewards], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rewards") @ExcludeMissing fun _rewards(): JsonField<List<Reward>> = rewards

    /**
     * Returns the raw JSON value of [totalStaked].
     *
     * Unlike [totalStaked], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("totalStaked") @ExcludeMissing fun _totalStaked(): JsonField<Float> = totalStaked

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

        /** Returns a mutable builder for constructing an instance of [StakingVault]. */
        fun builder() = Builder()
    }

    /** A builder for [StakingVault]. */
    class Builder internal constructor() {

        private var id: JsonField<Long> = JsonMissing.of()
        private var active: JsonField<Boolean> = JsonMissing.of()
        private var apr: JsonField<Float> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var minLockPeriod: JsonField<Long> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var rewards: JsonField<MutableList<Reward>>? = null
        private var totalStaked: JsonField<Float> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(stakingVault: StakingVault) = apply {
            id = stakingVault.id
            active = stakingVault.active
            apr = stakingVault.apr
            description = stakingVault.description
            minLockPeriod = stakingVault.minLockPeriod
            name = stakingVault.name
            rewards = stakingVault.rewards.map { it.toMutableList() }
            totalStaked = stakingVault.totalStaked
            additionalProperties = stakingVault.additionalProperties.toMutableMap()
        }

        /** Unique vault identifier */
        fun id(id: Long) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<Long>) = apply { this.id = id }

        /** Whether the vault is active */
        fun active(active: Boolean) = active(JsonField.of(active))

        /**
         * Sets [Builder.active] to an arbitrary JSON value.
         *
         * You should usually call [Builder.active] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun active(active: JsonField<Boolean>) = apply { this.active = active }

        /** Annual percentage rate */
        fun apr(apr: Float) = apr(JsonField.of(apr))

        /**
         * Sets [Builder.apr] to an arbitrary JSON value.
         *
         * You should usually call [Builder.apr] with a well-typed [Float] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun apr(apr: JsonField<Float>) = apply { this.apr = apr }

        /** Vault description */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** Minimum lock period in days */
        fun minLockPeriod(minLockPeriod: Long) = minLockPeriod(JsonField.of(minLockPeriod))

        /**
         * Sets [Builder.minLockPeriod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minLockPeriod] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun minLockPeriod(minLockPeriod: JsonField<Long>) = apply {
            this.minLockPeriod = minLockPeriod
        }

        /** Vault name */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Rewards offered by this vault */
        fun rewards(rewards: List<Reward>) = rewards(JsonField.of(rewards))

        /**
         * Sets [Builder.rewards] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rewards] with a well-typed `List<Reward>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rewards(rewards: JsonField<List<Reward>>) = apply {
            this.rewards = rewards.map { it.toMutableList() }
        }

        /**
         * Adds a single [Reward] to [rewards].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addReward(reward: Reward) = apply {
            rewards =
                (rewards ?: JsonField.of(mutableListOf())).also {
                    checkKnown("rewards", it).add(reward)
                }
        }

        /** Total amount staked in this vault */
        fun totalStaked(totalStaked: Float) = totalStaked(JsonField.of(totalStaked))

        /**
         * Sets [Builder.totalStaked] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalStaked] with a well-typed [Float] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalStaked(totalStaked: JsonField<Float>) = apply { this.totalStaked = totalStaked }

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
         * Returns an immutable instance of [StakingVault].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): StakingVault =
            StakingVault(
                id,
                active,
                apr,
                description,
                minLockPeriod,
                name,
                (rewards ?: JsonMissing.of()).map { it.toImmutable() },
                totalStaked,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): StakingVault = apply {
        if (validated) {
            return@apply
        }

        id()
        active()
        apr()
        description()
        minLockPeriod()
        name()
        rewards()?.forEach { it.validate() }
        totalStaked()
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
            (if (active.asKnown() == null) 0 else 1) +
            (if (apr.asKnown() == null) 0 else 1) +
            (if (description.asKnown() == null) 0 else 1) +
            (if (minLockPeriod.asKnown() == null) 0 else 1) +
            (if (name.asKnown() == null) 0 else 1) +
            (rewards.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (totalStaked.asKnown() == null) 0 else 1)

    class Reward
    private constructor(
        private val id: JsonField<Long>,
        private val description: JsonField<String>,
        private val distribution: JsonField<Distribution>,
        private val rate: JsonField<Float>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("distribution")
            @ExcludeMissing
            distribution: JsonField<Distribution> = JsonMissing.of(),
            @JsonProperty("rate") @ExcludeMissing rate: JsonField<Float> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(id, description, distribution, rate, type, mutableMapOf())

        /**
         * Unique reward identifier
         *
         * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Long? = id.getNullable("id")

        /**
         * Reward description
         *
         * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): String? = description.getNullable("description")

        /**
         * When the reward is distributed
         *
         * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun distribution(): Distribution? = distribution.getNullable("distribution")

        /**
         * Reward rate
         *
         * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun rate(): Float? = rate.getNullable("rate")

        /**
         * Type of reward
         *
         * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Type? = type.getNullable("type")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Long> = id

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [distribution].
         *
         * Unlike [distribution], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("distribution")
        @ExcludeMissing
        fun _distribution(): JsonField<Distribution> = distribution

        /**
         * Returns the raw JSON value of [rate].
         *
         * Unlike [rate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rate") @ExcludeMissing fun _rate(): JsonField<Float> = rate

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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

            /** Returns a mutable builder for constructing an instance of [Reward]. */
            fun builder() = Builder()
        }

        /** A builder for [Reward]. */
        class Builder internal constructor() {

            private var id: JsonField<Long> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var distribution: JsonField<Distribution> = JsonMissing.of()
            private var rate: JsonField<Float> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(reward: Reward) = apply {
                id = reward.id
                description = reward.description
                distribution = reward.distribution
                rate = reward.rate
                type = reward.type
                additionalProperties = reward.additionalProperties.toMutableMap()
            }

            /** Unique reward identifier */
            fun id(id: Long) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<Long>) = apply { this.id = id }

            /** Reward description */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** When the reward is distributed */
            fun distribution(distribution: Distribution) = distribution(JsonField.of(distribution))

            /**
             * Sets [Builder.distribution] to an arbitrary JSON value.
             *
             * You should usually call [Builder.distribution] with a well-typed [Distribution] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun distribution(distribution: JsonField<Distribution>) = apply {
                this.distribution = distribution
            }

            /** Reward rate */
            fun rate(rate: Float) = rate(JsonField.of(rate))

            /**
             * Sets [Builder.rate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rate] with a well-typed [Float] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun rate(rate: JsonField<Float>) = apply { this.rate = rate }

            /** Type of reward */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [Reward].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Reward =
                Reward(
                    id,
                    description,
                    distribution,
                    rate,
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Reward = apply {
            if (validated) {
                return@apply
            }

            id()
            description()
            distribution()?.validate()
            rate()
            type()?.validate()
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
        internal fun validity(): Int =
            (if (id.asKnown() == null) 0 else 1) +
                (if (description.asKnown() == null) 0 else 1) +
                (distribution.asKnown()?.validity() ?: 0) +
                (if (rate.asKnown() == null) 0 else 1) +
                (type.asKnown()?.validity() ?: 0)

        /** When the reward is distributed */
        class Distribution @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val DAILY = of("daily")

                val WEEKLY = of("weekly")

                val MONTHLY = of("monthly")

                val END = of("end")

                fun of(value: String) = Distribution(JsonField.of(value))
            }

            /** An enum containing [Distribution]'s known values. */
            enum class Known {
                DAILY,
                WEEKLY,
                MONTHLY,
                END,
            }

            /**
             * An enum containing [Distribution]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Distribution] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DAILY,
                WEEKLY,
                MONTHLY,
                END,
                /**
                 * An enum member indicating that [Distribution] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    DAILY -> Value.DAILY
                    WEEKLY -> Value.WEEKLY
                    MONTHLY -> Value.MONTHLY
                    END -> Value.END
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws EarnAppInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    DAILY -> Known.DAILY
                    WEEKLY -> Known.WEEKLY
                    MONTHLY -> Known.MONTHLY
                    END -> Known.END
                    else -> throw EarnAppInvalidDataException("Unknown Distribution: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws EarnAppInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString() ?: throw EarnAppInvalidDataException("Value is not a String")

            private var validated: Boolean = false

            fun validate(): Distribution = apply {
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

                return /* spotless:off */ other is Distribution && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Type of reward */
        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val TOKEN = of("token")

                val NFT = of("nft")

                val BOOST = of("boost")

                val OTHER = of("other")

                fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                TOKEN,
                NFT,
                BOOST,
                OTHER,
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                TOKEN,
                NFT,
                BOOST,
                OTHER,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    TOKEN -> Value.TOKEN
                    NFT -> Value.NFT
                    BOOST -> Value.BOOST
                    OTHER -> Value.OTHER
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws EarnAppInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    TOKEN -> Known.TOKEN
                    NFT -> Known.NFT
                    BOOST -> Known.BOOST
                    OTHER -> Known.OTHER
                    else -> throw EarnAppInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws EarnAppInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString() ?: throw EarnAppInvalidDataException("Value is not a String")

            private var validated: Boolean = false

            fun validate(): Type = apply {
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

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Reward && id == other.id && description == other.description && distribution == other.distribution && rate == other.rate && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, description, distribution, rate, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Reward{id=$id, description=$description, distribution=$distribution, rate=$rate, type=$type, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is StakingVault && id == other.id && active == other.active && apr == other.apr && description == other.description && minLockPeriod == other.minLockPeriod && name == other.name && rewards == other.rewards && totalStaked == other.totalStaked && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, active, apr, description, minLockPeriod, name, rewards, totalStaked, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "StakingVault{id=$id, active=$active, apr=$apr, description=$description, minLockPeriod=$minLockPeriod, name=$name, rewards=$rewards, totalStaked=$totalStaked, additionalProperties=$additionalProperties}"
}
