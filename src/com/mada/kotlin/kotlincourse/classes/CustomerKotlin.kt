package com.mada.kotlin.kotlincourse.classes

import java.io.IOException

data class CustomerKotlin(var id: Int, var name: String, var email: String) {

    @JvmField
    val someProperty = "value"

    override fun toString(): String {
//        return "{id: $id, name: $name, email: $email}"
        return "{\"id:\":\"$id\", \"name:\":\"$name\",\"email: \":\"$email\"}"
    }

    @JvmOverloads
    fun changeStatus(status: Status = Status.Current) {
    }

    @JvmName("preferential")
    fun makePreferred() {
    }

    @Throws(IOException::class)
    fun loadStatistics(filename: String) {
        if (filename == "") {
            throw IOException("Filename cannot be blank.")
        }
    }

}

enum class Status {
    Current,
    Past
}

fun main(args: Array<String>) {

    val customer1 = CustomerKotlin(1, "Thomas", "thomas@gmail.com")
    val customer2 = CustomerKotlin(1, "Thomas", "thomas@gmail.com")

    val customer3 = customer1
    val customer4 = customer1.copy(3)

    println(customer3)
    println(customer4)

    if (customer1 == customer2) println("they are the same. ")


}