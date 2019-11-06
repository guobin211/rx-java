package com.mix.ele.kotlin

/*
* 单例模式
* */
object DataProviderManager {
    // 私有属性
    private val database = mutableMapOf<String, DataProvider>()
    fun registerDataProvider(provider: DataProvider) {
        database["my_provider"] = provider
    }
    // 属性的 getter 和setter
    val allDataProviders: Collection<DataProvider>
        get() = database.values
}

interface NameOfClass {
    fun getName(): String
}

class BasicClass constructor(fileName: String): NameOfClass {
    override fun getName(): String {
        return "BasicClass"
    }
}

class InitOrderDemo(name: String) {
    val firstProperty = "First property: $name".also(::println)

    init {
        println("First initializer block that prints $name")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }
}

open class Shape {
    open val vertexCount: Int = 0

    fun getCount() {
        println(vertexCount)
    }
}

/*
* 继承与覆盖
* */
class Rectangle : Shape() {
    // 类内部的对象声明可以用 companion 关键字标记
    companion object Factory {
        fun create(): Rectangle = Rectangle()
    }
    override val vertexCount = 4
}

fun main() {
    val orderDemo = InitOrderDemo("demo")
    val rectangle = Rectangle()
    rectangle.getCount()
}