package com.worldsnas.kotlinbasics

//LET'S TALK ABOUT FIRST CLASS CITIZENS IN KOTLIN





//HOW MANY OF YOU KNOW WHAT CONSTRUCT IS THE FIRST CLASS CITIZEN IN KOTLIN?


















//functions are first class citizen (lambda)
















//the reason for that is you can create functions anywhere and store them everywhere













//(my) first type of functions in kotlin













private fun thisIsAFunction(parameter: String) =
    println(parameter)








//this function is called package level function and they are not "static" because they are package level!















//function with a cool name








//lets forget about underlines in function names





private fun `this is another function`(){
    println("custom name function called")
}








//very handy to write you tests using this feature and make your outputs more readable






//so far so good?! nothing especial?
//let's see where that first class citizen comes from??










//did you know you could store functions in variables?












//function variable
private var functionVariable = { parameter: String ->
    println(parameter)

    parameter.replaceBefore(" ", "")
}







//now that we stored functions in variables can we really use them as normal function parameter?







//function with function parameter












private fun functionWithFunctionParameter(function: (String) -> String) {
    function("functionWithFunctionParameter")
}




















//cool we can pass function around now










//function returning function

private fun functionWithFunctionReturnType(): (String) -> String {
    return {
        it.reversed()
    }
}











//covered every case?
//too soon!









//extension functions
private fun String.toList() : List<Char> =
    toMutableList().toList()







//please remember these functions are not methods! (we'll talk about method in just a bit)
//compiler wont add this function to String class
















//inner/local functions
private fun functionInsideAnotherFunction() : String{
    fun provideName() =
        "name"

    return provideName().replace("name", "asghar")
}







//mostly used for local repeatable scenarios and recursive algorythms















//come on that should be all about functions!
//not yet actually!









//did you know your class/type could extend functions?











private class MyFunction() : ()->Unit{
    override operator fun invoke() {
        println("hello from my function")
    }

}













//last but not least!
//fun fact!











//you can convert functions!












//converting a normal function to lambda function and assign it to a variable
val thisVariableIsAFunction = ::thisIsAFunction










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


    thisVariableIsAFunction("converted function")
}