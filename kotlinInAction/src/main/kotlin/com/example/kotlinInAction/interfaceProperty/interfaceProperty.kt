package com.example.kotlinInAction.interfaceProperty

interface EmailUser {
    val email: String
    val nickName: String
        get() = email.substringBefore('@')
}

class SubscribingEmailUser(override val email: String) : EmailUser {
    val nickname: String
        get() = email.toString()
}

interface User {
    val nickname: String // 구현체에 의해서 값을 넣어줄 수 있는 방법이 구현되어야 한다.
}

class PrivateUser(override val nickname: String) : User

class PrivateUserFull constructor(_nickname: String) : User {
    override val nickname: String = _nickname
}

class SubscribingUser(val email: String) : User {
    override val nickname: String get() = email.substringBefore('@')
}

class SocialUser(val accountId: Int) : User {
    override val nickname: String = getFacebookName(accountId)

    fun getFacebookName(accountId: Int): String = getNameFromSocialNetwork(accountId)
}

fun getNameFromSocialNetwork(accountId: Int) = "fb:$accountId"

fun main() {
    println(PrivateUserFull("kobee").nickname)
    println(PrivateUser("kobee").nickname)

    println(SubscribingUser("test@kotlin.com").nickname)
    println(SubscribingUser("123").nickname)

    println(SubscribingEmailUser("kobee@gmail.com").nickname)
}