package com.practiceKotlin.lec03


fun main(){
    printAgeIfPerson(Person("", 100))

    val person = Person("최태현", 100)

    //java
    println(String.format("이름 : %s", person.name))
    //kotlin
    println("이름 : ${person.name}")

    val name = "최태현"
    println("이름 : $name")

    val str = """
        ABC
        EFG
        ${name}
    """.trimIndent()
    println(str)

    val str2 = "ABC"
    println(str2[0])
    println(str2[2])
}

fun printAgeIfPerson(obj: Any?){
    val person = obj as? Person     //obj가 null이 아니라면 Person
    println(person?.age);
}
