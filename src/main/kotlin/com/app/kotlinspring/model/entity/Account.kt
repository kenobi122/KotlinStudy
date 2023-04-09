package com.app.kotlinspring.model.entity

import com.sun.istack.Nullable
import javax.persistence.*

/**
 * Các cột của entity được khai báo bằng primary constructor của kotlin
 */
@Entity
class Account(
    @Column(nullable = false)
    val userName: String,
    val password: String,
    val name: String,
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val accountId: Int? = null,
) {

}