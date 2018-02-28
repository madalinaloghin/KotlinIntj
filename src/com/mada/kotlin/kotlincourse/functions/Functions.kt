package com.mada.kotlin.kotlincourse.functions

fun hello(): Unit {
    println("Hello")
}

fun throwingExceptions(): Nothing {
    throw Exception("This function throws an exception")
}

fun returnsAFour(): Int {
    return 4
}

fun takingString(name: String) {
    println(name)
}

fun sum(x: Int, y: Int, z: Int = 0, w: Int = 0) = x + y + z + w

fun printDetails(name: String, email: String = " ", phone: String = "NA") {
    println("name: $name  - email: $email - phone: $phone")
}

fun printStrings(vararg strings: String) {
    reallyPrintingStrings(*strings)
    println()
}

private fun reallyPrintingStrings(vararg strings: String) {
    for (string in strings) print(string + " ")
}

fun main(args: Array<String>) {
    hello()

    val value = returnsAFour()
    println(value)

    takingString("Thomas")

    val sum = sum(5, 6, 7)
    println(sum)


    val sum2 = sum(5, 6)
    println(sum2)

    printDetails("Kittie", phone = "555-0123")
    printDetails("Joseph", email = "jsp@smthing.com")
    printDetails(email = "smthing@doe.com", name = "John")

    printStrings("a","b","c","d","e")
    printStrings("1","2","3")
    printStrings("now")

}