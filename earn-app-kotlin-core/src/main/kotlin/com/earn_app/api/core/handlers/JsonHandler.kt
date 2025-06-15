@file:JvmName("JsonHandler")

package com.earn_app.api.core.handlers

import com.earn_app.api.core.http.HttpResponse
import com.earn_app.api.core.http.HttpResponse.Handler
import com.earn_app.api.errors.EarnAppInvalidDataException
import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef

internal inline fun <reified T> jsonHandler(jsonMapper: JsonMapper): Handler<T> =
    object : Handler<T> {
        override fun handle(response: HttpResponse): T {
            try {
                return jsonMapper.readValue(response.body(), jacksonTypeRef())
            } catch (e: Exception) {
                throw EarnAppInvalidDataException("Error reading response", e)
            }
        }
    }
