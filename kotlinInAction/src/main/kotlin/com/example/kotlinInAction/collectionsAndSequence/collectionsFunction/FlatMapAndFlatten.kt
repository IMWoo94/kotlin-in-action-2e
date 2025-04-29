package com.example.kotlinInAction.collectionsAndSequence.collectionsFunction

class Book(val title: String, val authors: List<String>)

val library = listOf(
    Book("Kotlin in Action", listOf("Isakova", "Elizarov", "Aigner")),
    Book("Kotlin for Android Developers", listOf("sang")),
    Book("Kotlin for Android Developers", listOf("min"))
)

fun main() {
    val authors = library.map { it.authors }
    println(authors)

    val authorsFlat = library.flatMap { it.authors }
    println(authorsFlat)

    val authorsFlatten = library.map { it.authors }.flatten()
    println(authorsFlatten)
}