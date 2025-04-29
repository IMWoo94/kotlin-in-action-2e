package com.example.kotlinInAction.collectionsAndSequence.collectionsFunction

import com.example.kotlinInAction.collectionsAndSequence.Person
import java.util.*

fun main() {
    // function reduce
    val list = listOf(1, 2, 3, 4, 5, 6)
    println(list.reduce { acc, i -> acc + i })

    println(list.reduce({ acc, i -> acc * i }))
    // reduce 는 기본적으로 내부 구조를 loop 처리가 되고 있음.
    // iterator 를 통해서 {} 람다 함수 operation 를 호출

//    val emptyList = Collections.EMPTY_LIST
//    println(emptyList.reduce { acc, i -> acc })
    // kotlin reduce 의 경우 빈 리스트가 넘어오면 UnsupportedOperationException 예외 발생

    // reduce 를 통한 값은 모든 반복을 돌고나서 마지막 결과값 하나만 나오는데 이롸 관련된 누적 값을 보고 싶으면 runningXX 을 사용하면 누적 리스트가 나온다.
    val summed = list.runningReduce { acc, i -> acc + i }
    println(summed)
    val multiplied = list.runningReduce { acc, i -> acc * i }
    println(multiplied)

    // function fold
    // fold 의 경우 초기 값을 지정할 수 있다 이로 인해서 reduce 의 빈 리스트가 넘어오는 경우 예외가 발생하는 경우에도 초기값만 리턴하면서 문제없이 동작한다.
    val people = listOf(Person("Alice", 29), Person("Bob", 31))

    val folded = people.fold(":") { acc, person ->
        acc + person.name
    }
    println(folded)
    println(Collections.EMPTY_LIST.fold("init:") { acc, i -> acc + i })

    // fold 또한 누적된 값을 보여주는 runningFold 가 있다.
    println(people.runningFold(0) { acc, person -> acc + person.age })

}