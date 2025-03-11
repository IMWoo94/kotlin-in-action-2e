package com.example.kotlinInAction.throwProcess

import java.io.BufferedReader

fun readNUmber(reader: BufferedReader): Int? {
//    reader.readLine() // IoException Checked Exception 임에도 컴파일단에서 오류를 throw 하지 않아도 문제 없다.

    return try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        null
    } finally {
        reader.close()
    }
}

fun main() {
    println(readNUmber(BufferedReader(java.io.StringReader("not a number"))))
}