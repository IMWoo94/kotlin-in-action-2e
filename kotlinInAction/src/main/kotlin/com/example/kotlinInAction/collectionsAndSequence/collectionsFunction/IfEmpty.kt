package com.example.kotlinInAction.collectionsAndSequence.collectionsFunction

fun main() {
    val emptyList = emptyList<String>()
    println(emptyList.ifEmpty { listOf("empty") })

    val fullList = listOf("full", "list")
    println(fullList.ifEmpty { listOf("empty") })

}