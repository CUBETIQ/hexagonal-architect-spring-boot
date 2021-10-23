package com.cubetiqs.hexagonal.domain.account.port

import com.cubetiqs.hexagonal.domain.account.model.Account
import com.cubetiqs.hexagonal.domain.account.usecase.AccountCreate
import com.cubetiqs.hexagonal.domain.account.usecase.AccountQuery
import com.cubetiqs.hexagonal.domain.account.usecase.AccountRetrieve

interface AccountPort {
    fun create(useCase: AccountCreate): Account
    fun retrieve(useCase: AccountRetrieve): Account
    fun query(useCase: AccountQuery): Collection<Account>
}