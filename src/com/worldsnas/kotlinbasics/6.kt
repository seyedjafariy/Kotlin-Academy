package com.worldsnas.kotlinbasics

//consumer and producer functions

class ConsumerAndProducerFunctions(){

    fun thisIsAConsumerFunction(name : String) {
    }

    fun thisIsAProducerFunction() : List<String> {
        return emptyList()
    }
}

class ConsumerWithGenerics<in T> {

    fun take(item : T){

    }
}