package com.worldsnas.kotlinbasics

//static functions in kotlin
//what is a static function really?
//static function is a function that does not need a context to run (not android context)
//that means they are out of scope of a class
//but how do we create a static function in kotlin?



//first and the most idiomatic way in kotlin to create a static function is
//package level functions


private fun thisIsAStaticFunction(){
    println("called the static function without creating a class")
}

//another ways is to create a function through object keyword

private object SingleObject{

    private fun functionInsideObject(){
        println("object static function has been called")
    }

}

//but functions inside object are not really static
//the reason for that is because your are calling the function on object single instance rather than
//a real static function which is out of scope of an object



//last but not least
//companion objects inside classes

private class ClassWithCompanion{

    companion object {
//        @JvmStatic
        fun staticFunctionFromCompanionObject(){
            println("staticFunctionFromCompanionObject")
        }
    }
}

//same story here we are not creating a real static function here but rather a new object called
//companion

//companion object functions are very usefull when we need a factory for our class


private class Shape private constructor(
    val width : Int,
    val height : Int
){

    companion object{
        fun createSquare(length : Int) =
            Shape(length, length)

        fun createRectangle(width : Int, height : Int) =
            Shape(width, height)
    }
}


fun main() {
    ClassWithCompanion.staticFunctionFromCompanionObject()
}


