package org.example.kotlinburger.application.usecase.impl

import org.example.kotlinburger.application.dto.HamburgerDTO
import org.example.kotlinburger.application.repository.HamburgerRepository
import org.example.kotlinburger.application.usecase.CreateHamburgerUseCase
import org.example.kotlinburger.domain.model.Hamburger
import org.springframework.stereotype.Service

@Service
class CreateHamburgerUseCaseImpl(
    private val hamburgerRepository: HamburgerRepository
) : CreateHamburgerUseCase {

    override fun createHamburger(hamburger: HamburgerDTO): Hamburger {
        val hamburgerDomain = hamburger.toDomain()
        return hamburgerRepository.createHamburger(hamburgerDomain)
    }
}