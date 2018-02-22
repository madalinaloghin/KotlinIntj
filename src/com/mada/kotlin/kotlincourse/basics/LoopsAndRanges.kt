package com.mada.kotlin.kotlincourse.basics

fun main(args: Array<String>) {

    print("\nfirst \n")
    for (a: Int in 1..100) {
        print(a)
    }

    val numbers = 1..100

    print("\n\nsecond\n")
    for (a in numbers) {
        print(a)
    }

    print("\n\nthird\n")
    for (a in 100 downTo 1) {
        print(a)
    }

    print("\n\nfourth\n")
    for (a in 100..1) println(a)

    print("\n\nfifth\n")
    for (b in 100 downTo 1 step 20) print(b.toString().plus(" "))


    print("\n\ncapitals\n")
    val capitals = listOf("London", "Paris", "Rome", "Bucharest")
    for (capital in capitals) print(capital.plus(" "))


    var i = 100
    while (i > 0) {
        i--
    }

    do {
        var x = 10
        x--
    } while (x > 10)


    loop@ for (i in 1..100) {
        for (j in 1..100) {
            if (j % i == 0)
                //continue
                break@loop
        }
    }



}