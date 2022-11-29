package com.example.investments.crud.domain.impl

import com.example.investments.crud.domain.api.model.Account
import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(path = "account")
interface AccountRepository : CrudRepository<Account, Long>