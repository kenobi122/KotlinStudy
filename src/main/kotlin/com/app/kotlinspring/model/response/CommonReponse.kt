package com.app.kotlinspring.model.response

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

/**
 * Custome repsonse trả về với generic tương tự với java :
 * cấu trúc trả về sẽ là :
   {
    "value": {
      ...object
    }
    }
 */
class CommonReponse<T>(t: T) {
    var value = t
}

// companion tương đương với hàm static trong java
class AnotherResponse{
     companion object{
          fun <T> ok(body: T): ResponseEntity<T> {
               return ResponseEntity.ok(body)
          }

          fun <T> fail(body: T): ResponseEntity<T> {
               return ResponseEntity(body, HttpStatus.BAD_REQUEST)
          }
     }

}
