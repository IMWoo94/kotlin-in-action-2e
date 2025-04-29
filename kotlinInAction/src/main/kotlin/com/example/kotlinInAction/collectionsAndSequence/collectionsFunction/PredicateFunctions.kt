package com.example.kotlinInAction.collectionsAndSequence.collectionsFunction

import com.example.kotlinInAction.collectionsAndSequence.Person

fun main() {
    val canBeInClub27 = { p: Person -> p.age <= 27 }
    val people = listOf(Person("Alice", 27), Person("Bob", 31))

    println(people.all(canBeInClub27))
    println(people.any(canBeInClub27))

    val list = listOf(1, 2, 3)
    println(!list.all { it == 3 })
    println(list.any { it != 3 })
    println("empty predicate all :" + emptyList<Int>().all { it == 3 }) // 공허한 참 ( vacuous true )
    println("empty predicate any :" + emptyList<Int>().any { it == 3 })
    println("empty predicate none :" + emptyList<Int>().none { it == 3 })

    println(list.any { it != 4 })
    println(list.none { it == 4 })

    println(people.count(canBeInClub27))
    println(people.filter(canBeInClub27).size)

    println(people.find(canBeInClub27))
}