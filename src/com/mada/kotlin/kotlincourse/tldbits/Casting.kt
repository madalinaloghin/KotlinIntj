package com.mada.kotlin.kotlincourse.tldbits

open class Person {

}

class Employee : Person() {
    fun vacationDays(days: Int) {
        if (days < 60) println("you need more vacation")
    }
}

class Contractor : Person() {

}

var input: Any = 10

fun hasVacations(obj: Person) {
    if (obj is Employee){
        obj.vacationDays(20)
    }
}

fun main(args: Array<String>) {

    val str = input as? String
    println(str?.length)
    println(input.toString())
}