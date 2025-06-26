// File generated from our OpenAPI spec by Stainless.

package com.earn_app.api.models.token

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

class TokenRetrieveInfoResponse
private constructor(
    private val address: JsonField<String>,
    private val circulatingSupply: JsonField<Float>,
    private val decimals: JsonField<Long>,
    private val listings: JsonField<List<Listing>>,
    private val marketCap: JsonField<Float>,
    private val name: JsonField<String>,
    private val price: JsonField<Float>,
    private val priceChange24h: JsonField<Float>,
    private val symbol: JsonField<String>,
    private val totalSupply: JsonField<Float>,
    private val volume24h: JsonField<Float>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("address") @ExcludeMissing address: JsonField<String> = JsonMissing.of(),
        @JsonProperty("circulatingSupply")
        @ExcludeMissing
        circulatingSupply: JsonField<Float> = JsonMissing.of(),
        @JsonProperty("decimals") @ExcludeMissing decimals: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("listings")
        @ExcludeMissing
        listings: JsonField<List<Listing>> = JsonMissing.of(),
        @JsonProperty("marketCap") @ExcludeMissing marketCap: JsonField<Float> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("price") @ExcludeMissing price: JsonField<Float> = JsonMissing.of(),
        @JsonProperty("priceChange24h")
        @ExcludeMissing
        priceChange24h: JsonField<Float> = JsonMissing.of(),
        @JsonProperty("symbol") @ExcludeMissing symbol: JsonField<String> = JsonMissing.of(),
        @JsonProperty("totalSupply")
        @ExcludeMissing
        totalSupply: JsonField<Float> = JsonMissing.of(),
        @JsonProperty("volume24h") @ExcludeMissing volume24h: JsonField<Float> = JsonMissing.of(),
    ) : this(
        address,
        circulatingSupply,
        decimals,
        listings,
        marketCap,
        name,
        price,
        priceChange24h,
        symbol,
        totalSupply,
        volume24h,
        mutableMapOf(),
    )

    /**
     * Token contract address
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun address(): String? = address.getNullable("address")

    /**
     * Circulating token supply
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun circulatingSupply(): Float? = circulatingSupply.getNullable("circulatingSupply")

    /**
     * Token decimals
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun decimals(): Long? = decimals.getNullable("decimals")

    /**
     * Exchanges where the token is listed
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun listings(): List<Listing>? = listings.getNullable("listings")

    /**
     * Current market capitalization
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun marketCap(): Float? = marketCap.getNullable("marketCap")

    /**
     * Token name
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): String? = name.getNullable("name")

    /**
     * Current token price in USD
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun price(): Float? = price.getNullable("price")

    /**
     * 24-hour price change percentage
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun priceChange24h(): Float? = priceChange24h.getNullable("priceChange24h")

    /**
     * Token symbol
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun symbol(): String? = symbol.getNullable("symbol")

    /**
     * Total token supply
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalSupply(): Float? = totalSupply.getNullable("totalSupply")

    /**
     * 24-hour trading volume
     *
     * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun volume24h(): Float? = volume24h.getNullable("volume24h")

    /**
     * Returns the raw JSON value of [address].
     *
     * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<String> = address

    /**
     * Returns the raw JSON value of [circulatingSupply].
     *
     * Unlike [circulatingSupply], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("circulatingSupply")
    @ExcludeMissing
    fun _circulatingSupply(): JsonField<Float> = circulatingSupply

    /**
     * Returns the raw JSON value of [decimals].
     *
     * Unlike [decimals], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("decimals") @ExcludeMissing fun _decimals(): JsonField<Long> = decimals

    /**
     * Returns the raw JSON value of [listings].
     *
     * Unlike [listings], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("listings") @ExcludeMissing fun _listings(): JsonField<List<Listing>> = listings

    /**
     * Returns the raw JSON value of [marketCap].
     *
     * Unlike [marketCap], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("marketCap") @ExcludeMissing fun _marketCap(): JsonField<Float> = marketCap

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [price].
     *
     * Unlike [price], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Float> = price

    /**
     * Returns the raw JSON value of [priceChange24h].
     *
     * Unlike [priceChange24h], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("priceChange24h")
    @ExcludeMissing
    fun _priceChange24h(): JsonField<Float> = priceChange24h

    /**
     * Returns the raw JSON value of [symbol].
     *
     * Unlike [symbol], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("symbol") @ExcludeMissing fun _symbol(): JsonField<String> = symbol

    /**
     * Returns the raw JSON value of [totalSupply].
     *
     * Unlike [totalSupply], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("totalSupply") @ExcludeMissing fun _totalSupply(): JsonField<Float> = totalSupply

    /**
     * Returns the raw JSON value of [volume24h].
     *
     * Unlike [volume24h], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("volume24h") @ExcludeMissing fun _volume24h(): JsonField<Float> = volume24h

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
         * Returns a mutable builder for constructing an instance of [TokenRetrieveInfoResponse].
         */
        fun builder() = Builder()
    }

    /** A builder for [TokenRetrieveInfoResponse]. */
    class Builder internal constructor() {

        private var address: JsonField<String> = JsonMissing.of()
        private var circulatingSupply: JsonField<Float> = JsonMissing.of()
        private var decimals: JsonField<Long> = JsonMissing.of()
        private var listings: JsonField<MutableList<Listing>>? = null
        private var marketCap: JsonField<Float> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var price: JsonField<Float> = JsonMissing.of()
        private var priceChange24h: JsonField<Float> = JsonMissing.of()
        private var symbol: JsonField<String> = JsonMissing.of()
        private var totalSupply: JsonField<Float> = JsonMissing.of()
        private var volume24h: JsonField<Float> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(tokenRetrieveInfoResponse: TokenRetrieveInfoResponse) = apply {
            address = tokenRetrieveInfoResponse.address
            circulatingSupply = tokenRetrieveInfoResponse.circulatingSupply
            decimals = tokenRetrieveInfoResponse.decimals
            listings = tokenRetrieveInfoResponse.listings.map { it.toMutableList() }
            marketCap = tokenRetrieveInfoResponse.marketCap
            name = tokenRetrieveInfoResponse.name
            price = tokenRetrieveInfoResponse.price
            priceChange24h = tokenRetrieveInfoResponse.priceChange24h
            symbol = tokenRetrieveInfoResponse.symbol
            totalSupply = tokenRetrieveInfoResponse.totalSupply
            volume24h = tokenRetrieveInfoResponse.volume24h
            additionalProperties = tokenRetrieveInfoResponse.additionalProperties.toMutableMap()
        }

        /** Token contract address */
        fun address(address: String) = address(JsonField.of(address))

        /**
         * Sets [Builder.address] to an arbitrary JSON value.
         *
         * You should usually call [Builder.address] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun address(address: JsonField<String>) = apply { this.address = address }

        /** Circulating token supply */
        fun circulatingSupply(circulatingSupply: Float) =
            circulatingSupply(JsonField.of(circulatingSupply))

        /**
         * Sets [Builder.circulatingSupply] to an arbitrary JSON value.
         *
         * You should usually call [Builder.circulatingSupply] with a well-typed [Float] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun circulatingSupply(circulatingSupply: JsonField<Float>) = apply {
            this.circulatingSupply = circulatingSupply
        }

        /** Token decimals */
        fun decimals(decimals: Long) = decimals(JsonField.of(decimals))

        /**
         * Sets [Builder.decimals] to an arbitrary JSON value.
         *
         * You should usually call [Builder.decimals] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun decimals(decimals: JsonField<Long>) = apply { this.decimals = decimals }

        /** Exchanges where the token is listed */
        fun listings(listings: List<Listing>) = listings(JsonField.of(listings))

        /**
         * Sets [Builder.listings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.listings] with a well-typed `List<Listing>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun listings(listings: JsonField<List<Listing>>) = apply {
            this.listings = listings.map { it.toMutableList() }
        }

        /**
         * Adds a single [Listing] to [listings].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addListing(listing: Listing) = apply {
            listings =
                (listings ?: JsonField.of(mutableListOf())).also {
                    checkKnown("listings", it).add(listing)
                }
        }

        /** Current market capitalization */
        fun marketCap(marketCap: Float) = marketCap(JsonField.of(marketCap))

        /**
         * Sets [Builder.marketCap] to an arbitrary JSON value.
         *
         * You should usually call [Builder.marketCap] with a well-typed [Float] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun marketCap(marketCap: JsonField<Float>) = apply { this.marketCap = marketCap }

        /** Token name */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Current token price in USD */
        fun price(price: Float) = price(JsonField.of(price))

        /**
         * Sets [Builder.price] to an arbitrary JSON value.
         *
         * You should usually call [Builder.price] with a well-typed [Float] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun price(price: JsonField<Float>) = apply { this.price = price }

        /** 24-hour price change percentage */
        fun priceChange24h(priceChange24h: Float) = priceChange24h(JsonField.of(priceChange24h))

        /**
         * Sets [Builder.priceChange24h] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priceChange24h] with a well-typed [Float] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun priceChange24h(priceChange24h: JsonField<Float>) = apply {
            this.priceChange24h = priceChange24h
        }

        /** Token symbol */
        fun symbol(symbol: String) = symbol(JsonField.of(symbol))

        /**
         * Sets [Builder.symbol] to an arbitrary JSON value.
         *
         * You should usually call [Builder.symbol] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun symbol(symbol: JsonField<String>) = apply { this.symbol = symbol }

        /** Total token supply */
        fun totalSupply(totalSupply: Float) = totalSupply(JsonField.of(totalSupply))

        /**
         * Sets [Builder.totalSupply] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalSupply] with a well-typed [Float] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalSupply(totalSupply: JsonField<Float>) = apply { this.totalSupply = totalSupply }

        /** 24-hour trading volume */
        fun volume24h(volume24h: Float) = volume24h(JsonField.of(volume24h))

        /**
         * Sets [Builder.volume24h] to an arbitrary JSON value.
         *
         * You should usually call [Builder.volume24h] with a well-typed [Float] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun volume24h(volume24h: JsonField<Float>) = apply { this.volume24h = volume24h }

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
         * Returns an immutable instance of [TokenRetrieveInfoResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TokenRetrieveInfoResponse =
            TokenRetrieveInfoResponse(
                address,
                circulatingSupply,
                decimals,
                (listings ?: JsonMissing.of()).map { it.toImmutable() },
                marketCap,
                name,
                price,
                priceChange24h,
                symbol,
                totalSupply,
                volume24h,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TokenRetrieveInfoResponse = apply {
        if (validated) {
            return@apply
        }

        address()
        circulatingSupply()
        decimals()
        listings()?.forEach { it.validate() }
        marketCap()
        name()
        price()
        priceChange24h()
        symbol()
        totalSupply()
        volume24h()
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
        (if (address.asKnown() == null) 0 else 1) +
            (if (circulatingSupply.asKnown() == null) 0 else 1) +
            (if (decimals.asKnown() == null) 0 else 1) +
            (listings.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (marketCap.asKnown() == null) 0 else 1) +
            (if (name.asKnown() == null) 0 else 1) +
            (if (price.asKnown() == null) 0 else 1) +
            (if (priceChange24h.asKnown() == null) 0 else 1) +
            (if (symbol.asKnown() == null) 0 else 1) +
            (if (totalSupply.asKnown() == null) 0 else 1) +
            (if (volume24h.asKnown() == null) 0 else 1)

    class Listing
    private constructor(
        private val exchange: JsonField<String>,
        private val pair: JsonField<String>,
        private val url: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("exchange")
            @ExcludeMissing
            exchange: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pair") @ExcludeMissing pair: JsonField<String> = JsonMissing.of(),
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        ) : this(exchange, pair, url, mutableMapOf())

        /**
         * Exchange name
         *
         * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun exchange(): String? = exchange.getNullable("exchange")

        /**
         * Trading pair
         *
         * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pair(): String? = pair.getNullable("pair")

        /**
         * Link to exchange
         *
         * @throws EarnAppInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun url(): String? = url.getNullable("url")

        /**
         * Returns the raw JSON value of [exchange].
         *
         * Unlike [exchange], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("exchange") @ExcludeMissing fun _exchange(): JsonField<String> = exchange

        /**
         * Returns the raw JSON value of [pair].
         *
         * Unlike [pair], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pair") @ExcludeMissing fun _pair(): JsonField<String> = pair

        /**
         * Returns the raw JSON value of [url].
         *
         * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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

            /** Returns a mutable builder for constructing an instance of [Listing]. */
            fun builder() = Builder()
        }

        /** A builder for [Listing]. */
        class Builder internal constructor() {

            private var exchange: JsonField<String> = JsonMissing.of()
            private var pair: JsonField<String> = JsonMissing.of()
            private var url: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(listing: Listing) = apply {
                exchange = listing.exchange
                pair = listing.pair
                url = listing.url
                additionalProperties = listing.additionalProperties.toMutableMap()
            }

            /** Exchange name */
            fun exchange(exchange: String) = exchange(JsonField.of(exchange))

            /**
             * Sets [Builder.exchange] to an arbitrary JSON value.
             *
             * You should usually call [Builder.exchange] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun exchange(exchange: JsonField<String>) = apply { this.exchange = exchange }

            /** Trading pair */
            fun pair(pair: String) = pair(JsonField.of(pair))

            /**
             * Sets [Builder.pair] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pair] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun pair(pair: JsonField<String>) = apply { this.pair = pair }

            /** Link to exchange */
            fun url(url: String) = url(JsonField.of(url))

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun url(url: JsonField<String>) = apply { this.url = url }

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
             * Returns an immutable instance of [Listing].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Listing = Listing(exchange, pair, url, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Listing = apply {
            if (validated) {
                return@apply
            }

            exchange()
            pair()
            url()
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
            (if (exchange.asKnown() == null) 0 else 1) +
                (if (pair.asKnown() == null) 0 else 1) +
                (if (url.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Listing && exchange == other.exchange && pair == other.pair && url == other.url && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(exchange, pair, url, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Listing{exchange=$exchange, pair=$pair, url=$url, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TokenRetrieveInfoResponse && address == other.address && circulatingSupply == other.circulatingSupply && decimals == other.decimals && listings == other.listings && marketCap == other.marketCap && name == other.name && price == other.price && priceChange24h == other.priceChange24h && symbol == other.symbol && totalSupply == other.totalSupply && volume24h == other.volume24h && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(address, circulatingSupply, decimals, listings, marketCap, name, price, priceChange24h, symbol, totalSupply, volume24h, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TokenRetrieveInfoResponse{address=$address, circulatingSupply=$circulatingSupply, decimals=$decimals, listings=$listings, marketCap=$marketCap, name=$name, price=$price, priceChange24h=$priceChange24h, symbol=$symbol, totalSupply=$totalSupply, volume24h=$volume24h, additionalProperties=$additionalProperties}"
}
