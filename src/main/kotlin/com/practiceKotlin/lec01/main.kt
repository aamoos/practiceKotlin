package com.practiceKotlin.lec01

/**
 *  var -> 수정가능
 *  val -> 수정불가능 (final)
 */

fun main(){

    var number1 = 10L

    //null이 변수에 들어갈수 있다면 타입뒤에 ?
    var number3: Long? = 1_000L
    number3 = null
}