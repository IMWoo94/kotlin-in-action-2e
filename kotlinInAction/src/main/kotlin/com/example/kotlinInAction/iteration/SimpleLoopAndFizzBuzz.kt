package com.example.kotlinInAction.iteration

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz"
    i % 3 == 0 -> "Fizz"
    i % 5 == 0 -> "Buzz"
    else -> "$i"
}

fun main() {
    // 항상 페구간 ( 처음과 끝이 포함 )
    for (i in 1..100) {
        // println(fizzBuzz(i))
    }

    for (i in 100 downTo 1 step 2) {
//        println(fizzBuzz(i))
    }

    for (i in 1..<100) { // until
        println(fizzBuzz(i))
    }
}