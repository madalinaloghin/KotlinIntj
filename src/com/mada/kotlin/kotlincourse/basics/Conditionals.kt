package com.mada.kotlin.kotlincourse.basics

fun main(args: Array<String>) {

    var myString = "Not Empty"

//    if (myString != " ") {
//        println("not empty")
//    } else if (myString.startsWith("a")) {
//        println("starts with a")
//    } else {
//        println("is empty")
//    }


    val result = if (!myString.isEmpty()) {println("not empty"); 20}  else "empty"
    println(result)
    println("")

    when  (result){
        is String -> println("Excellent")
        is Int -> println("Awesome")
        20 -> println("is 20!")
    }

    println("")
    val whenValue = when (result) { is String -> "Excellent" 20 ->"is 20!"
        else -> "Something else" }
    println(whenValue)



}