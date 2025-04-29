package com.example.kotlinInAction.collectionsAndSequence.collectionsFunction

import com.example.kotlinInAction.collectionsAndSequence.Person

fun main() {
    val people = listOf(
        Person("Bob", 27),
        Person("Alice", 30),
        Person("Zoo", 30),
    )
    val canBeInClub27 = { p: Person -> p.age <= 27 }

    val comIn = people.filter(canBeInClub27)
    val comOut = people.filterNot(canBeInClub27)
    println(comIn)
    println(comOut)

    val (in27, out27) = people.partition(canBeInClub27)
    println(in27)
    println(out27)
}