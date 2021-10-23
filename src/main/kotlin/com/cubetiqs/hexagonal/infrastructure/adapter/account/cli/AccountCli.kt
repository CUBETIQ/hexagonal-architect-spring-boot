package com.cubetiqs.hexagonal.infrastructure.adapter.account.cli

import com.cubetiqs.hexagonal.domain.account.model.Account
import com.cubetiqs.hexagonal.domain.account.port.AccountPort
import com.cubetiqs.hexagonal.domain.account.usecase.AccountCreate
import com.cubetiqs.hexagonal.domain.account.usecase.AccountQuery
import com.cubetiqs.hexagonal.domain.account.usecase.AccountRetrieve

class AccountCli constructor(
    private val accountPort: AccountPort,
) {
    fun create(name: String, email: String, password: String): Account {
        return accountPort.create(
            AccountCreate(
                name = name,
                email = email,
                password = password,
            )
        )
    }

    fun retrieve(accountId: Long): Account {
        return accountPort.retrieve(AccountRetrieve(accountId))
    }

    fun query(search: String): Collection<Account> {
        return accountPort.query(AccountQuery(search))
    }
}