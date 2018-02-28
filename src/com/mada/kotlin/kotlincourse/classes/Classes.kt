package com.mada.kotlin.kotlincourse.classes

import java.util.*

class Customer(var id: Int, var name: String = "", val yearOfBirth: Int) {
    //    init {
//       name = name.toUpperCase()
//    }
    val age: Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth

    var socialSecurityNumber: String = ""
        set(value) {
            if (!value.startsWith("SN")) throw IllegalArgumentException("Social Security should start with SN")
            field = value
        }


    fun customerAsString(): String{
        return "id: $id, name: $name"
    }
}

fun main(args: Array<String>) {

    val customer = Customer(10, "Thomas", 2016)
    customer.socialSecurityNumber = "SN 1234"

    val customer2 = Customer(15, yearOfBirth = 1990)

    println("${customer.name}, age: ${customer.age}, SSN: ${customer.socialSecurityNumber}")
    println(customer.customerAsString())

}