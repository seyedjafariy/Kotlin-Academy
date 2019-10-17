package com.worldsnas.kotlinbasics

import kotlin.random.Random









//args vs parameters














//now we go fundamental all the way!















//ok time too see some more functions













//type args and type param
private fun functionWithParameter(first: Int, second: String) {
    println("first parameter= $first, and second parameter=$second")
}











//first and second are called parameters
//we will see what is called an argument in just a bit
//but before that let's see what else is called parameter











private fun <T> functionWithTypeParam(obj : T) {
    println(obj)
}








//we call this "T" a type parameter because we can pass a type instead of a value to it!
//easy peasy!












//we have parameters in class definitions too, so not just functions














private open class NewList<T>











//class NewList has a type parameter "T"


//time to reveal arguments!




















private class EmptyList : NewList<Int>()











//we define Int as type argument
//that was a normal type argument now we can see some argument as well













fun main() {
    val firstArg = Random.nextInt()
    val secondArg = "hello world"

    functionWithParameter(firstArg, secondArg)
}








//these two variable called argument because we pass them to another function
//so generally speeking the declaration is parameter and the value we pass is argument

