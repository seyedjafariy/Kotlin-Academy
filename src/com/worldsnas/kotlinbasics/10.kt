package com.worldsnas.kotlinbasics

//reified keyword in kotlin
//do you remember in java there was no class object for types?
//with reified in kotlin we can make use of the class object using type parameters


inline fun <reified T : Any> returnClassName(): String =
    T::class.java.simpleName


//but how is that possible
//notice the inline keyword?!
//yeah thats the magic! when kotlin copies your function body to call site
//the compiler can now access the class object of the argument you specified!

fun main() {

    println(
        returnClassName<String>()
    )
}