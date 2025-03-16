package com.example.kotlinInAction.classAndProperty

class Person(val name: String, var isStudent: Boolean)

class PersonByBirthYear(var birthYear: Int) {
    var ageIn2050
        get() = 2050 - birthYear
        set(value) {
            birthYear = 2050 - value
        }
}
