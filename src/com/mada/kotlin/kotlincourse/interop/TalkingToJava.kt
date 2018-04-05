package com.mada.kotlin.kotlincourse.interop

import com.mada.kotlin.kotlincourse.classes.CustomerJava

fun main(args: Array<String>) {

    val customer = CustomerJava()

    customer.email = " smthing@smthingelse.com"

    customer.prettyPrint()

    val runnable = Runnable { println("Invoking runnable")}


}

class PersonKotlin: PersonJava()

class KotlinCustomerRepo: CustomerRepository{
    override fun getAll(): MutableList<CustomerJava> {
        throw UnsupportedOperationException("not implemented")
    }

    override fun getById(id: Int): CustomerJava {
        throw UnsupportedOperationException("not implemented")
    }

}


