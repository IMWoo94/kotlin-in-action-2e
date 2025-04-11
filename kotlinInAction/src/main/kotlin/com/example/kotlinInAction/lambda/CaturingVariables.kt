package com.example.kotlinInAction.lambda

fun printMessagesWithPrefix(messages: Collection<String>, prefix: String) {
    messages.forEach {
        println("$prefix $it")
    }
}

fun printProblemCounts(response: Collection<String>) {
    var clientErrors = 0
    var serverErrors = 0
    response.forEach {
        if (it.startsWith("4")) {
            clientErrors++
        } else if (it.startsWith("5")) {
            serverErrors++
        }
    }

    println("$clientErrors client errors, $serverErrors server errors")
}

//fun tryToCountButtonClicks(button: Button): Int {
//    var clicks = 0
//    button.onClick { clicks++ }
//    return clicks -- onClick 이 일어나기 전에 리턴 되면서 결과값은 0 
//}

fun main() {
    val errors = listOf("403 Forbidden", "404 Not Found")
    printMessagesWithPrefix(errors, "Error:")

    val response = listOf("418 I'm a teapot", "500 Internal Server Error")
    printProblemCounts(response)
}