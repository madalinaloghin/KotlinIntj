package com.mada.kotlin.kotlincourse.nulls

import com.mada.kotlin.kotlincourse.classes.CustomerJava

class Service{
    fun evaluate(){

    }
}

class ServiceProvider{
    fun createsServices(): Service? {
        val smthing = Service()
        return smthing
    }
}

fun main(args: Array<String>) {

    val message: String = "a message"
    println(message.length)

    val nullMessage: String? = null
    val inferredNull = null

    //if (nullMessage != null) println(nullMessage.length)


    val customerJava = CustomerJava()
    if(customerJava != null )
        if(customerJava.name != null) println(customerJava.name.length)


    println(nullMessage?.length)


//    val sp = createServiceProvider()
//    sp?.createsServices()?.evaluate()
//



}

private fun createServiceProvider(): ServiceProvider? = ServiceProvider()