package com.example.kotlinInAction.`object`

interface AnonymousMouseListener {
    fun onEnter()
    fun onClick()
}

class AnonymousButton(private val listener: AnonymousMouseListener) {
    fun onClick() {
        listener.onClick()
    }

    fun onEnter() {
        listener.onEnter()
    }
}

fun main() {
    val button = AnonymousButton(object : AnonymousMouseListener {
        override fun onEnter() {
            println("onEnter")
        }

        override fun onClick() {
            println("onClick")
        }
    })

    button.onClick()
    button.onEnter()
}