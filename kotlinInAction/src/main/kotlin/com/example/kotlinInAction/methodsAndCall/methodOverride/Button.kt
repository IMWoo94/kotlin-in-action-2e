package com.example.kotlinInAction.methodsAndCall.methodOverride

class Button : View() {
    override fun click() = println("Button clicked")
}

fun Button.showOff() = println("Button show off")
fun View.showOff() = println("I'm off")

fun main() {
    val view: View = Button()
    view.click()
    view.showOff()
}