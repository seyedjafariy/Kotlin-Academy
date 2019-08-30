package com.worldsnas.kotlinbasics

//LET'S TALK ABOUT FIRST CLASS CITIZENS IN KOTLIN

//HOW MANY OF YOU KNOW WHAT CONSTRUCT IS THE FIRST CLASS CITIZEN IN KOTLIN?





//functions are first class citizen (lambda)

//the reason for that is you can create functions anywhere and store them everywhere
private fun thisIsAFunction(parameter: String) =
    println(parameter)

private fun `this is another function`(){
    println("custom name function called")
}

private var functionVariable = { parameter: String ->
    println(parameter)

    parameter.replaceBefore(" ", "")
}

private fun functionWithFunctionParameter(function: (String) -> String) {
    function("functionWithFunctionParameter")
}

private fun functionWithFunctionReturnType(): (String) -> String {
    return {
        it.reversed()
    }
}

private fun String.toList() : List<Char> =
    toMutableList().toList()


private fun functionInsideAnotherFunction() : String{
    fun provideName() =
        "name"

    return provideName().replace("name", "asghar")
}

private class MyFunction() : ()->Unit{
    override operator fun invoke() {
        println("hello from my function")
    }

}

fun main() {
    thisIsAFunction("hello world")

    `this is another function`()

    thisIsAFunction(functionVariable("hello world"))
    thisIsAFunction(functionVariable.invoke("hello world"))

    functionWithFunctionParameter(functionVariable)

    functionWithFunctionParameter {
        it
    }

    thisIsAFunction(
        functionWithFunctionReturnType()("olleh")
    )

    println("hello world".toList())

    functionInsideAnotherFunction()


    val myFunction = MyFunction()
    myFunction()
}