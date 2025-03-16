package com.example.kotlinInAction.classHierarchyDefinition.sealedClass

sealed interface SealedToggleable {
    fun toggle()
}

class LightToggleable : SealedToggleable {
    override fun toggle() {
        println("Light is on now.")
    }
}

class CameraToggleable : SealedToggleable {
    override fun toggle() {
        println("Camera is on now.")
    }
}

fun sealedToggle(toggleable: SealedToggleable): Int {
    when (toggleable) {
        is LightToggleable -> {
            toggleable.toggle()
            return 1
        }

        is CameraToggleable -> {
            toggleable.toggle()
            return 2
        }

        is SealedToggleAllowed -> {
            toggleable.toggle()
            return 3
        }
    }
}