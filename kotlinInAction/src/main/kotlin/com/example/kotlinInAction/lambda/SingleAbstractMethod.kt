package com.example.kotlinInAction.lambda

fun interface IntCondition {
    fun check(i: Int): Boolean
    fun checkString(s: String) = check(s.toInt())
    fun checkChar(c: Char) = check(c.code)
}

fun checkCondition(i: Int, condition: IntCondition): Boolean {
    return condition.check(i)
}

fun createAllDoneRunnable(): Runnable {
    return Runnable { println("All done!") }
}


fun main() {
    createAllDoneRunnable().run()

    val isOdd = IntCondition { it % 2 != 0 }
    println(isOdd.checkString("123"))
    println(isOdd.checkChar('a'))

    checkCondition(1) { it % 2 == 0 }
    val isEven: (Int) -> Boolean = { it % 2 == 0 }
    checkCondition(2, isEven)
}