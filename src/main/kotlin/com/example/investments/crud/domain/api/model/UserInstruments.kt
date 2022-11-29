package com.example.investments.crud.domain.api.model

import javax.persistence.*

@Entity
data class UserInstruments(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    val userId: User,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "instrument_id", referencedColumnName = "id")
    val instrumentId: Instrument
)