package com.example.kotlinInAction.classHierarchyDefinition.kotlinInterface

interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable!")
}

interface Focusable {
    fun setFocus(b: Boolean) = println("I'm ${if (b) "got" else "lost"} focusable!")
    fun showOff() = println("I'm focusable!")
}

class Button : Clickable, Focusable {
    override fun click() {
        println("I clicked")
    }

    override fun showOff() {
        super<Focusable>.showOff()
        super<Clickable>.showOff()
    }
}

fun main() {
    val button = Button()
    button.click()
    button.showOff()
    button.setFocus(true)
}