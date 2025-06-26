# Earn App Kotlin API Library

<!-- x-release-please-start-version -->

[![Maven Central](https://img.shields.io/maven-central/v/com.earn_app.api/earn-app-kotlin)](https://central.sonatype.com/artifact/com.earn_app.api/earn-app-kotlin/0.0.1-alpha.1)
[![javadoc](https://javadoc.io/badge2/com.earn_app.api/earn-app-kotlin/0.0.1-alpha.1/javadoc.svg)](https://javadoc.io/doc/com.earn_app.api/earn-app-kotlin/0.0.1-alpha.1)

<!-- x-release-please-end -->

The Earn App Kotlin SDK provides convenient access to the [Earn App REST API](https://lerfhub.xyz) from applications written in Kotlin.

It is generated with [Stainless](https://www.stainless.com/).

<!-- x-release-please-start-version -->

The REST API documentation can be found on [lerfhub.xyz](https://lerfhub.xyz). KDocs are available on [javadoc.io](https://javadoc.io/doc/com.earn_app.api/earn-app-kotlin/0.0.1-alpha.1).

<!-- x-release-please-end -->

## Installation

<!-- x-release-please-start-version -->

### Gradle

```kotlin
implementation("com.earn_app.api:earn-app-kotlin:0.0.1-alpha.1")
```

### Maven

```xml
<dependency>
  <groupId>com.earn_app.api</groupId>
  <artifactId>earn-app-kotlin</artifactId>
  <version>0.0.1-alpha.1</version>
</dependency>
```

<!-- x-release-please-end -->

## Requirements

This library requires Java 8 or later.

## Usage

```kotlin
import com.earn_app.api.client.EarnAppClient
import com.earn_app.api.client.okhttp.EarnAppOkHttpClient
import com.earn_app.api.models.users.User
import com.earn_app.api.models.users.UserCreateParams

// Configures using the `EARN_APP_API_KEY` and `EARN_APP_BASE_URL` environment variables
val client: EarnAppClient = EarnAppOkHttpClient.fromEnv()

val params: UserCreateParams = UserCreateParams.builder()
    .walletAddress("walletAddress")
    .build()
val user: User = client.users().create(params)
```

## Client configuration

Configure the client using environment variables:

```kotlin
import com.earn_app.api.client.EarnAppClient
import com.earn_app.api.client.okhttp.EarnAppOkHttpClient

// Configures using the `EARN_APP_API_KEY` and `EARN_APP_BASE_URL` environment variables
val client: EarnAppClient = EarnAppOkHttpClient.fromEnv()
```

Or manually:

```kotlin
import com.earn_app.api.client.EarnAppClient
import com.earn_app.api.client.okhttp.EarnAppOkHttpClient

val client: EarnAppClient = EarnAppOkHttpClient.builder()
    .apiKey("My API Key")
    .build()
```

Or using a combination of the two approaches:

```kotlin
import com.earn_app.api.client.EarnAppClient
import com.earn_app.api.client.okhttp.EarnAppOkHttpClient

val client: EarnAppClient = EarnAppOkHttpClient.builder()
    // Configures using the `EARN_APP_API_KEY` and `EARN_APP_BASE_URL` environment variables
    .fromEnv()
    .apiKey("My API Key")
    .build()
```

See this table for the available options:

| Setter    | Environment variable | Required | Default value                   |
| --------- | -------------------- | -------- | ------------------------------- |
| `apiKey`  | `EARN_APP_API_KEY`   | true     | -                               |
| `baseUrl` | `EARN_APP_BASE_URL`  | true     | `"https://api.lerfhub.xyz/api"` |

> [!TIP]
> Don't create more than one client in the same application. Each client has a connection pool and
> thread pools, which are more efficient to share between requests.

### Modifying configuration

To temporarily use a modified client configuration, while reusing the same connection and thread pools, call `withOptions()` on any client or service:

```kotlin
import com.earn_app.api.client.EarnAppClient

val clientWithOptions: EarnAppClient = client.withOptions {
    it.baseUrl("https://example.com")
    it.maxRetries(42)
}
```

The `withOptions()` method does not affect the original client or service.

## Requests and responses

To send a request to the Earn App API, build an instance of some `Params` class and pass it to the corresponding client method. When the response is received, it will be deserialized into an instance of a Kotlin class.

For example, `client.users().create(...)` should be called with an instance of `UserCreateParams`, and it will return an instance of `User`.

## Immutability

Each class in the SDK has an associated [builder](https://blogs.oracle.com/javamagazine/post/exploring-joshua-blochs-builder-design-pattern-in-java) or factory method for constructing it.

Each class is [immutable](https://docs.oracle.com/javase/tutorial/essential/concurrency/immutable.html) once constructed. If the class has an associated builder, then it has a `toBuilder()` method, which can be used to convert it back to a builder for making a modified copy.

Because each class is immutable, builder modification will _never_ affect already built class instances.

## Asynchronous execution

The default client is synchronous. To switch to asynchronous execution, call the `async()` method:

```kotlin
import com.earn_app.api.client.EarnAppClient
import com.earn_app.api.client.okhttp.EarnAppOkHttpClient
import com.earn_app.api.models.users.User
import com.earn_app.api.models.users.UserCreateParams

// Configures using the `EARN_APP_API_KEY` and `EARN_APP_BASE_URL` environment variables
val client: EarnAppClient = EarnAppOkHttpClient.fromEnv()

val params: UserCreateParams = UserCreateParams.builder()
    .walletAddress("walletAddress")
    .build()
val user: User = client.async().users().create(params)
```

Or create an asynchronous client from the beginning:

```kotlin
import com.earn_app.api.client.EarnAppClientAsync
import com.earn_app.api.client.okhttp.EarnAppOkHttpClientAsync
import com.earn_app.api.models.users.User
import com.earn_app.api.models.users.UserCreateParams

// Configures using the `EARN_APP_API_KEY` and `EARN_APP_BASE_URL` environment variables
val client: EarnAppClientAsync = EarnAppOkHttpClientAsync.fromEnv()

val params: UserCreateParams = UserCreateParams.builder()
    .walletAddress("walletAddress")
    .build()
val user: User = client.users().create(params)
```

The asynchronous client supports the same options as the synchronous one, except most methods are [suspending](https://kotlinlang.org/docs/coroutines-guide.html).

## Raw responses

The SDK defines methods that deserialize responses into instances of Kotlin classes. However, these methods don't provide access to the response headers, status code, or the raw response body.

To access this data, prefix any HTTP method call on a client or service with `withRawResponse()`:

```kotlin
import com.earn_app.api.core.http.Headers
import com.earn_app.api.core.http.HttpResponseFor
import com.earn_app.api.models.users.User
import com.earn_app.api.models.users.UserCreateParams

val params: UserCreateParams = UserCreateParams.builder()
    .walletAddress("walletAddress")
    .build()
val user: HttpResponseFor<User> = client.users().withRawResponse().create(params)

val statusCode: Int = user.statusCode()
val headers: Headers = user.headers()
```

You can still deserialize the response into an instance of a Kotlin class if needed:

```kotlin
import com.earn_app.api.models.users.User

val parsedUser: User = user.parse()
```

## Error handling

The SDK throws custom unchecked exception types:

- [`EarnAppServiceException`](earn-app-kotlin-core/src/main/kotlin/com/earn_app/api/errors/EarnAppServiceException.kt): Base class for HTTP errors. See this table for which exception subclass is thrown for each HTTP status code:

  | Status | Exception                                                                                                                        |
  | ------ | -------------------------------------------------------------------------------------------------------------------------------- |
  | 400    | [`BadRequestException`](earn-app-kotlin-core/src/main/kotlin/com/earn_app/api/errors/BadRequestException.kt)                     |
  | 401    | [`UnauthorizedException`](earn-app-kotlin-core/src/main/kotlin/com/earn_app/api/errors/UnauthorizedException.kt)                 |
  | 403    | [`PermissionDeniedException`](earn-app-kotlin-core/src/main/kotlin/com/earn_app/api/errors/PermissionDeniedException.kt)         |
  | 404    | [`NotFoundException`](earn-app-kotlin-core/src/main/kotlin/com/earn_app/api/errors/NotFoundException.kt)                         |
  | 422    | [`UnprocessableEntityException`](earn-app-kotlin-core/src/main/kotlin/com/earn_app/api/errors/UnprocessableEntityException.kt)   |
  | 429    | [`RateLimitException`](earn-app-kotlin-core/src/main/kotlin/com/earn_app/api/errors/RateLimitException.kt)                       |
  | 5xx    | [`InternalServerException`](earn-app-kotlin-core/src/main/kotlin/com/earn_app/api/errors/InternalServerException.kt)             |
  | others | [`UnexpectedStatusCodeException`](earn-app-kotlin-core/src/main/kotlin/com/earn_app/api/errors/UnexpectedStatusCodeException.kt) |

- [`EarnAppIoException`](earn-app-kotlin-core/src/main/kotlin/com/earn_app/api/errors/EarnAppIoException.kt): I/O networking errors.

- [`EarnAppInvalidDataException`](earn-app-kotlin-core/src/main/kotlin/com/earn_app/api/errors/EarnAppInvalidDataException.kt): Failure to interpret successfully parsed data. For example, when accessing a property that's supposed to be required, but the API unexpectedly omitted it from the response.

- [`EarnAppException`](earn-app-kotlin-core/src/main/kotlin/com/earn_app/api/errors/EarnAppException.kt): Base class for all exceptions. Most errors will result in one of the previously mentioned ones, but completely generic errors may be thrown using the base class.

## Logging

The SDK uses the standard [OkHttp logging interceptor](https://github.com/square/okhttp/tree/master/okhttp-logging-interceptor).

Enable logging by setting the `EARN_APP_LOG` environment variable to `info`:

```sh
$ export EARN_APP_LOG=info
```

Or to `debug` for more verbose logging:

```sh
$ export EARN_APP_LOG=debug
```

## Jackson

The SDK depends on [Jackson](https://github.com/FasterXML/jackson) for JSON serialization/deserialization. It is compatible with version 2.13.4 or higher, but depends on version 2.18.2 by default.

The SDK throws an exception if it detects an incompatible Jackson version at runtime (e.g. if the default version was overridden in your Maven or Gradle config).

If the SDK threw an exception, but you're _certain_ the version is compatible, then disable the version check using the `checkJacksonVersionCompatibility` on [`EarnAppOkHttpClient`](earn-app-kotlin-client-okhttp/src/main/kotlin/com/earn_app/api/client/okhttp/EarnAppOkHttpClient.kt) or [`EarnAppOkHttpClientAsync`](earn-app-kotlin-client-okhttp/src/main/kotlin/com/earn_app/api/client/okhttp/EarnAppOkHttpClientAsync.kt).

> [!CAUTION]
> We make no guarantee that the SDK works correctly when the Jackson version check is disabled.

## Network options

### Retries

The SDK automatically retries 2 times by default, with a short exponential backoff.

Only the following error types are retried:

- Connection errors (for example, due to a network connectivity problem)
- 408 Request Timeout
- 409 Conflict
- 429 Rate Limit
- 5xx Internal

The API may also explicitly instruct the SDK to retry or not retry a response.

To set a custom number of retries, configure the client using the `maxRetries` method:

```kotlin
import com.earn_app.api.client.EarnAppClient
import com.earn_app.api.client.okhttp.EarnAppOkHttpClient

val client: EarnAppClient = EarnAppOkHttpClient.builder()
    .fromEnv()
    .maxRetries(4)
    .build()
```

### Timeouts

Requests time out after 1 minute by default.

To set a custom timeout, configure the method call using the `timeout` method:

```kotlin
import com.earn_app.api.models.users.User

val user: User = client.users().create(
  params, RequestOptions.builder().timeout(Duration.ofSeconds(30)).build()
)
```

Or configure the default for all method calls at the client level:

```kotlin
import com.earn_app.api.client.EarnAppClient
import com.earn_app.api.client.okhttp.EarnAppOkHttpClient
import java.time.Duration

val client: EarnAppClient = EarnAppOkHttpClient.builder()
    .fromEnv()
    .timeout(Duration.ofSeconds(30))
    .build()
```

### Proxies

To route requests through a proxy, configure the client using the `proxy` method:

```kotlin
import com.earn_app.api.client.EarnAppClient
import com.earn_app.api.client.okhttp.EarnAppOkHttpClient
import java.net.InetSocketAddress
import java.net.Proxy

val client: EarnAppClient = EarnAppOkHttpClient.builder()
    .fromEnv()
    .proxy(Proxy(
      Proxy.Type.HTTP, InetSocketAddress(
        "https://example.com", 8080
      )
    ))
    .build()
```

### Environments

The SDK sends requests to the production by default. To send requests to a different environment, configure the client like so:

```kotlin
import com.earn_app.api.client.EarnAppClient
import com.earn_app.api.client.okhttp.EarnAppOkHttpClient

val client: EarnAppClient = EarnAppOkHttpClient.builder()
    .fromEnv()
    .environment1()
    .build()
```

### Custom HTTP client

The SDK consists of three artifacts:

- `earn-app-kotlin-core`
  - Contains core SDK logic
  - Does not depend on [OkHttp](https://square.github.io/okhttp)
  - Exposes [`EarnAppClient`](earn-app-kotlin-core/src/main/kotlin/com/earn_app/api/client/EarnAppClient.kt), [`EarnAppClientAsync`](earn-app-kotlin-core/src/main/kotlin/com/earn_app/api/client/EarnAppClientAsync.kt), [`EarnAppClientImpl`](earn-app-kotlin-core/src/main/kotlin/com/earn_app/api/client/EarnAppClientImpl.kt), and [`EarnAppClientAsyncImpl`](earn-app-kotlin-core/src/main/kotlin/com/earn_app/api/client/EarnAppClientAsyncImpl.kt), all of which can work with any HTTP client
- `earn-app-kotlin-client-okhttp`
  - Depends on [OkHttp](https://square.github.io/okhttp)
  - Exposes [`EarnAppOkHttpClient`](earn-app-kotlin-client-okhttp/src/main/kotlin/com/earn_app/api/client/okhttp/EarnAppOkHttpClient.kt) and [`EarnAppOkHttpClientAsync`](earn-app-kotlin-client-okhttp/src/main/kotlin/com/earn_app/api/client/okhttp/EarnAppOkHttpClientAsync.kt), which provide a way to construct [`EarnAppClientImpl`](earn-app-kotlin-core/src/main/kotlin/com/earn_app/api/client/EarnAppClientImpl.kt) and [`EarnAppClientAsyncImpl`](earn-app-kotlin-core/src/main/kotlin/com/earn_app/api/client/EarnAppClientAsyncImpl.kt), respectively, using OkHttp
- `earn-app-kotlin`
  - Depends on and exposes the APIs of both `earn-app-kotlin-core` and `earn-app-kotlin-client-okhttp`
  - Does not have its own logic

This structure allows replacing the SDK's default HTTP client without pulling in unnecessary dependencies.

#### Customized [`OkHttpClient`](https://square.github.io/okhttp/3.x/okhttp/okhttp3/OkHttpClient.html)

> [!TIP]
> Try the available [network options](#network-options) before replacing the default client.

To use a customized `OkHttpClient`:

1. Replace your [`earn-app-kotlin` dependency](#installation) with `earn-app-kotlin-core`
2. Copy `earn-app-kotlin-client-okhttp`'s [`OkHttpClient`](earn-app-kotlin-client-okhttp/src/main/kotlin/com/earn_app/api/client/okhttp/OkHttpClient.kt) class into your code and customize it
3. Construct [`EarnAppClientImpl`](earn-app-kotlin-core/src/main/kotlin/com/earn_app/api/client/EarnAppClientImpl.kt) or [`EarnAppClientAsyncImpl`](earn-app-kotlin-core/src/main/kotlin/com/earn_app/api/client/EarnAppClientAsyncImpl.kt), similarly to [`EarnAppOkHttpClient`](earn-app-kotlin-client-okhttp/src/main/kotlin/com/earn_app/api/client/okhttp/EarnAppOkHttpClient.kt) or [`EarnAppOkHttpClientAsync`](earn-app-kotlin-client-okhttp/src/main/kotlin/com/earn_app/api/client/okhttp/EarnAppOkHttpClientAsync.kt), using your customized client

### Completely custom HTTP client

To use a completely custom HTTP client:

1. Replace your [`earn-app-kotlin` dependency](#installation) with `earn-app-kotlin-core`
2. Write a class that implements the [`HttpClient`](earn-app-kotlin-core/src/main/kotlin/com/earn_app/api/core/http/HttpClient.kt) interface
3. Construct [`EarnAppClientImpl`](earn-app-kotlin-core/src/main/kotlin/com/earn_app/api/client/EarnAppClientImpl.kt) or [`EarnAppClientAsyncImpl`](earn-app-kotlin-core/src/main/kotlin/com/earn_app/api/client/EarnAppClientAsyncImpl.kt), similarly to [`EarnAppOkHttpClient`](earn-app-kotlin-client-okhttp/src/main/kotlin/com/earn_app/api/client/okhttp/EarnAppOkHttpClient.kt) or [`EarnAppOkHttpClientAsync`](earn-app-kotlin-client-okhttp/src/main/kotlin/com/earn_app/api/client/okhttp/EarnAppOkHttpClientAsync.kt), using your new client class

## Undocumented API functionality

The SDK is typed for convenient usage of the documented API. However, it also supports working with undocumented or not yet supported parts of the API.

### Parameters

To set undocumented parameters, call the `putAdditionalHeader`, `putAdditionalQueryParam`, or `putAdditionalBodyProperty` methods on any `Params` class:

```kotlin
import com.earn_app.api.core.JsonValue
import com.earn_app.api.models.users.UserCreateParams

val params: UserCreateParams = UserCreateParams.builder()
    .putAdditionalHeader("Secret-Header", "42")
    .putAdditionalQueryParam("secret_query_param", "42")
    .putAdditionalBodyProperty("secretProperty", JsonValue.from("42"))
    .build()
```

These can be accessed on the built object later using the `_additionalHeaders()`, `_additionalQueryParams()`, and `_additionalBodyProperties()` methods.

To set a documented parameter or property to an undocumented or not yet supported _value_, pass a [`JsonValue`](earn-app-kotlin-core/src/main/kotlin/com/earn_app/api/core/Values.kt) object to its setter:

```kotlin
import com.earn_app.api.core.JsonValue
import com.earn_app.api.models.users.UserCreateParams

val params: UserCreateParams = UserCreateParams.builder()
    .walletAddress(JsonValue.from(42))
    .build()
```

The most straightforward way to create a [`JsonValue`](earn-app-kotlin-core/src/main/kotlin/com/earn_app/api/core/Values.kt) is using its `from(...)` method:

```kotlin
import com.earn_app.api.core.JsonValue

// Create primitive JSON values
val nullValue: JsonValue = JsonValue.from(null)
val booleanValue: JsonValue = JsonValue.from(true)
val numberValue: JsonValue = JsonValue.from(42)
val stringValue: JsonValue = JsonValue.from("Hello World!")

// Create a JSON array value equivalent to `["Hello", "World"]`
val arrayValue: JsonValue = JsonValue.from(listOf(
  "Hello", "World"
))

// Create a JSON object value equivalent to `{ "a": 1, "b": 2 }`
val objectValue: JsonValue = JsonValue.from(mapOf(
  "a" to 1, "b" to 2
))

// Create an arbitrarily nested JSON equivalent to:
// {
//   "a": [1, 2],
//   "b": [3, 4]
// }
val complexValue: JsonValue = JsonValue.from(mapOf(
  "a" to listOf(
    1, 2
  ), "b" to listOf(
    3, 4
  )
))
```

Normally a `Builder` class's `build` method will throw [`IllegalStateException`](https://docs.oracle.com/javase/8/docs/api/java/lang/IllegalStateException.html) if any required parameter or property is unset.

To forcibly omit a required parameter or property, pass [`JsonMissing`](earn-app-kotlin-core/src/main/kotlin/com/earn_app/api/core/Values.kt):

```kotlin
import com.earn_app.api.core.JsonMissing
import com.earn_app.api.models.users.UserCreateParams

val params: UserCreateParams = UserCreateParams.builder()
    .walletAddress(JsonMissing.of())
    .build()
```

### Response properties

To access undocumented response properties, call the `_additionalProperties()` method:

```kotlin
import com.earn_app.api.core.JsonBoolean
import com.earn_app.api.core.JsonNull
import com.earn_app.api.core.JsonNumber
import com.earn_app.api.core.JsonValue

val additionalProperties: Map<String, JsonValue> = client.users().create(params)._additionalProperties()
val secretPropertyValue: JsonValue = additionalProperties.get("secretProperty")

val result = when (secretPropertyValue) {
    is JsonNull -> "It's null!"
    is JsonBoolean -> "It's a boolean!"
    is JsonNumber -> "It's a number!"
    // Other types include `JsonMissing`, `JsonString`, `JsonArray`, and `JsonObject`
    else -> "It's something else!"
}
```

To access a property's raw JSON value, which may be undocumented, call its `_` prefixed method:

```kotlin
import com.earn_app.api.core.JsonField

val walletAddress: JsonField<String> = client.users().create(params)._walletAddress()

if (walletAddress.isMissing()) {
  // The property is absent from the JSON response
} else if (walletAddress.isNull()) {
  // The property was set to literal null
} else {
  // Check if value was provided as a string
  // Other methods include `asNumber()`, `asBoolean()`, etc.
  val jsonString: String? = walletAddress.asString();

  // Try to deserialize into a custom type
  val myObject: MyClass = walletAddress.asUnknown()!!.convert(MyClass::class.java)
}
```

### Response validation

In rare cases, the API may return a response that doesn't match the expected type. For example, the SDK may expect a property to contain a `String`, but the API could return something else.

By default, the SDK will not throw an exception in this case. It will throw [`EarnAppInvalidDataException`](earn-app-kotlin-core/src/main/kotlin/com/earn_app/api/errors/EarnAppInvalidDataException.kt) only if you directly access the property.

If you would prefer to check that the response is completely well-typed upfront, then either call `validate()`:

```kotlin
import com.earn_app.api.models.users.User

val user: User = client.users().create(params).validate()
```

Or configure the method call to validate the response using the `responseValidation` method:

```kotlin
import com.earn_app.api.models.users.User

val user: User = client.users().create(
  params, RequestOptions.builder().responseValidation(true).build()
)
```

Or configure the default for all method calls at the client level:

```kotlin
import com.earn_app.api.client.EarnAppClient
import com.earn_app.api.client.okhttp.EarnAppOkHttpClient

val client: EarnAppClient = EarnAppOkHttpClient.builder()
    .fromEnv()
    .responseValidation(true)
    .build()
```

## FAQ

### Why don't you use plain `enum` classes?

Kotlin `enum` classes are not trivially [forwards compatible](https://www.stainless.com/blog/making-java-enums-forwards-compatible). Using them in the SDK could cause runtime exceptions if the API is updated to respond with a new enum value.

### Why do you represent fields using `JsonField<T>` instead of just plain `T`?

Using `JsonField<T>` enables a few features:

- Allowing usage of [undocumented API functionality](#undocumented-api-functionality)
- Lazily [validating the API response against the expected shape](#response-validation)
- Representing absent vs explicitly null values

### Why don't you use [`data` classes](https://kotlinlang.org/docs/data-classes.html)?

It is not [backwards compatible to add new fields to a data class](https://kotlinlang.org/docs/api-guidelines-backward-compatibility.html#avoid-using-data-classes-in-your-api) and we don't want to introduce a breaking change every time we add a field to a class.

### Why don't you use checked exceptions?

Checked exceptions are widely considered a mistake in the Java programming language. In fact, they were omitted from Kotlin for this reason.

Checked exceptions:

- Are verbose to handle
- Encourage error handling at the wrong level of abstraction, where nothing can be done about the error
- Are tedious to propagate due to the [function coloring problem](https://journal.stuffwithstuff.com/2015/02/01/what-color-is-your-function)
- Don't play well with lambdas (also due to the function coloring problem)

## Semantic versioning

This package generally follows [SemVer](https://semver.org/spec/v2.0.0.html) conventions, though certain backwards-incompatible changes may be released as minor versions:

1. Changes to library internals which are technically public but not intended or documented for external use. _(Please open a GitHub issue to let us know if you are relying on such internals.)_
2. Changes that we do not expect to impact the vast majority of users in practice.

We take backwards-compatibility seriously and work hard to ensure you can rely on a smooth upgrade experience.

We are keen for your feedback; please open an [issue](https://www.github.com/BoomchainLabs/chonk9k-dapp/issues) with questions, bugs, or suggestions.
