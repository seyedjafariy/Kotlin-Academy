package com.worldsnas.kotlinbasics









//procedures/functions/methods
























//let see a few functions again
















private fun firstFunction(){
    println("first function")
}















//function with return statement
private fun secondFunction() {
    return println("second function")
}







//what do you think the return type of this function is?
//the difference between functions and procedure are here exactly
//in kotlin we don't have a procedure














@Suppress("SimplifyBooleanWithConstants")
private fun thirdFunction() : Boolean {
    return 1 == 2
}












//now let's see a method!
















private class SingleFunctionClass(){

    fun forthMethod() =
            println("fifth function")

}










//but we call forthMethod a function?!
//method is actually a function!






fun main(){

    firstFunction()

    secondFunction()

    thirdFunction()

    val obj = SingleFunctionClass()
    obj.forthMethod()
}