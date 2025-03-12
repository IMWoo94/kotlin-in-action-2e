package com.example.kotlinInAction.extensionMethodAndProperty

@JvmOverloads
fun <T> joinToString(
    collection: Collection<T>,
    separator: String = ", ",
    prefix: String = "",
    postifx: String = "",
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postifx)
    return result.toString()
}

fun <T> Collection<T>.joinToStringByCollection(
    separator: String = ", ",
    prefix: String = "",
    postifx: String = "",
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postifx)
    return result.toString()
}

fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    println(joinToString(list, "; ", "(", ")"))

    println(joinToString(list))
    println(joinToString(list, prefix = "(", postifx = ")"))

    println(list.joinToStringByCollection())
}