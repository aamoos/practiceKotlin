package com.practiceKotlin.lec09

//자바에서 객체 가져와도 .으로 가져올수있음
fun main(){
//    var person = Person("최태현")
//    println(person.name)
//    person.age = 10
//    println(person.age)
    Person()
}

//코틀린에서는 getter setter 자동으로 생성
//주생성자
class Person(
    name: String = "최태현"
    , var age: Int = 1
){

    var name = name
        set(value){
            field = value.uppercase()
        }

    fun getUpperCaseName(): String {
        return this.name.uppercase()
    }

    val uppercaseName: String
        get() = this.name.uppercase()

    init{
        //클래스가 초기화될때 처음에 불려짐
        if(age <= 0){
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다")
        }
        println("초기화 블록")
    }

    constructor(name: String): this(name, 1){
        println("첫 번째 부생성자")
    }

    constructor(): this("홍길동"){
        println("두 번째 부생성자")
    }

    fun isAdult(): Boolean {
        return this.age >= 20
    }

    val isAdult: Boolean
        get() = this.age >= 20


}
