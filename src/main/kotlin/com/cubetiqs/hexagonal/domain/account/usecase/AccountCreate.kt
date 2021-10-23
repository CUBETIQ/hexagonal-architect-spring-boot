package com.cubetiqs.hexagonal.domain.account.usecase

open class AccountCreate (
    var name: String,
    var email: String,
    var password: String,
) {
    override fun toString(): String {
        return "AccountCreate(name='$name', email='$email', password='$password')"
    }
}