package com.example.myapplication.Kotlin

// 23.접근 제어자




fun main(array: Array<String>){

    val testAccess :TestAccess = TestAccess("아무개")
    testAccess.test()
    println(testAccess.name)
    testAccess.name="아무개 투"
    println(testAccess.name)

    val reward:Reward= Reward()
    reward.rewardAmount=2000

    val runningCar:RunningCar= RunningCar()
    runningCar.runFast()


}

class Reward(){
    public var rewardAmount:Int=1000
}


class TestAccess{
    var name:String="홍길동" //외부에서는 변경이 불가하다

    constructor(name:String){
        this.name=name
    }
    fun changeName(newName:String){
        this.name=newName
    }
    fun test(){
        println("테스트")
    }
}

class RunningCar(){

    fun runFast(){ // 여기에 run()이 필요해서 run()을 사용함
        run()
    }
    private fun run(){ //외부에 공개하지않는 기능

    }
}