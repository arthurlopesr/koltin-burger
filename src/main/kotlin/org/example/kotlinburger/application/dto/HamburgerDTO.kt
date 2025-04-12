package org.example.kotlinburger.application.dto

import org.example.kotlinburger.domain.model.Hamburger

data class HamburgerDTO(
    val name: String,
    val description: String,
    val price: Double,
    val category: String
) {
    fun toDomain(): Hamburger {
        return Hamburger(
            name = this.name,
            description = this.description,
            price = this.price,
            category = this.category
        )
    }
}