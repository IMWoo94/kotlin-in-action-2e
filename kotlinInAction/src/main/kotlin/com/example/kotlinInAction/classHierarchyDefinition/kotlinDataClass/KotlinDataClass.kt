package com.example.kotlinInAction.classHierarchyDefinition.kotlinDataClass

class Customer(val name: String, val postalCode: Int) {
    override fun toString() = "Customer name : $name, postalCode : $postalCode"
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Customer)
            return false

        return other.name == name && other.postalCode == postalCode
    }

    override fun hashCode() = name.hashCode() * 31 + postalCode
}

data class CustomerData(val name: String, val postalCode: Int)

fun main() {
    val customer1 = Customer("test", 1)
    val customer2 = Customer("test", 1)
    println(customer1.toString())
    println(customer2 == customer1)
    val hashCollection = hashSetOf(customer1)
    println(hashCollection.contains(customer2))

    val customer3 = CustomerData("test", 1)
    val customer4 = CustomerData("test", 1)
    println(customer3.toString())
    println(customer4 == customer3)
    val hashCollectionData = hashSetOf(customer3)
    println(hashCollectionData.contains(customer4))

    val copyCustomer = customer4.copy("test", 2)
    println(copyCustomer)
    println(copyCustomer == customer4)

}