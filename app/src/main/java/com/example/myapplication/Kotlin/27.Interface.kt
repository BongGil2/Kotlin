package com.example.myapplication.Kotlin


// 27. Interface
// - 인터페이스는 약속! ->니가 이것을 구현하면 너도 이타입이다 .
// - 생성자가 없다 -> 인스턴스화 시킬수없다 -> 설명서가 아니다!
// - 지침서 -> 니가 이것을 구현하고 싶다면 반드시 아래 기능을 구현해라!

//인터페이스는 그냥 있으면 된다라는 뜻으로 해결해도된다 내용이 많이 다르지않으면
//인터페이스는 협업을 할때 유용하다

// 상속과 다른점
// -상속은 조상을 찾아가는 느낌
// -인터페이스는 종의 특징

//인터페이스도 구현이 있는 함수를 만들수있다.
//-인터페이스에 구현이 있는 함수는 그 인터페이스를 구현하는 클래스에서 그 함수를 구현할 필요가없다.
//-인터페이스에 구현이 없는 함수는 그 인터페이스를 구현 하는 클래스에서 그 함수를 반드시 구현해야한다.
fun main(args:Array<String>){
    val student_:Student_= Student_()
    student_.eat()
    student_.sleep()
}
// 인터페이스에서 abstract를 하면 무조건 구현을 해야한다.
interface Person_ {
    fun eat(){
        println("먹는다")
    }
    fun sleep(){
        println("잔다")
    }
    abstract fun study()
}

class Student_:Person_{
    override fun study() {

    }
}

class Scoccerplay:Person_{
    override fun study() {

    }
}


open class Person(){
    open fun eat(){

    }

    open fun sleep(){

    }
}

class  Student() : Person(){
    override fun eat() {
        super.eat()
    }
}

class Teacher(){

}