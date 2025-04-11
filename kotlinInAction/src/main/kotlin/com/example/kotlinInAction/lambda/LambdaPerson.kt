package com.example.kotlinInAction.lambda

data class LambdaPerson(val name: String, val age: Int) {
}

fun findTheOldest(people: List<LambdaPerson>) {
    var maxAge = 0
    var theOldest: LambdaPerson? = null
    for (person in people) {
        if (person.age > maxAge) {
            maxAge = person.age
            theOldest = person
        }
    }

    println(theOldest)
}

fun main() {
    val people = listOf(LambdaPerson("Alice", 29), LambdaPerson("Bob", 31))
//    findTheOldest(people)
    println(people.maxByOrNull { it.age })
    println(people.maxByOrNull(LambdaPerson::age))
    println(people.maxByOrNull({ p: LambdaPerson -> p.age }))
    println(people.maxByOrNull() { p: LambdaPerson -> p.age })
    println(people.maxByOrNull { p: LambdaPerson -> p.age })
    println(people.maxByOrNull { p -> p.age })

    val names = people.joinToString(
        separator = " ",
        transform = { p: LambdaPerson -> p.name }
    )
    val simpleNames = people.joinToString(" |") { p: LambdaPerson -> p.name }
    println(names)
    println(simpleNames)
}