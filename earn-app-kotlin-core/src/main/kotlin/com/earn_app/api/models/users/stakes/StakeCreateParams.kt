// File generated from our OpenAPI spec by Stainless.

package com.earn_app.api.models.users.stakes

import com.earn_app.api.core.ExcludeMissing
import com.earn_app.api.core.JsonField
import com.earn_app.api.core.JsonMissing
import com.earn_app.api.core.JsonValue
import com.earn_app.api.core.Params
import com.earn_app.api.core.checkRequired
import com.earn_app.api.core.http.Headers
import com.earn_app.api.core.http.QueryParams
import com.earn_app.api.errors.EarnAppInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

/** Stake tokens in a vault */
class StakeCreateParams
private constructor(
    private val userId: Long?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun userId(): Long? = userId

    /**
     * Amount to stake
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Float = body.amount()

    /**
     * Vault identifier
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun vaultId(): Long = body.vaultId()

    /**
     * Whether to auto-compound rewards
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun autoCompound(): Boolean? = body.autoCompound()

    /**
     * Lock period in days
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lockPeriod(): Long? = body.lockPeriod()

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _amount(): JsonField<Float> = body._amount()

    /**
     * Returns the raw JSON value of [vaultId].
     *
     * Unlike [vaultId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _vaultId(): JsonField<Long> = body._vaultId()

    /**
     * Returns the raw JSON value of [autoCompound].
     *
     * Unlike [autoCompound], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _autoCompound(): JsonField<Boolean> = body._autoCompound()

    /**
     * Returns the raw JSON value of [lockPeriod].
     *
     * Unlike [lockPeriod], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _lockPeriod(): JsonField<Long> = body._lockPeriod()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [StakeCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .amount()
         * .vaultId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [StakeCreateParams]. */
    class Builder internal constructor() {

        private var userId: Long? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(stakeCreateParams: StakeCreateParams) = apply {
            userId = stakeCreateParams.userId
            body = stakeCreateParams.body.toBuilder()
            additionalHeaders = stakeCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = stakeCreateParams.additionalQueryParams.toBuilder()
        }

        fun userId(userId: Long?) = apply { this.userId = userId }

        /**
         * Alias for [Builder.userId].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun userId(userId: Long) = userId(userId as Long?)

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [amount]
         * - [vaultId]
         * - [autoCompound]
         * - [lockPeriod]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Amount to stake */
        fun amount(amount: Float) = apply { body.amount(amount) }

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Float] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Float>) = apply { body.amount(amount) }

        /** Vault identifier */
        fun vaultId(vaultId: Long) = apply { body.vaultId(vaultId) }

        /**
         * Sets [Builder.vaultId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vaultId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun vaultId(vaultId: JsonField<Long>) = apply { body.vaultId(vaultId) }

        /** Whether to auto-compound rewards */
        fun autoCompound(autoCompound: Boolean) = apply { body.autoCompound(autoCompound) }

        /**
         * Sets [Builder.autoCompound] to an arbitrary JSON value.
         *
         * You should usually call [Builder.autoCompound] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun autoCompound(autoCompound: JsonField<Boolean>) = apply {
            body.autoCompound(autoCompound)
        }

        /** Lock period in days */
        fun lockPeriod(lockPeriod: Long) = apply { body.lockPeriod(lockPeriod) }

        /**
         * Sets [Builder.lockPeriod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lockPeriod] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lockPeriod(lockPeriod: JsonField<Long>) = apply { body.lockPeriod(lockPeriod) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [StakeCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .amount()
         * .vaultId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): StakeCreateParams =
            StakeCreateParams(
                userId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> userId?.toString() ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val amount: JsonField<Float>,
        private val vaultId: JsonField<Long>,
        private val autoCompound: JsonField<Boolean>,
        private val lockPeriod: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Float> = JsonMissing.of(),
            @JsonProperty("vaultId") @ExcludeMissing vaultId: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("autoCompound")
            @ExcludeMissing
            autoCompound: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("lockPeriod")
            @ExcludeMissing
            lockPeriod: JsonField<Long> = JsonMissing.of(),
        ) : this(amount, vaultId, autoCompound, lockPeriod, mutableMapOf())

        /**
         * Amount to stake
         *
         * @throws EarnAppInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Float = amount.getRequired("amount")

        /**
         * Vault identifier
         *
         * @throws EarnAppInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun vaultId(): Long = vaultId.getRequired("vaultId")

        /**
         * Whether to auto-compound rewards
         *
         * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun autoCompound(): Boolean? = autoCompound.getNullable("autoCompound")

        /**
         * Lock period in days
         *
         * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lockPeriod(): Long? = lockPeriod.getNullable("lockPeriod")

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Float> = amount

        /**
         * Returns the raw JSON value of [vaultId].
         *
         * Unlike [vaultId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("vaultId") @ExcludeMissing fun _vaultId(): JsonField<Long> = vaultId

        /**
         * Returns the raw JSON value of [autoCompound].
         *
         * Unlike [autoCompound], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("autoCompound")
        @ExcludeMissing
        fun _autoCompound(): JsonField<Boolean> = autoCompound

        /**
         * Returns the raw JSON value of [lockPeriod].
         *
         * Unlike [lockPeriod], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lockPeriod") @ExcludeMissing fun _lockPeriod(): JsonField<Long> = lockPeriod

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .amount()
             * .vaultId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var amount: JsonField<Float>? = null
            private var vaultId: JsonField<Long>? = null
            private var autoCompound: JsonField<Boolean> = JsonMissing.of()
            private var lockPeriod: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                amount = body.amount
                vaultId = body.vaultId
                autoCompound = body.autoCompound
                lockPeriod = body.lockPeriod
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Amount to stake */
            fun amount(amount: Float) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Float] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<Float>) = apply { this.amount = amount }

            /** Vault identifier */
            fun vaultId(vaultId: Long) = vaultId(JsonField.of(vaultId))

            /**
             * Sets [Builder.vaultId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vaultId] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun vaultId(vaultId: JsonField<Long>) = apply { this.vaultId = vaultId }

            /** Whether to auto-compound rewards */
            fun autoCompound(autoCompound: Boolean) = autoCompound(JsonField.of(autoCompound))

            /**
             * Sets [Builder.autoCompound] to an arbitrary JSON value.
             *
             * You should usually call [Builder.autoCompound] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun autoCompound(autoCompound: JsonField<Boolean>) = apply {
                this.autoCompound = autoCompound
            }

            /** Lock period in days */
            fun lockPeriod(lockPeriod: Long) = lockPeriod(JsonField.of(lockPeriod))

            /**
             * Sets [Builder.lockPeriod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lockPeriod] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lockPeriod(lockPeriod: JsonField<Long>) = apply { this.lockPeriod = lockPeriod }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .amount()
             * .vaultId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("amount", amount),
                    checkRequired("vaultId", vaultId),
                    autoCompound,
                    lockPeriod,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            amount()
            vaultId()
            autoCompound()
            lockPeriod()
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
            (if (amount.asKnown() == null) 0 else 1) +
                (if (vaultId.asKnown() == null) 0 else 1) +
                (if (autoCompound.asKnown() == null) 0 else 1) +
                (if (lockPeriod.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && amount == other.amount && vaultId == other.vaultId && autoCompound == other.autoCompound && lockPeriod == other.lockPeriod && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, vaultId, autoCompound, lockPeriod, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{amount=$amount, vaultId=$vaultId, autoCompound=$autoCompound, lockPeriod=$lockPeriod, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is StakeCreateParams && userId == other.userId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(userId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "StakeCreateParams{userId=$userId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
