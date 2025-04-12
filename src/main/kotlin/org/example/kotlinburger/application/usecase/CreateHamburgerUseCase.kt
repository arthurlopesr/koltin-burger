package org.example.kotlinburger.application.usecase

import org.example.kotlinburger.application.dto.HamburgerDTO
import org.example.kotlinburger.domain.model.Hamburger

interface CreateHamburgerUseCase {
    fun createHamburger(hamburger: HamburgerDTO): Hamburger
}