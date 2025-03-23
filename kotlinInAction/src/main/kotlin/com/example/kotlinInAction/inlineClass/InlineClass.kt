package com.example.kotlinInAction.inlineClass

interface PrettyPrintable {
    fun prettyPrint()
}

@JvmInline
value class UsdCent(val amount: Int) : PrettyPrintable {
    val salesTax get() = amount * 0.06
    override fun prettyPrint() {
        println("UsdCent: $amount")
    }
}

fun addExpense(expense: UsdCent) {

}

fun main() {
    val expense = UsdCent(1_99)
    println(expense.salesTax)
    expense.prettyPrint()
}