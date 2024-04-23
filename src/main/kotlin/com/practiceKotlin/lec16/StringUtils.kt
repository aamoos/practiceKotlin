package com.practiceKotlin.lec16

fun main(){
    val str = "ABC"
    println(str.lastChar())

    val person = Person("A", "B", 100)
    person.nextYearAge()
}

//문자열에 존재하는 가장 마지막 문자 가져오기
fun String.lastChar(): Char{
    return this[this.length -1]
}

fun Person.nextYearAge(): Int {
    println("확장 함수")
    return this.age + 1
}