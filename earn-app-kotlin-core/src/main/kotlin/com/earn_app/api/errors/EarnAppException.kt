package com.earn_app.api.errors

open class EarnAppException(message: String? = null, cause: Throwable? = null) :
    RuntimeException(message, cause)
