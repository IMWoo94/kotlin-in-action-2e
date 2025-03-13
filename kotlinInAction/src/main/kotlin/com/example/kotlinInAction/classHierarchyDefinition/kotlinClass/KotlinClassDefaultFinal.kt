package com.example.kotlinInAction.classHierarchyDefinition.kotlinClass

import com.example.kotlinInAction.classHierarchyDefinition.kotlinInterface.Clickable

open class RichButton : Clickable {
    fun disable() = println("I'm disabled") // final method so method override is not allow
    open fun animate() = println("I'm animated") // public method so method override is allow
    final override fun click() = println("I'm RichButton clickable")
}

class ThemedButton : RichButton() {
    override fun animate() = println("I'm ThemedButton animated")
//    override fun click() = println("I'm ThemedButton clickable")
}

fun main() {
    val richButton: RichButton = RichButton()
    richButton.animate()
    richButton.click()
    richButton.disable()

    val themedButton: RichButton = ThemedButton()
    themedButton.animate()
    themedButton.click()
    themedButton.disable()
}