package com.practiceKotlin.lec14

fun main(){
    val data1 = PersonDto("최태현", 100)
    val data2 = PersonDto("최태현", 200)
    println(data1 == data2)
    println(data1)
}

data class PersonDto(
    val name: String,
    val age: Int,
)
