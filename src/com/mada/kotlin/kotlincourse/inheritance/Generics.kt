package com.mada.kotlin.kotlincourse.inheritance

interface Repository<T> {
    fun getById(id: Int): T
    fun getAll(): List<T>

}

fun main(args: Array<String>) {

    val customerRepo = GenericsRepo<Customer>()

    val customer = customerRepo.getById(1)
    val customers = customerRepo.getAll()


}