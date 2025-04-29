package com.example.kotlinInAction.collectionsAndSequence.collectionsFunction

fun main() {
    val names = listOf("jack", "rose", "bill", "tt")
    val ages = listOf(20, 30, 40, 50, 60)
    println(names.zip(ages))
}