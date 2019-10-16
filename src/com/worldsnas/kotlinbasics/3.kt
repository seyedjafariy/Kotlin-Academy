package com.worldsnas.kotlinbasics









//higher order functions















private fun thisIsAHigherOrderFunction(secondFunction: (String) -> Unit) {
    secondFunction("hello world")
}










//we have seen it before! no surprises there!

//In the world of functional paradigm this function is called higher-order function
//that basically means function accepting another function as parameter



//some of the well known functions that we have been using in Kotlin std
fun main() {


    "hello world".apply {

    }

    "hello world".also {

    }

    "hello world".run {
        length
    }

    "hello world".runCatching {
        toDouble()
    }

    "hello world".let {
        it.length
    }




    //let's take a moment and discuss the difference of them!


    //there is actually no difference!




    thisIsAHigherOrderFunction {
        println(it)
    }
}
