package com.worldsnas.kotlinbasics










//infix functions












class Programmer{
    private val tasks = mutableListOf<String>()

    infix fun addTask(task : String) {
        tasks.add(task)
    }

}






fun main() {
    val asghar = Programmer()


    asghar addTask "present"









    //other infix functions you can use

    val pair = 1 to "task"

    //use case

    val taskTable = mapOf(
        pair,
        2 to "jira"
    )

}






//more readable
