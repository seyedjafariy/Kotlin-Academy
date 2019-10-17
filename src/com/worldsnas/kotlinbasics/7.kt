package com.worldsnas.kotlinbasics









//static functions in kotlin















//what is a static function really?
//static function is a function that does not need a context to run (not android context!!!)
//that means they are out of scope of a class
//but how do we create a static function in kotlin?
//easy answer is we don't! because in kotlin there is nothing as static function












//first and the most idiomatic (kotlin-ish) way in kotlin to create a static function is
//package level functions


















private fun thisIsAPackageLevelFunction(){
    println("called the PackageLevel function without creating a class")
}









//we call them package level because they are not bound to a class
// the only thing they need is just a package!
//to use this function you can import and just call it anywhere in your project
//these type are the preferred ones
//let's see some more











//another ways is to create a function through object keyword













private object SingleObject{

    private fun functionInsideObject(){
        println("object function has been called")
    }

}








//when using they look very similar to static functions
//but functions inside object are not really static
//the reason for that is because your are calling the function on object
//single instance rather than a real static function which is out of scope of an object












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







//same story here we are not creating a real static function for ClassWithCompanion
//but rather a new object called companion which has only one instance
//remember if you need to call you companion object from java code as static functions
//you need to add the @JvmStatic
//just watch out for you method count when you add @JvmStatic
//but what is the use case?
//companion object functions are very useful when we need a factory for our class











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
    Shape.createSquare(50)
}

//you can see we have the power of factory method for our class using companion objects
