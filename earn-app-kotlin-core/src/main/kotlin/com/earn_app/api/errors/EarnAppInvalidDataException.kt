package com.earn_app.api.errors

class EarnAppInvalidDataException(message: String? = null, cause: Throwable? = null) :
    EarnAppException(message, cause)
