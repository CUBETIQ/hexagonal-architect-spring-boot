package com.cubetiqs.hexagonal.domain.account.model

open class Account (
    var id: Long? = null,
    var name: String? = null,
    var email: String? = null,
    var password: String? = null,
) {
    override fun toString(): String {
        return "Account(id=$id, name=$name, password=$password, email=$email)"
    }
}