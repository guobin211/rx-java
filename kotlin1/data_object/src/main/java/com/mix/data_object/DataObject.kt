package com.mix.data_object

class DataObject constructor(
    /*构造函数不可变属性*/
    private val id: String = "",
    /*可变属性*/
    private var name: String
) {

    private var age: Int = 0;

    val firstProperty = "First property: $name".also(::println)

    init {
        println("First initializer block that prints $name")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }

    override fun toString(): String {
        return "{id: ${this.id}, name: ${this.name}, age: ${this.age}}"
    }
}


fun main() {
    println("Hello Test DataObject")
    val data1 = DataObject("data22", "jack")
    println(data1)

}