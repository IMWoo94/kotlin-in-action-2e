package com.example.kotlinInAction.collectionsAndSequence.sequence

fun main() {
    println(
        listOf(1, 2, 3, 4)
            .asSequence()
            .map { it * it }
            .filter { it % 2 == 0 }
            .toList()
    )

    println(
        listOf(1, 2, 3, 4)
            .map { it * it }
            .find { it > 3 }
    )

    println(
        listOf(1, 2, 3, 4)
            .asSequence()
            .map { it * it }
            .find { it > 3 }
    )

    val naturalNumbers = generateSequence(0) { it + 1 }
    val numbersTo100 = naturalNumbers.takeWhile { it <= 100 }
    println(numbersTo100.sum())
}