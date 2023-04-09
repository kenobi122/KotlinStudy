package com.app.kotlinspring.controller

import com.app.kotlinspring.exeption.NotFoundException
import com.app.kotlinspring.model.response.AnotherResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import javax.servlet.http.HttpServletRequest

/**
 * handler error, sử dụng controller advice tương tự như java.
 * Custom message error tại hàm AnotherResponse.fail() , custom lại sau để chứa nhiều thông tin error hơn
 */
@ControllerAdvice
class TestErrorHandler {
     @ExceptionHandler(NotFoundException::class)
     fun handlerNotFoundException(
         servletRequest: HttpServletRequest,
         exception: NotFoundException
     ): ResponseEntity<String?> {
         return AnotherResponse.fail(exception.message)
     }
}