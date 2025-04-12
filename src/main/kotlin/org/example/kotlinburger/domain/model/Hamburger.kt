package org.example.kotlinburger.domain.model

import java.util.UUID

data class Hamburger(
    val id: UUID = UUID.randomUUID(),
    val name: String,
    val description: String,
    val price: Double,
    val category: String
)
