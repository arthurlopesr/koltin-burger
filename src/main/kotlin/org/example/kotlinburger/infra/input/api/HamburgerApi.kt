package org.example.kotlinburger.infra.input.api

import org.example.kotlinburger.application.repository.HamburgerRepository
import org.example.kotlinburger.domain.model.Hamburger
import org.springframework.stereotype.Component

@Component
class HamburgerApi: HamburgerRepository {
    private val hamburgerList: MutableList<Hamburger> = mutableListOf()

    override fun createHamburger(hamburger: Hamburger): Hamburger {
        hamburgerList.add(hamburger)
        return hamburger
    }
}