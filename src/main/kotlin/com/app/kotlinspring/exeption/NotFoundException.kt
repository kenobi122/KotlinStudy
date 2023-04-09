package com.app.kotlinspring.exeption

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

/**
 * throw exception class voi status bad request
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
class NotFoundException(message: String) : RuntimeException(message) {

}