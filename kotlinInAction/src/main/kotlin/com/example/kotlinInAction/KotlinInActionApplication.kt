package com.example.kotlinInAction

import com.example.kotlinInAction.classAndProperty.Person
import com.example.kotlinInAction.classAndProperty.Ractangle
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinInActionApplication

fun main(args: Array<String>) {
    runApplication<KotlinInActionApplication>(*args)

    val person = Person("John", false)
    println(person.name + person.isStudent)

    person.isStudent = false
    println(person.name + person.isStudent)

    val ractangle = Ractangle(20, 20)
    println(ractangle.isSquare)
}
