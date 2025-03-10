package com.example.kotlinInAction.classAndProperty

fun main() {
    val person = Person("John", false)
    println(person.isStudent)

    person.isStudent = true
    println(person.isStudent)
}
