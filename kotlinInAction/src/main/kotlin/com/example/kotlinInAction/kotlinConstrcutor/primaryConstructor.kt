package com.example.kotlinInAction.kotlinConstrcutor

class UserFullConstructor constructor(_nickname: String) {
    val nickname: String

    init {
        this.nickname = _nickname
    }
}

class UserSimpleConstructor constructor(_nickname: String) {
    val nickname: String = _nickname
    var address: String = "unspecified"
        set(value: String) {
            println(
                """
                    Address was changed for $nickname
                    "$field" -> $value
                """.trimIndent()
            )
            field = value
        }
}

class UserDefaultConstructor(
    val nickname: String,
    val isSubscribed: Boolean = false
)

fun main() {
    val alice = UserDefaultConstructor("Alice")
    println(alice.isSubscribed)

    val bob = UserDefaultConstructor("Bob", true)
    println(bob.isSubscribed)

    val carol = UserDefaultConstructor("Carol")
    println(carol.isSubscribed)

    val addressUser = UserSimpleConstructor("Alice")
    addressUser.address = "address modified"
}