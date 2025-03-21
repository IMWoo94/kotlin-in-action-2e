package com.example.kotlinInAction.classHierarchyDefinition.kotlinDelegate

class DelegatingCollection<T>(innerList: Collection<T> = mutableListOf<T>()) : Collection<T> by innerList

class CountingSet<T>(private val innerSet: MutableCollection<T> = hashSetOf<T>()) : MutableCollection<T> by innerSet {
    var objectAdded = 0

    override fun add(element: T): Boolean {
        objectAdded++
        return innerSet.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        objectAdded += elements.size
        return innerSet.addAll(elements)
    }
}

fun main() {
    val cset = CountingSet<Int>()
    cset.add(5)
    cset.addAll(listOf(5, 2, 1, 4))
    print(cset.objectAdded)
}