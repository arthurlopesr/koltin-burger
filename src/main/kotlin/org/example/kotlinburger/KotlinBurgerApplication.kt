package org.example.kotlinburger

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinBurgerApplication

fun main(args: Array<String>) {
    runApplication<KotlinBurgerApplication>(*args)
}
