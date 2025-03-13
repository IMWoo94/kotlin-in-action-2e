package com.example.kotlinInAction.classHierarchyDefinition.visibilityModifier

open class ProtectedVisibility {
    protected fun protectedVisibility() {
        println("protectedVisibility")
    }
}

class ChildProtectedVisibility : ProtectedVisibility() {
    fun childProtectedVisibility() {
        protectedVisibility()
    }
}

class NotChildProtectedVisibility {
    fun notChildProtectedVisibility() {
//        Parent().protectedVisibility()
        println("not used protectedVisibility()")
    }
}

fun main() {
    ChildProtectedVisibility().childProtectedVisibility()
}