package com.worldsnas.kotlinbasics










//reified keyword in kotlin











//do you remember in java there was no class object for types?

//fun <T> notPossibleClassType(){
//    T::class.java
//}

//as you can see it shows an error


//with reified in kotlin we can make use of the class object using type parameters
//let's see an example










inline fun <reified T : Any> returnClassName(): String =
    T::class.java.simpleName












//as you can see we can actually use the type parameter class object in our function
//that is so cool
//but how is that possible
//notice the inline keyword?!
//yeah thats the magic! when kotlin copies your function body to call site
//the compiler can now access the class object of the argument you specified!





fun main() {

    println(
        returnClassName<String>()
    )
}




//real world use case?
//Retrofit.create<YourInterface>()