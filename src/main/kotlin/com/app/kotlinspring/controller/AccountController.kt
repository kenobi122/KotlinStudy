package com.app.kotlinspring.controller

import com.app.kotlinspring.model.entity.Account
import com.app.kotlinspring.model.request.AccountRequest
import com.app.kotlinspring.model.response.AnotherResponse
import com.app.kotlinspring.model.response.CommonReponse
import com.app.kotlinspring.service.AccountService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("account")
class AccountController {
    // Field inject
    @Autowired
    lateinit var service: AccountService

    @GetMapping("/getAccount/{username}")
    fun getAcc(@PathVariable username: String): ResponseEntity<CommonReponse<Account>> {
        val account = service.getAccount(username);
        return ResponseEntity.ok(CommonReponse(account))
    }

    @GetMapping("/getAccount2/{username}")
    fun getAcc2(@PathVariable username: String): ResponseEntity<Account> {
        return AnotherResponse.ok(service.getAccount(username))
    }

    @PostMapping("/create")
    fun signIn(@RequestBody accountRequest: AccountRequest): String{
        return service.createAccount(accountRequest)
    }

    @PostMapping("/login")
    fun login(@RequestBody accountRequest: AccountRequest) : String {

        return service.loginAccount(accountRequest)
    }


}