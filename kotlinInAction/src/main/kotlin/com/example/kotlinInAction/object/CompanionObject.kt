package com.example.kotlinInAction.`object`

class MyClassInCompanionObject {
    companion object {
        fun callMe() {
            println("CompanionObject.callMe")
        }
    }
}

fun main() {
    MyClassInCompanionObject.callMe()
    MyClassInCompanionObject.callMeExtents()
    val myClass = MyClassInCompanionObject()
//    myClass.callMe()
}

fun MyClassInCompanionObject.Companion.callMeExtents() =
    println("MyClassInCompanionObject.callMe")