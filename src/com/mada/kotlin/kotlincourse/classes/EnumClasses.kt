package com.mada.kotlin.kotlincourse.classes

enum class Priority(val value: Int) {
    MINOR(-1){
        override fun text(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun toString(): String {
            return "Minor Priority"
        }
    },
    NORMAL(0) {
        override fun text(): String {
            return "Normal priority"
        }
    },
    MAJOR(1) {
        override fun text(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    },
    CRITICAL(2) {
        override fun text(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    };

    abstract fun text(): String
}


fun main(args: Array<String>) {
    val priority = Priority.NORMAL
    println(priority)
    println(priority.value)
    println(priority.ordinal)

    for (priorityInList in Priority.values()){
        println(priorityInList)
    }

    val p = Priority.valueOf("MAJOR")
    println(p.ordinal)

    println(priority.text())


}