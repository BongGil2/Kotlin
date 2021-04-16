package com.example.myapplication.Kotlin

//08. 제어흐름
//-if,else

fun main(args: Array<String>) {
    val a: Int = 5
    val b: Int = 10

    val max = if (a > b) {
        a
    } else {
        b
    }
    println(max)

    //엘비스 연산자
    val number: Int? = 100
    val number2 = number ?: 10 // ?: number값이 null값이면 10이 찍히고 null값이 아니면 number값 그대로찍힌다.

    println()
    println(number2)
}