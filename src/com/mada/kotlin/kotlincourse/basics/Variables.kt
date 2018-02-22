package com.mada.kotlin.kotlincourse.basics

fun main(args: Array<String>) {

    var streetNumber = 10
    var streetName = "High Street"

    val zip = "123 P3"

    streetNumber = 6

    val myLong = 10L
    val myFloat  = 100F
    val myHex = 0x0F
    val myBinary = 0xb01

    val myInt = 100

    val myLongAgain: Long =  myInt.toLong()

    //String

    val myChar  = 'A'
    val myString = "Some string"

    val escapeCharacters = "A new line \n"

    val rawString =  "Hello" +
            "This is second line" +
            "And this is third. "

    val multpleLines = """
        This is first line
        This is second
        And finally the third.
        """

    val years = 10
    val message = "A decade is $years years"

    val name = "Mary"
    val anotherMessage = " Length of name is ${name.length}"





}

