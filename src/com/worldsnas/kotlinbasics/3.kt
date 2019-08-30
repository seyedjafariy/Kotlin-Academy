package com.worldsnas.kotlinbasics

//higher order functions

private fun thisIsAHigherOrderFunction(secondFunction: (String) -> Unit) {
    secondFunction("hello world")
}

//higher order function is a function that takes another function as parameter
//some of the well known functions that we have been using

fun main() {
    thisIsAHigherOrderFunction {
        println(it)
    }

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
}
