package com.example.kotlinInAction.stringRegex

val kotlinLogo =
    """
        |  //
        | //
        |/\
    """.trimIndent()

fun main() {
    println("12.345-6.A".split(".", "-"))    // 단순 문자열
    println("12.345-6.A".split("\\.|-".toRegex()))      // 명시적으로 정규식 선언

    parsePath("/Users/yole/kotlin-book/charter.adoc")
    parsePathRegex("/Users/yole/kotlin-book/charter.adoc")

    println(kotlinLogo)
}

fun parsePath(path: String) {
    val directory = path.substringBeforeLast('/')
    val fullName = path.substringAfterLast('/')
    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")

    println("Dir: $directory, name: $fileName, ext: $extension")
}

fun parsePathRegex(path: String) {
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val match = regex.matchEntire(path)
    if (match != null) {
        val (directory, name, ext) = match.destructured
        println("Dir: $directory, name: $name, ext: $ext")
    }
}