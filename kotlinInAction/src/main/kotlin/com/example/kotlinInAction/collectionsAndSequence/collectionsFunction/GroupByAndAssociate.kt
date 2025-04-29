package com.example.kotlinInAction.collectionsAndSequence.collectionsFunction

import com.example.kotlinInAction.collectionsAndSequence.Person

fun main() {
    val people = listOf(
        Person("Bob", 27),
        Person("Alice", 30),
        Person("Zoo", 30),
    )

    val ageMap = people.groupBy { it.age }
    println(ageMap)

    val nameToAge = people.associate { it.name to it.age }
    println("associate : $nameToAge")

    // 원래 원소를 key 로 사용
    val personToAge = people.associateWith { it.age }
    println("associateWith : $personToAge")

    // 원래 원소를 value 로 사용
    val ageToPerson = people.associateBy { it.age }
    println("associateBy : $ageToPerson")

    // associate 를 하면서 associateBy 의 결과가 다른건 3개로 나오지만 2건만 나오는걸 볼 수 있는데 이는 map 의 key 값이 동일한 경우 충돌이나면서 마지막 데이터가 나오게 된다
}