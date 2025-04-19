package com.example.kotlinInAction.collectionsAndSequence.collectionsFunction

import com.example.kotlinInAction.collectionsAndSequence.Person

fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val filterList = list.filter { it % 2 == 0 }
    println(filterList)
    println(list)

    val peoples = listOf(Person("alice", 30), Person("bob", 31))
    println(peoples.filter { it.age > 30 })
}