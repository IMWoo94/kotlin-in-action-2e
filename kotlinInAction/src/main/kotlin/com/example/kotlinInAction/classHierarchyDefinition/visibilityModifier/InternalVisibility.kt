package com.example.kotlinInAction.classHierarchyDefinition.visibilityModifier

open class InternalVisibility {
    internal fun internalVisibility() {
        println("internalVisibility")
    }
}

class ChildInternalVisibility : InternalVisibility() {
    fun childInternalVisibility() {
        internalVisibility()
    }
}

class NotChildInternalVisibility {
    fun notChildInternalVisibility() {
        InternalVisibility().internalVisibility()
        println("used internalVisibility()")
    }
}

fun main() {
    ChildInternalVisibility().childInternalVisibility()
    NotChildInternalVisibility().notChildInternalVisibility()
}