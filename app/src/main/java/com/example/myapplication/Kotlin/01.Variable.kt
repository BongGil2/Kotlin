package com.example.myapplication.Kotlin

// 01. variable -> 변수
//-> 상자
// 내마음대로 원하는것을 넣을 수있는 상자 ->variable
// 한번 넣으면 바꿀수없는 상자 -> value
//변수 선언하는 방법
//var/val 변수명(상자) = 값 (넣고싶은 것)
//variable/Value
var num = 10
var hello = "hello"
var point = 3.4

val fix = 20

fun main(args: Array<String>) {
    println(num)
    println(hello)
    println(point)
    println(fix)

    num = 100
    hello = "Goodbye"
    point = 10.4

    println(num)
    println(hello)
    println(point)
    println(fix)
}