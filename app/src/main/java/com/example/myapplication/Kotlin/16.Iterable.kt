package com.example.myapplication.Kotlin

//16. Iterable

fun main(array: Array<String>) {

    val a = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)

    //반복하는 방법(1)

    for (item in a) {
        if (item == 5) {
            println("item is Five")
        } else {
            println("item not Five")
        }
    }
    println()

    // 반복하는 방법(2)

    for ((index, a) in a.withIndex()) {
        println("index :" + index + " value : " + a)

    }
    println()
    //반복하는 방법(3)
    a.forEach{
        println(it)
    }
    println()
    //반복하는 방법(4)
    a.forEach { item->
        println(item)

    }
    //인덱스값 표기할때
    a.forEachIndexed { index, item->
        println("index :" + index + " value : " + item)
    }

    //반복하는 방법(6)
    println(a.size)
    for (i in 0 until a.size){
        // until은 마지막을 포함하지 않는다
        // 0부터 8까지 이다.
        println(a.get(i))
    }

    //반복하는 방법(7)
    // step 몇칸씩 띄어서 만들수있음
    for (i in 0 until a.size step (2)){
        println(a.get(i))
    }

    //반복하는 방법(8)
    for(i in a.size -1 downTo (0)){
        //8부터 0까지 반복
        println(a.get(i))
    }

    //반복하는 방법(9)

    for (i in a.size -1 downTo (0) step (2)){
        println(a.get(i))
    }

    //반복하는 방법(10)
    for(i in 0 until a.size){
        //.. -> 마지막을 포함한다 until은 마지막을 포함하지않는다.
        println(i)
    }
    println()
    //반복하는 방법(11)
    var b:Int=0
    var c:Int=4

    while (b<c){
        b++
        println(b)
    }
}