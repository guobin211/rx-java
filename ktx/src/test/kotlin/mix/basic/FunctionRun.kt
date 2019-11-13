import kotlin.random.Random

/**
 *
 * @author guobin211
 * @date 2019/11/13 at 3:12 下午
 * @version 0.0.1
 */

data class Person(var name: String, var age: Int = 0, var city: String = "") {
    fun incrementAge() {
        this.age++
    }
    fun moveTo(city: String) {
        this.city = city
    }
}

fun getRandomInt(): Int {
    // apply 及 also 的返回值是上下文对象本身
    return Random.nextInt(100).also {
        println("get random int: $it")
    }
}

fun main() {
    // 作用域函数 五种: let、run、with、apply 以及 also
    Person("jack", 21, "china").let {
        println(it)
        it.moveTo("japan")
        it.incrementAge()
        println(it)
    }

    val str = "hello"
    str.run {
        println("the str length: $length")
    }
    val tom = Person("Tom").apply {
        age = 18
        city = "London"
    }
    println(tom)
    val strs = mutableListOf<String>("one", "two", "three")
    with(strs) {
        println("'with' is called with argument $this")
        println("size: $size")
    }

    val num = getRandomInt()
    println(num)
}