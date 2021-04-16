package com.example.myapplication.Kotlin

//두번까지는 봐준다(같은 기능 사용) 반복을 피해라
//두번 이상이 넘어가면 리펙토링해라(정리정돈)

//25. 상속


fun main(args:Array<String>){
    val superCar3:SuperCar3= SuperCar3()
    println(superCar3.drive())
    superCar3.drive()
    superCar3.stop()
}
// 코틀린은 기본으로 private가 사용된다 생략되어있음
// open하면 다른 클래스에 상속가능한 부모 클래스가 되고 사용할수있습니다.
open class Car3(){
    open fun drive():String{
        //println("달립니다")
        return "달린다."
    }
    open fun stop(){
        print("멈춥니다.")
    }
}

class SuperCar3() : Car3(){
    override fun drive():String {
        //println("빨리 달린다.")
        val run=super.drive()
        return "빨리 $run"
    }

    override fun stop() {
        super.stop()
    }
}


class Bus3() : Car3(){

}