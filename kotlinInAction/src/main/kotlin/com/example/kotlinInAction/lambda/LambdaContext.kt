package com.example.kotlinInAction.lambda

val myFavoriteNumber = run {
    println("I'm thinking")
    println("I'm doing some more work...")
    42
}

fun main() {
    val sum = { x: Int, y: Int -> x + y }
    { println(42) }()
    println(sum(1, 2))

    run { println(42) }
    println(myFavoriteNumber)
}