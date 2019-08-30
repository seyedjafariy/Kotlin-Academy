package com.worldsnas.kotlinbasics

//the mysteroius invoke function


//kotlin has a default function for everything
//so when you call objects or even the lambda functions you are actually calling that invoke function


//did you know you can use invoke with objects?
private object ShapeUtils {

    //try with parameters
    operator fun invoke() {
        println("called ShapeUtils")
    }
}


//hidden invoke function inside lambdas
val lambdaFunction = { param : String ->
    println(param)
}



fun main() {
    ShapeUtils()


    lambdaFunction.invoke("hello world")
    lambdaFunction("hello world")
}