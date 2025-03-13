package com.example.kotlinInAction.classHierarchyDefinition.abstractClass

abstract class Animated {

    abstract val animationSpeed: Double
    val keyframes: Int = 20
    open val frames: Int = 60

    abstract fun animate()
    open fun stopAnimating() {
        println("abstract Animated stop")
    }

    fun animateTwice() {
        println("animateTwice")
    }
}