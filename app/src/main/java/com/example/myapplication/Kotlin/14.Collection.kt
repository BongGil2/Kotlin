package com.example.myapplication.Kotlin

//14.Collection
//-> list ,set,map

//List

fun main(args: Array<String>){

    //값을 변경할수없는 Collection
    //Immutable Collection
    //List-> 중복을 허용한다
    val numberList= listOf<Int>(1,2,3)
    println(numberList)
    println(numberList.get(0))
    //Set -> 중복을 허용하지않는다 , 순서가 없다! index가 없음
    val numberSet = setOf<Int>(1,2,3,3,3)
    println()
    numberSet.forEach{
        println(it)
    }

    //Map -> Key,value방식으로 관리한다
    val numberMap = mapOf<String,Int>("one" to 1,"two" to 2)
    println()
    println(numberMap.get("one"))


    //Mutable Collection 값을 변경할수있는 Collection
    val mNumberList= mutableListOf<Int>(1,2,3)
    mNumberList.add(3,4)
    println()
    println(mNumberList)


    //set은 index가 없다
    val mNuberSet = mutableSetOf<Int>(1,2,3,4,4,4)
    mNuberSet.add(10)
    println(mNuberSet)

    val mNumberMap = mutableMapOf<String,Int>("one" to 1)
    mNumberMap.put("two",2)
    println(mNumberMap)
}