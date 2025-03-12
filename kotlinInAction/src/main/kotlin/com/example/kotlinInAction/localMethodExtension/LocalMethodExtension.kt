package com.example.kotlinInAction.localMethodExtension

class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User) {
    //    if (user.name.isEmpty()) {
//        throw IllegalArgumentException(
//            "Can't save user ${user.id}: name is empty."
//        )
//    }
//
//    if (user.address.isEmpty()) {
//        throw IllegalArgumentException(
//            "Can't save user ${user.id}: address is empty."
//        )
//    }
    fun validate(
        value: String,
        field: String,
    ) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${user.id}: empty $field")
        }
    }

    validate(user.name, "Name")
    validate(user.address, "Address")
}

fun main() {
    saveUser(User(1, "", ""))
}