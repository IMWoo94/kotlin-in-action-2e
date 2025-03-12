package com.example.kotlinInAction.collectionProcess

fun main() {
    val list = listOf(1, 2, 3, 4, 5)

    println(list.last())
    println(list.sum())

    val array = arrayOf(1, 2, 3, 4, 5)
    val listToArray = listOf(*array, *list.toTypedArray())

    println(listToArray)

    val map = mapOf(1 to "one", 2 to "two", 3 to ("three"))
    println(map)

    val (number, name) = 1 to "one"
    println("$number $name")

}