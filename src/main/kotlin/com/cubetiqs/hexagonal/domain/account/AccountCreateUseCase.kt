package com.cubetiqs.hexagonal.domain.account

import com.cubetiqs.hexagonal.domain.account.model.Account
import com.cubetiqs.hexagonal.domain.account.port.AccountPort
import com.cubetiqs.hexagonal.domain.account.usecase.AccountCreate

class AccountCreateUseCase constructor(
    private val accountPort: AccountPort,
) {
    fun create(useCase: AccountCreate): Account {
        return accountPort.create(useCase)
    }
}