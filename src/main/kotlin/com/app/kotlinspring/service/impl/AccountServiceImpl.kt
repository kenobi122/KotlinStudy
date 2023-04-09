package com.app.kotlinspring.service.impl

import com.app.kotlinspring.exeption.NotFoundException
import com.app.kotlinspring.model.entity.Account
import com.app.kotlinspring.model.request.AccountRequest
import com.app.kotlinspring.repository.AccountRepository
import com.app.kotlinspring.service.AccountService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Sử dụng constructor injection để inject các dependencies vào.
 * Field inject không được recommend , ex field inject: @Autowired lateinit var repository: AccountRepository
 * Không cần chú thích Autowired lên constructor  AccountServiceImpl(private val repository: AccountRepository)
 */
@Service
class AccountServiceImpl @Autowired constructor(private val repository: AccountRepository) : AccountService {
    // cách viết khác của function trong kotlin
    override fun getAccount(username: String) = repository.findAccountByUserName(username) ?: throw NotFoundException("This shit not found")

    override fun getAccount2(username: String): Account {
        return repository.findAccountByUserName(username) ?: throw NotFoundException("not found la")
    }

    override fun createAccount(accountRequest: AccountRequest): String {
        val account = Account(accountRequest.userName, accountRequest.password, accountRequest.name)
        repository.save(account)
        return account.name
    }

    override fun loginAccount(accountRequest: AccountRequest): String {
        val account = repository.findAccountByUserName(accountRequest.userName) ?: throw NotFoundException("still not found")
        return account.userName
    }

}