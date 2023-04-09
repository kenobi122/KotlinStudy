package com.app.kotlinspring.repository

import com.app.kotlinspring.model.entity.Account
import org.springframework.data.jpa.repository.JpaRepository

interface AccountRepository : JpaRepository<Account, Long> {
    // dấu ? thể hiện Account trả về có thể là null, và cần xử lí trong trường hợp account là null, gần giống Optional trong java
    fun findAccountByUserName(userName: String): Account?
}