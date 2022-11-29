package com.example.investments.crud.domain.api.model

import javax.persistence.*

@Entity
data class Instrument(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val name: String,
    @Enumerated(EnumType.ORDINAL)
    val status: ActivityStatus
)
