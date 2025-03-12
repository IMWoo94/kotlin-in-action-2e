package com.example.kotlinInAction.extensionMethodAndProperty

import strings.lastChar

fun main() {
    val receivedObject = "test"
    println(receivedObject.lastChar()) // extension method
    println(receivedObject.lastChar) // extension property

    val sb = StringBuilder("kotlin?")
    println(sb.lastChar())
    println(sb.lastChar)

    sb.lastChar = '!'
    println(sb)
}