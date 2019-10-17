package com.worldsnas.kotlinbasics











//returns from lambdas labels and anonymous










private fun higherOrderFunction(call: (String) -> Boolean) {
    val list = listOf<Int>(1, 2, 3, 4)
    val mutableList = mutableListOf<Int>()

    list.forEach {

        if (call(it.toString())) {
            return
        } else {
            mutableList.add(it)
        }
    }



    println("function done with list=$mutableList")
}


fun main() {
    higherOrderFunction {
        it == "1"
    }









    //same higher order function but with anonymous function as argument

//    higherOrderFunction(fun(String): Boolean {
//        return false
//    })
}