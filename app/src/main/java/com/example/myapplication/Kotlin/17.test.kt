package com.example.myapplication.Kotlin

fun first(){
    val list1= MutableList(9,{0})
    val list2= MutableList(9,{true})

    for( i in 0..8){
        list1[i]=i+1
    }

        list1.forEachIndexed { index, value ->
            if(value % 2==0){
                list2[index]=true
            }else{
                list2[index]=false
            }

        }

    val a= mutableListOf<Int>()
    val b= mutableListOf<Boolean>()
    for (i in 1..9){
        a.add(i)
    }
    println(a)
    a.forEach {
        if (it % 2 == 0) {
            b.add(true)
        }else{
            b.add(false)
        }

    }
    println(b)
}
fun second(score : Int) : String{

    var c:String
    when(score){
     in 80..90 -> c="A"
     in 70..79 -> c="B"
     in 60..69-> c="C"
     else -> c="F"
    }
     return c
}

fun third(number:Int):Int{

    var d:Int=number/10
    var e:Int=number%10



    return d+e

}
fun gugudan(){


    for (y in 1..9) {

        for (z in 1..9) {
            println("$y x $z =${y * z}") //$는 부르는것 잘알기
        }
    }

}



    fun main(array: Array<String>) {

        first()
        println(second(80))
        println(third(89))
        gugudan()
    }
