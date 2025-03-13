package com.example.kotlinInAction.classHierarchyDefinition.visibilityModifier

open class PrivateVisibility {
    private fun privateVisibility() {
        println("privateVisibility")
    }
}

class ChildPrivateVisibility : PrivateVisibility() {
//    override fun privateVisibility() {
//        println("childPrivateVisibility")
//    }

    fun childPrivateVisibility() {
//        super<PrivateVisibility>.privateVisibility()
        println("childPrivateVisibility")
    }
}

fun main() {
    ChildPrivateVisibility().childPrivateVisibility()
}