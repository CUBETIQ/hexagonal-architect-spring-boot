package com.cubetiqs.hexagonal.domain.account

import com.cubetiqs.hexagonal.domain.account.model.Account
import com.cubetiqs.hexagonal.domain.account.port.AccountPort
import com.cubetiqs.hexagonal.domain.account.usecase.AccountRetrieve

class AccountRetrieveUseCase constructor(
    private val accountPort: AccountPort,
) {
    fun retrieve(useCase: AccountRetrieve): Account {
        return accountPort.retrieve(useCase)
    }
}