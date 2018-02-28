package com.mada.kotlin.kotlincourse.classes

data class CustomerKotlin(var id: Int, var name: String, var email: String){
    override fun toString(): String {
//        return "{id: $id, name: $name, email: $email}"
        return "{\"id:\":\"$id\", \"name:\":\"$name\",\"email: \":\"$email\"}"
    }
}

fun main(args: Array<String>) {

    val customer1 = CustomerKotlin(1, "Thomas", "thomas@gmail.com")
    val customer2 = CustomerKotlin(1, "Thomas", "thomas@gmail.com")

    val customer3 = customer1
    val customer4  = customer1.copy(3)

    println(customer3)
    println(customer4)

    if(customer1 == customer2) println("they are the same. ")


}