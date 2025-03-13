package com.example.kotlinInAction.classHierarchyDefinition.visibilityModifier

class PublicVisibility {
    fun sayHello() {
        println("Hello")
    }
}

fun main() {
    val visibilityModifier = PublicVisibility()
    visibilityModifier.sayHello()
}