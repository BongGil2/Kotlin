package com.example.myapplication.Kotlin

var a = 1 + 2 + 3 + 4 + 5 // 연산의 결과 값을 변수에 넣어 줄수있다.
var b = "1"
var c = b.toInt() // 인트로 바꿔줌
var d = b.toFloat() //float 로 바꿔줌

var e = "John"
var f = "My name is $e Nice to meet you" // $는 변수e의 값이 들어간다.

//Null
//- 존재하지 않는다.

//var abc :Int = null
var abc1: Int? = null //"null" (x) 문자열이 null이 아님
var abc2: Double? = null// ? 이걸 적어주면 null을 가질수있다.

var g = a + 3

fun main(array: Array<String>) {
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(g)
    println(abc1)
}
