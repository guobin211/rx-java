package com.mix.data_object

class Person(var name: String, private val parent: Person?) {

    var children: MutableList<Person> = mutableListOf()

    init {
       parent?.children?.add(this)
    }

    override fun toString(): String {
        return "{name: ${this.name}, parent: ${this.parent.toString()}} }"
    }
}

fun main() {
    val person1 = Person("jack", null)
    println(person1)
    println(person1.name)
    val person2 = Person("tom", person1)
    println(person2)
    println(person1.children)
}