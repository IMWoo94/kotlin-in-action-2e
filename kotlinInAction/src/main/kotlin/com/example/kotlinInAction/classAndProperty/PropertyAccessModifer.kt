package com.example.kotlinInAction.classAndProperty

class LengthCounter {
    var counter: Int = 0
        private set

    fun addWord(word: String) {
        counter += word.length
    }
}

fun main() {
    val lengthCounter = LengthCounter()
    lengthCounter.addWord("hello")
    println(lengthCounter.counter)

//    lengthCounter.counter = 2
}

