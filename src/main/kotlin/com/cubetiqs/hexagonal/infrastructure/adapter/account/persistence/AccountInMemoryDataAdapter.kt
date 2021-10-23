package com.cubetiqs.hexagonal.infrastructure.adapter.account.persistence

import com.cubetiqs.hexagonal.domain.account.model.Account
import com.cubetiqs.hexagonal.domain.account.port.AccountPort
import com.cubetiqs.hexagonal.domain.account.usecase.AccountCreate
import com.cubetiqs.hexagonal.domain.account.usecase.AccountQuery
import com.cubetiqs.hexagonal.domain.account.usecase.AccountRetrieve
import java.util.concurrent.ConcurrentHashMap

class AccountInMemoryDataAdapter : AccountPort {
    companion object {
        private val accounts = ConcurrentHashMap<Long, Account>()
    }

    override fun create(useCase: AccountCreate): Account {
        val id = (accounts.size + 1).toLong()
        val account = Account(id, useCase.name, useCase.email, useCase.password)
        accounts[id] = account
        return account
    }

    override fun retrieve(useCase: AccountRetrieve): Account {
        return accounts[useCase.id] ?: throw IllegalArgumentException("Account not found")
    }

    override fun query(useCase: AccountQuery): Collection<Account> {
        return accounts.values.filter { it.name?.contains(useCase.search, ignoreCase = true) == true }
    }
}