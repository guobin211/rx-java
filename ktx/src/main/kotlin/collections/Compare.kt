package collections

/**
 * @author guobin211
 * @version 0.0.1
 */
fun main() {
    println("compare object")
    val tom = Person("tom", 18)
    val list = listOf<Person>(Person("jack", 22), tom, tom)
    val list2 = listOf<Person>(Person("jack", 22), Person("tom", 18), tom)
    println(list == list2)
    println(list === list2)
}

data class Person(var name: String, var age: Int)
