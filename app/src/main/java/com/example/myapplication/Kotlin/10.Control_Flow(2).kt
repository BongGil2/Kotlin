package com.example.myapplication.Kotlin

//10 제어흐름

//when

fun main(args: Array<String>) {

    val value: Int = 3

    when (value) {
        1 -> {
            println("value is 1")
        }
        2 -> println("value is 2")
        3 -> {
            println("value is 3")
        }
        else -> {
            println("I do not know value")
        }
    }
    
    val value4:Int =10
    
    when(value4){
        is Int->{ //is 무슨형이 확인하는것
            println("value4 is int")
        }
        else->{
            println("value4 is not int")
        }
    }

    val value5:Int =87
    when (value5){
        in 60..70->{
            println("value is in 60~70")
        }
        in 70..80->{
            println("value is in 70~80")
        }
        in 80..90->{
            println("value is in 80~90")
        }
    }
}