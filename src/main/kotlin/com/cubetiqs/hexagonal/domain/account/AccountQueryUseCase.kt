package com.cubetiqs.hexagonal.domain.account

import com.cubetiqs.hexagonal.domain.account.model.Account
import com.cubetiqs.hexagonal.domain.account.port.AccountPort
import com.cubetiqs.hexagonal.domain.account.usecase.AccountQuery

class AccountQueryUseCase constructor(
    private val accountPort: AccountPort,
) {
    fun query(useCase: AccountQuery): Collection<Account> {
        return accountPort.query(useCase)
    }
}