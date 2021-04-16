package com.example.myapplication.Kotlin

class Calculator(){


    fun plus(first: Int,second: Int){
        var c:Int=first+second
        println(c)

    }
    fun minus(first: Int,second: Int){
        var f:Int=first-second
        println(f)

    }
    fun multiple(first: Int,second: Int){
        var y:Int=first*second
        println(y)
    }
    fun division(first: Int,second: Int){
        var z:Int=first/second
        println(z)
    }
}

class Calculator2(val initialValue: Int){
    fun plus(number:Int):Calculator2{
        val result =this.initialValue+number
        return Calculator2(result)
    }
    fun minus(number:Int):Calculator2{
        val result =this.initialValue-number
        return  Calculator2(result)
    }
    fun multiply(number: Int):Calculator2{
        val result=this.initialValue *number
        return Calculator2(result)
    }
    fun divide(number: Int):Calculator2{
        val result=this.initialValue/number
        return Calculator2(result)
    }
}




fun main(array: Array<String>){
   var calculator:Calculator= Calculator()
    calculator.plus(17,20)
    calculator.minus(20,18)
    calculator.multiple(2,9)
    calculator.division(20,10)
    println()
    var calculator2:Calculator2= Calculator2(3)
   val op=calculator2.plus(2).minus(2).initialValue
    println(op)

}