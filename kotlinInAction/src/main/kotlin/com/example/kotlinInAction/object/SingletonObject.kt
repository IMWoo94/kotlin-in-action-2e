package com.example.kotlinInAction.`object`

import java.io.File

data class PersonInObject(val name: String) {
    object NameComparator : Comparator<PersonInObject> {
        override fun compare(o1: PersonInObject, o2: PersonInObject): Int {
            return o1.name.compareTo(o2.name)
        }
    }
}

object CaseInsensitiveFileComparator : Comparator<File> {
    override fun compare(o1: File, o2: File): Int {
        return o1.path.compareTo(o2.path, ignoreCase = true)
    }
}

fun main() {
    println(
        CaseInsensitiveFileComparator.compare(
            File("/User"), File("/user")
        )
    )

    val files = listOf(File("/Z"), File("/a"))
    println(files.sortedWith(CaseInsensitiveFileComparator))

    val persons = listOf(PersonInObject("John"), PersonInObject("Jane"))
    println(persons.sortedWith(PersonInObject.NameComparator))
}