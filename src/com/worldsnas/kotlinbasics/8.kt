package com.worldsnas.kotlinbasics










//the mysterious invoke function
















//kotlin has a default function for everything
//so when you call objects or even the lambda functions
//you are actually calling that invoke function












//did you know you can use invoke with objects?
private object ShapeUtils {

    //try with parameters
    operator fun invoke() {
        println("called ShapeUtils")
    }
}








//as you can see we are using operator on invoke function
//because it's especial type of function













//hidden invoke function inside lambdas
private val lambdaFunction = { param : String ->
    println(param)
}
private val nullableFunction : ((String) -> Unit)? = lambdaFunction








//every lambda has one invoke function hidden!
//and you are using it every day!



fun main() {

    //this parentheses is actually calling
    //that invoke function of ours in in object
    ShapeUtils()



    //with the lambda you can see this two are actually the same
    lambdaFunction.invoke("hello world")
    lambdaFunction("hello world")




    //one case that using invoke on lambdas are helpful is nullable variables
    //you can not call () directly and have to check if object is null or has value!
//    nullableFunction()
    nullableFunction?.invoke("checking nullability when calling the lambda function")
}