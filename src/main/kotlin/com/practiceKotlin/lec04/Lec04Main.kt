package com.practiceKotlin.lec04

fun main(){
    val money1 = JavaMoney(2_000L)
    val money2 = money1
    val money3 = JavaMoney(1_000L)

    if(money1 > money2){
        println("Money1이 Money2보다 금액이 큽니다")
    }

    //자바의 == 주소 비교
    println(money1 === money3)

    //자바의 equal 비교
    println(money1 == money3)

    //fun1이 true이면 자바처럼 lazy연산이므로 fun1만 호출함 fun2 호출 x
    if(fun1() || fun2()){
        println("본문")
    }

    println(money1 + money2)
}

fun fun1(): Boolean {
    println("fun 1")
    return true
}

fun fun2(): Boolean {
    println("fun 2")
    return true
}