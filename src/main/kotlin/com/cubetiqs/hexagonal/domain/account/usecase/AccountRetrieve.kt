package com.cubetiqs.hexagonal.domain.account.usecase

open class AccountRetrieve(
    var id: Long,
) {
    override fun toString(): String {
        return "AccountRetrieve(id=$id)"
    }
}