package com.example.myapplication.Kotlin

fun main(array: Array<String>){

    val array = arrayOf<Int>(1,2,3)

    println(array.get(0))

    array.set(1,100)
    println(array.get(1))

    //Array 의 Bounds
    //- 처음 만들때 결정된다
    println(array.size) //배열 갯수 세는법

    //array를 만드는 방법(3)

    val a1= intArrayOf(1,2,3)
    val a2= charArrayOf('b','c')

    //array를 만드는 방법(4) -> lamda 를 활용한 방법
    var a5 =Array(10, { 0 })
    var a6=Array(5, {1;2;3;4;6})
    a2.forEach { print(it) }

}