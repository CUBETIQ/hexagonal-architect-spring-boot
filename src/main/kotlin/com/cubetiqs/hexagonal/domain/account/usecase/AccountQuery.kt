package com.cubetiqs.hexagonal.domain.account.usecase

open class AccountQuery(
    var search: String,
) {
    override fun toString(): String {
        return "AccountQuery(search=$search)"
    }
}