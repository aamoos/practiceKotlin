package com.practiceKotlin.lec02

fun main(){

    val str: String? = "ABC"
    println(str?.length)        //safe call -> null이 아니면 실행함
    println(str?.length ?: 0)   //NULL이면 0
}

//들어오는 파라미터 타입은 NULL일수 있고
//나가는 파라미터 타입은 NULL일수 없는경우

fun startsWithA1(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어왔습니다");
}

//들어오는 파라미터타입은 NULL일수 있고
//나가는 파라미터도 NULL일수 있는경우
fun startsWithA2(str: String?): Boolean? {
    return str?.startsWith("A")
}

//들어오는 파라미터는 null일수 있고
//나가는 return 타입은 null일수 없다.
fun startsWithA3(str: String?): Boolean {
    return str?.startsWith("A")
        ?: false
}

//정말 null이 아닌경우에만 null 단언사용 !!
fun startsWith(str: String?): Boolean {
    return str!!.startsWith("A")        //!! 느낌표 2개 절대 null이 아니라는뜻
}
