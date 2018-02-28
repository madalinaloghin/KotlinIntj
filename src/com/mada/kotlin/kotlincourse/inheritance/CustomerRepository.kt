package com.mada.kotlin.kotlincourse.inheritance

interface CustomerRepository {
    val isEmpty: Boolean
        get() = true

    fun store(obj: Customer) {

    }

    fun getById(id: Int): Customer
}

interface EmployeeRepository{
    fun store(obj: Employee){

    }
    fun getById(id: Int): Employee

}

class SQLCustomerRepo : CustomerRepository {

    override fun getById(id: Int): Customer {
        return Customer()
    }

    override fun store(obj: Customer) {

    }

    override val isEmpty: Boolean
        get() = false

}

interface Interface1 {
    fun funA() {
        println("fun A from interface 1")
    }
}

interface Interface2 {
    fun funA() {
        println("fun A from interface 2")
    }
}

class Class1and2: Interface1, Interface2{
    override fun funA() {
        super<Interface2>.funA()
       // println("our own implementation")
    }
}

fun main(args: Array<String>) {

    val class1and2 = Class1and2()
    class1and2.funA()
}