package com.practiceKotlin.lec15

import org.springframework.stereotype.Controller

fun main() {

    val array = arrayOf(100, 200)

    for(i in array.indices){
        println("${i} ${array[i]}")
    }

    for((idx, value) in array.withIndex()){
        println("$idx $value")
    }

    array.plus(300)

    val numbers = listOf(100, 200)
    val emptyList = emptyList<Int>()

    printNumbers(emptyList)

    println(numbers[0])

    for(number in numbers){
        println(number)
    }

    for((idx, value) in numbers.withIndex()){
        println("${idx} ${value}")
    }

    //가변 리스트 생성
    val numbers2 = mutableListOf(100, 200)
    numbers2.add(300)

    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "MONDAY"
    oldMap[2] = "TUESDAY"

    mapOf(1 to "MONDAY", 2 to "TUESDAY")

    for(key in oldMap.keys){
        println(key)
        println(oldMap[key])
    }



}

private fun printNumbers(numbers: List<Int>){

}