package com.app.kotlinspring.model.request

class AccountRequest {
    // kotlin yêu cầu khởi tạo giá trị để tránh null, nên khởi tạo giá trị trống cho field trong hợp hợp field request là null
    val userName: String = ""
    val password: String = ""
    val name: String = ""
}