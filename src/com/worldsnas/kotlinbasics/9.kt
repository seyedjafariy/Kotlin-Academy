package com.worldsnas.kotlinbasics

//inline functions
//kotlin has a ctrl+c and ctrl+v built right into it!
//let's see that does it mean

private fun normalFunction() {
    println("called from normal function")
    println()
    for (element in Thread.currentThread().stackTrace.reversed())
        println(element.methodName)
}

private inline fun anInlineFunction() {
    println("called from inlined function")
    println()
    for (element in Thread.currentThread().stackTrace.reversed())
        println(element.methodName)
}

//great now we can remove all of our functions by adding this keyword!

//wait

//notice the warning on inline keyword?
//it says if you don't have a lambda function the overhead of having inline function on kotlin compiler is just too much!
//that means either we add a lambda function or we remove the inline!

private inline fun functionWithFunction(block: () -> Unit) {
    block()
}


fun main() {
    println("normal function")

    normalFunction()

    println("inline function")

    anInlineFunction()

    println("inline function with lambda")
    functionWithFunction {
        println()
        for (element in Thread.currentThread().stackTrace.reversed())
            println(element.methodName)
    }
}