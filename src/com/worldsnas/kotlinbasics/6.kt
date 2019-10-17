package com.worldsnas.kotlinbasics








//consumer and producer functions













//another easy but important concept about functions
//they basically mean input and out of a function
//so we call a function a consumer when it takes a input for the class
//as obvious we call a function producer when returns a value
//as an example













class ConsumerAndProducerFunctions(){

    fun thisIsAConsumerFunction(name : String) {
    }

    fun thisIsAProducerFunction() : List<String> {
        return emptyList()
    }
}








//easy peasy!









class ConsumerWithGenerics<in T> {

    fun take(item : T){

    }
}

abstract class ProducerWithGenerics<out T> {

    abstract fun take(): List<T>
}









//same class but with generic input function and invariant consumer
//and the generic producer function
//example usage of this in/out is the List class (see inside)