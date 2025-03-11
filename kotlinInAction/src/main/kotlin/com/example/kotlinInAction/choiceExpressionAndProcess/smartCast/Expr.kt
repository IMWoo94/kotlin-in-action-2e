package com.example.kotlinInAction.choiceExpressionAndProcess.smartCast

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int {
    if (e is Num) {
        val n = e as Num
        return n.value
    }
    if (e is Sum) {
        return eval(e.right) + eval(e.left)
    }
    throw IllegalArgumentException("Unknown expression")
}

fun evalSimpleIf(e: Expr): Int =
    if (e is Num) e.value
    else if (e is Sum) evalSimpleIf(e.right) + evalSimpleIf(e.left)
    else throw IllegalArgumentException("Unknown expression")

fun evalUseWhen(e: Expr): Int =
    when (e) {
        is Num -> e.value
        is Sum -> evalUseWhen(e.right) + evalUseWhen(e.left)
        else -> throw IllegalArgumentException("Unknown expression")
    }

fun main() {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
    println(evalSimpleIf(Sum(Sum(Num(1), Num(2)), Num(4))))
    println(evalUseWhen(Sum(Sum(Num(1), Num(2)), Num(4))))
}