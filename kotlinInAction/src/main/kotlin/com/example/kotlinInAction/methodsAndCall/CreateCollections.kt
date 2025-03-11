package com.example.kotlinInAction.methodsAndCall

fun main(): Unit {
    val set = setOf(1, 2, 3)
    val list = listOf(1, 2, 3)
    val map = mapOf(1 to "one", 2 to "two", 3 to "three")

    println(set.javaClass) // java : getClass()
    println(list.javaClass)
    println(map.javaClass)
}