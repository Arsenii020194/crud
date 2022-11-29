package com.example.investments.crud.domain.impl

import com.example.investments.crud.domain.api.model.Order
import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(path = "order")
interface OrderRepository: CrudRepository<Order, Long>