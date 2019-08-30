package com.worldsnas.kotlinbasics

import kotlin.random.Random

//args vs parameters

//type args and type param
private fun functionWithParameter(first: Int, second: String) {
    println("first parameter= $first, and second parameter=$second")
}

//we have a type parameter T
private open class NewList<T>

//we define Int as type argument
private class EmptyList : NewList<Int>()


private fun <T> functionWithTypeParam(obj : T) {
    println(obj)
}

fun main() {
    val firstArg = Random.nextInt()
    val secondArg = "hello world"

    functionWithParameter(firstArg, secondArg)
}

//so generally speeking the declaration is parameter and the value we pass is argument

