package com.example.kotlinInAction.collectionsAndSequence.collectionsFunction

import com.example.kotlinInAction.collectionsAndSequence.Person

fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val filterList = list.map { it % 2 == 0 }
    println(filterList)
    println(list)

    val peoples = listOf(Person("alice", 30), Person("bob", 31))
    println(peoples.map { Person::name })
    println(peoples.map { it.name })
    println(peoples.map(Person::name))
    println(peoples.filter { it.age > 30 }.map(Person::name))
    val oldestPerson = peoples.maxByOrNull { it.age }
    println(peoples.filter { it.age == oldestPerson?.age })


    val numbers = listOf(1, 2, 3, 4, 5, 6, 7)
    val filtered = numbers.filterIndexed { index, i -> index % 2 == 0 && i > 3 }
    println(filtered)
    val mapped = numbers.mapIndexed { index, i -> index * i }
    println(mapped)
}