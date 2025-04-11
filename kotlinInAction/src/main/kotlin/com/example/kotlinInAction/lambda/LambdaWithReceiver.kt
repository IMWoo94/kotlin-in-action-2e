package com.example.kotlinInAction.lambda

fun alphabet(): String {
    val result = StringBuilder()
    for (letter in 'A'..'Z') {
        result.append(letter)
    }
    result.append("\nNow I know the alphabet!")
    return result.toString()
}

fun alphabetWith(): String {
    val result = StringBuilder()
    return with(result) {
        for (letter in 'A'..'Z') {
            append(letter)
        }
        append("\nNow I know the alphabet!")
        toString()
    }
}

fun alphabetApply() = StringBuilder().apply {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
}.toString()

fun alphabetBuildString() = buildString {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
}

fun main() {
    println(alphabet())
    println(alphabetWith())
    println(alphabetApply())
    println(alphabetBuildString())

    val fibonacci = buildList {
        addAll(listOf(0, 1, 2))
        add(3)
        add(index = 0, element = 3)
    }
    println(fibonacci)

    val shouldAdd = true
    val fruits = buildSet {
        add("apple")
        if (shouldAdd) {
            addAll(
                listOf("banana", "orange")
            )
        }
    }
    println(fruits)

    val medals = buildMap<String, Int> {
        put("Gold", 1)
        put("Silver", 2)
        put("Bronze", 3)
    }
    println(medals)

    val fruitsAlso = listOf("banana", "orange")
    val uppercaseFruits = mutableListOf<String>()
    val reversedFruits = fruitsAlso
        .map { it.uppercase() }
        .also { uppercaseFruits.addAll(it) }
        .filter { it.length > 5 }
        .also { println(it) }
        .reversed()

    println(uppercaseFruits)
    println(reversedFruits)
}