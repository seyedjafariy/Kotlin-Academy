package com.worldsnas.kotlinbasics










//inline functions











//kotlin has a ctrl+c and ctrl+v built right into it!
//that's favorite feature for lazies!
//let's see that does it mean









private fun normalFunction() {
    println("called from normal function:")
    for (element in Thread.currentThread().stackTrace.reversed())
        println(element.methodName)
}










private inline fun anInlineFunction() {
    println("called from inlined function:")
    for (element in Thread.currentThread().stackTrace.reversed())
        println(element.methodName)
}







//by using inline kotlin will copy the body of your function and paste it where ever you use it
//let's see it in action


//great now we can remove all of our functions by adding this keyword!

//wait

//notice the warning on inline keyword?
//it says if you don't have a lambda function the overhead of having inline function on kotlin compiler is just too much!
//that means either we add a lambda function or we remove the inline!








private inline fun functionWithFunction(block: () -> Unit) {
    block()
}


fun main(args: Array<String>) {
    println("normal function")
    normalFunction()

    println()
    println()
    println()

    println("inline function")
    anInlineFunction()




//    println("inline function with lambda")
//    functionWithFunction {
//        println()
//        for (element in Thread.currentThread().stackTrace.reversed())
//            println(element.methodName)
//    }
}