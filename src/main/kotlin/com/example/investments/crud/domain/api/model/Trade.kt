package com.example.investments.crud.domain.api.model

import java.math.BigDecimal
import java.sql.Timestamp
import javax.persistence.*
import javax.validation.constraints.Digits


@Entity
data class Trade(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "instrument_id", referencedColumnName = "id")
    val instrumentId: Instrument,
    val orderId: Long,
    @Column(scale = 2, precision = 8)
    @Digits(integer = 10, fraction = 2)
    val amount: BigDecimal,
    val matched: Timestamp,
    @Enumerated(EnumType.ORDINAL)
    val status: ActivityStatus
)