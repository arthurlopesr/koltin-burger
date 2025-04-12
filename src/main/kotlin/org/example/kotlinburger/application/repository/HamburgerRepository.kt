package org.example.kotlinburger.application.repository

import org.example.kotlinburger.domain.model.Hamburger

interface HamburgerRepository {
    fun createHamburger(hamburger: Hamburger): Hamburger
}