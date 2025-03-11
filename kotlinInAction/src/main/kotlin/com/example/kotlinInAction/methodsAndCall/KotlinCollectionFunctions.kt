package com.example.kotlinInAction.methodsAndCall

fun main() {
    val strings = listOf("one", "two", "three")

    println(strings.last())
    println(strings.shuffled())

    val nums = setOf(1, 2, 3)
    println(nums.max())
    println(nums.minusElement(nums.last()))
    println(nums.sum())
}