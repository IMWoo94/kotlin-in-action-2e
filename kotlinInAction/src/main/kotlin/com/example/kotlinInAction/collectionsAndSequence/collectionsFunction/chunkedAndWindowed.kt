package com.example.kotlinInAction.collectionsAndSequence.collectionsFunction

fun main() {
    val temperatures = listOf(27.7, 29.8, 22.5, 35.5, 19.1)
    println(temperatures.windowed(3))
    println(temperatures.windowed(3) { it.average() })

    println(temperatures.chunked(2))
    println(temperatures.chunked(2) { it.maxOrNull() })
}