package com.example.investments.crud.domain.api.model

import java.math.BigDecimal
import javax.persistence.*
import javax.validation.constraints.Digits

@Entity
data class Account(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val currencyCode: String,
    @Column(scale = 2, precision = 8)
    @Digits(integer = 10, fraction = 2)
    val amount: BigDecimal,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    val userId: User,
    val status: String
)