package com.worldsnas.kotlinbasics

//function with output arguments

private fun reverse(param1: String): String =
    param1.reversed()

private fun appendFooter(param: MutableList<String>) {
    param.add("footer")
}

private fun addFooter(param: MutableList<String>): MutableList<String> {
    val newList = ArrayList(param)
    newList.add("footer")
    return newList
}


fun main() {
    val list = mutableListOf("hello", "paragraph")

    appendFooter(list)

    println(
        addFooter(list)
    )

    println(list)
}

