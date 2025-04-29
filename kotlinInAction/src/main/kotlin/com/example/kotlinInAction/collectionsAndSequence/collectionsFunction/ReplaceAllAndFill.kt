package com.example.kotlinInAction.collectionsAndSequence.collectionsFunction

fun main() {
    val names = mutableListOf("Alice", "Bob", "Cedric")
    names.add("Andrey")
    println(names)

    names.replaceAll { it.uppercase() }
    println(names)
    names.fill("X")
    println(names)

    val unmutable = listOf("Alice", "Bob", "Cedric")
//    unmutable.add() // 불가
    println(unmutable)
//    unmutable.replaceAll() // 불가

}