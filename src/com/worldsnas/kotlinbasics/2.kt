package com.worldsnas.kotlinbasics

//procedures/functions/methods

//let see what a function is

private fun firstFunction(){
    println("first function")
}

private fun secondFunction() {
    return println("second function")
}

private fun thirdFunction() : Unit {
    return println("second function")
}

private class SingleFunctionClass(){

    fun forthMethod() =
            println("fifth function")

}


fun main(){

    firstFunction()

    secondFunction()

    thirdFunction()

    val obj = SingleFunctionClass()
    obj.forthMethod()
}