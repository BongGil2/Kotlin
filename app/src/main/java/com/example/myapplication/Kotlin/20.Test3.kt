package com.example.myapplication.Kotlin

fun main(array: Array<String>){
    val account:Account= Account("홍길동","1999/3/1",1000)
    println(account.checkBalance())
    println(account.save(1000))
    println(account.withdraw(2000))
    println(account.checkBalance())
}
class Account(val name:String,val birth:String,var balance:Int){
    fun checkBalance():Int{
        return balance
    }
    fun withdraw(amount:Int):Boolean{
        if(balance>=amount){
            balance=balance - amount
            return true
        }else{
            return false
        }

    }
    fun save(amount:Int){
        balance+=amount
    }
}