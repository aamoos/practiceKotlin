package com.practiceKotlin.lec19

import com.practiceKotlin.lec19.a.printHelloWorld as printHelloWorldA
import com.practiceKotlin.lec19.a.printHelloWorld as printHelloWorldB

 class Person(
    val name: String,
    val age: Int
){
    operator fun component1(): String {
        return this.name
    }

    operator fun component2(): Int {
        return this.age
    }
}

fun main(){
    printHelloWorldA()
    printHelloWorldB()

    val person = Person("최태현", 100)
    val (name, age) = person
//    val name = person.component1()
//    val age = person.component2()

    println("이름 : ${name}, 나이 : ${age}")

    val numbers = listOf(1, 2, 3)
    numbers.map { number -> number + 1 }
        .forEach{ number ->
            println(number)
        }

    for (nubmer in numbers) {
        if (nubmer == 2){
            break;
        }
    }

    run {
        numbers.forEach {
            number -> if(number == 2){
                return@run
            }
        }
    }

    abc@ for (i in 1..100){
        for (j in 1..100) {
            if (j == 2) {
                break@abc
            }
            println("${i} ${j}")
        }
    }


}