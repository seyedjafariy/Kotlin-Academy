package com.worldsnas.kotlinbasics

import kotlin.collections.ArrayList







//function with output arguments















//while ago I tweeted about how evil the function with output arguments is!
//today we are going to see what they are and how they are bad












private fun reverse(param1: String): String =
    param1.reversed()








//normal function with a parameter and return type
//this function receives a argument and does some operation on it and returns the new value
//now let's see how a real output arguments look like











private fun appendFooter(param: MutableList<String>) {
    param.add("footer")
}










//appendFooter actually has a parameter which does a operation on the same param but does not return anything
//yet it expects the user to know that the list provided will be updated as desired
//these are called function with output args because the function output will be the same parameter object
//the fix to this readability issue is pretty easy













private fun addFooter(param: MutableList<String>): MutableList<String> {
    val newList = ArrayList(param)
    newList.add("footer")
    return newList
}











//we can easily copy the input list and do our operation and return a new value.
//in Android SDK you can find a ton of functions with Output Args one of the is:

//to see the usage and illustrate the behaviour:
//
//
// val display = activity.windowManager.defaultDisplay
//        val size = Point()
//        display.getSize(size)
//        size.x



fun main() {
    val list = mutableListOf("hello", "paragraph")


    //addFooter it actually works with inner list and returns it
    println(
        "addFooter output= ${addFooter(list)}"
    )


    //this append Footer does not return anything so we have to guess the output!
    appendFooter(list)



    //you can see our final result of list has only one footer and that has come from appendFooter
    println("our list= $list")
}

