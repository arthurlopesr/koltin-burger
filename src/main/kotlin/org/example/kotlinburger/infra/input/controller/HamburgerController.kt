package org.example.kotlinburger.infra.input.controller

import org.example.kotlinburger.application.dto.HamburgerDTO
import org.example.kotlinburger.application.usecase.CreateHamburgerUseCase
import org.example.kotlinburger.domain.model.Hamburger
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController()
class HamburgerController(
    private val hamburgerUseCase: CreateHamburgerUseCase
) {

    @PostMapping("/hamburger")
    fun createHamburger(@RequestBody hamburgerDto: HamburgerDTO): Hamburger {
        hamburgerUseCase.createHamburger(hamburgerDto)
        return hamburgerDto.toDomain();
    }
}