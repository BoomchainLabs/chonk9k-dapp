// File generated from our OpenAPI spec by Stainless.

package com.earn_app.api.errors

import com.earn_app.api.core.JsonValue
import com.earn_app.api.core.http.Headers

abstract class EarnAppServiceException
protected constructor(message: String, cause: Throwable? = null) :
    EarnAppException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
