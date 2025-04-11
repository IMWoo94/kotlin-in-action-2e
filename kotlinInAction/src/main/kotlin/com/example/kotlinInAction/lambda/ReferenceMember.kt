package com.example.kotlinInAction.lambda

data class ReferencePerson(val name: String, var age: Int)

fun ReferencePerson.isAdult() = age >= 20

fun salute() = println("Salute!")

fun sendEmail(person: ReferencePerson, message: String) =
    println("Sending email to ${person.name} about $message")

fun main() {
    run(::salute)
    val person = ReferencePerson("Jack", 30)
    val action =
        { referencePerson: ReferencePerson, message: String -> sendEmail(person = referencePerson, message = message) }
    val nextAction = ::sendEmail

    run { action(person, "hello") }
    run { nextAction(person, "hello") }

    val createPerson = ::ReferencePerson
    val p = createPerson("Jack", 30)
    println(p)
    println(p::isAdult)

    val personsAgeFunction = ReferencePerson::age
    println(personsAgeFunction(person))

    val ageFunction = person::age
    println(ageFunction())
}
