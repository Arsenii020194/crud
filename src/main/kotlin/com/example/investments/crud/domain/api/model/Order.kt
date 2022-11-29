package com.example.investments.crud.domain.api.model

import java.sql.Timestamp
import javax.persistence.*

@Entity
@Table(name = "ORDERS")
data class Order(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val orderId: Long?,
    @Enumerated(EnumType.ORDINAL)
    var orderStatus: OrderStatus?,
    val count: Int,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "instrument_id", referencedColumnName = "id")
    val instrumentId: Instrument,
    val type: Int,
    val created: Timestamp,
    val updated: Timestamp
)