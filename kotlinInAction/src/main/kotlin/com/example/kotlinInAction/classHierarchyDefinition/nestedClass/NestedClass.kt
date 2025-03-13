package com.example.kotlinInAction.classHierarchyDefinition.nestedClass

import java.io.Serializable

interface State : Serializable

interface View {
    fun getCurrentState(): State
    fun getCurrentStateInner(): State
    fun restoreState(state: State) {
        println("View restored")
    }
}

class NestedButton : View {
    override fun getCurrentState(): State = ButtonStateStatic()
    override fun getCurrentStateInner(): State = ButtonStateInner()

    override fun restoreState(state: State) {
        super.restoreState(state)
    }

    class ButtonStateStatic : State {
        fun click() {
            println("ButtonStateStatic click")
        }
    }

    inner class ButtonStateInner : State {
        fun click() {
            println("ButtonStateInner click")
        }
    }
}

class Outer {
    inner class Inner {
        fun getOuterReference(): Outer = this@Outer
    }

    class staticInner {
        fun getOuterReference(): Outer = Outer()
    }
}

fun main() {
    val buttonStateStatic = NestedButton().getCurrentState()
    NestedButton.ButtonStateStatic().click()
    val buttonStateInner = NestedButton().getCurrentStateInner()
//    NestedButton.ButtonStateInner().click()
    NestedButton().ButtonStateInner().click()

}