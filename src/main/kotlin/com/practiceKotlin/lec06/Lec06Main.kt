package com.practiceKotlin.lec06

fun main(){
    val numbers = listOf(1L, 2L, 3L)
    for(number in numbers){
        println(number)
    }

    //1씩증가
    for(i in 1..3){
        println(i)
    }

    //1씩 감소
    for(i in 3 downTo 1){
        println(i)
    }

    //2씩증가
    for(i in 1..5 step 2){
        println(i)
    }

}