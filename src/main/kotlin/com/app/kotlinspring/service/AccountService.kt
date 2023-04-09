package com.app.kotlinspring.service

import com.app.kotlinspring.model.entity.Account
import com.app.kotlinspring.model.request.AccountRequest

interface AccountService {
    fun getAccount(username: String): Account
    fun getAccount2(username: String): Account
    fun createAccount(accountRequest: AccountRequest): String
    fun loginAccount(accountRequest: AccountRequest) : String
}