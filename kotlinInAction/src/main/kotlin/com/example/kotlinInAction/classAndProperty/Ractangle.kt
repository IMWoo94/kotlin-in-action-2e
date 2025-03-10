package com.example.kotlinInAction.classAndProperty

class Ractangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width
}