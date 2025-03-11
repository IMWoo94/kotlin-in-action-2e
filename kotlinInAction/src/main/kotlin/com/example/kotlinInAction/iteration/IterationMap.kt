package com.example.kotlinInAction.iteration

fun main() {
    val collection = listOf("red", "brown", "grey")
    for (color in collection) {
        print("$color ")
    }

    println()
    charactersMap()
    withIndex()
}

fun charactersMap(): Unit {
    val binaryReps = mutableMapOf<Char, String>()
    for (char in 'A'..'F') {
        val binary = Integer.toBinaryString(char.code)
        binaryReps[char] = binary
    }

    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }
}

fun withIndex() {
    val collection = listOf("red", "brown", "grey")
    for ((index, element) in collection.withIndex()) {
        println("$index: $element")
    }
}