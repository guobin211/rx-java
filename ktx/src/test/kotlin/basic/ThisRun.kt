package basic

/**
 *
 * @author guobin211
 * @date 2019/11/13 at 3:25 下午
 * @version 0.0.1
 */

class ThisRun {
    inner class B{
        fun Int.foo() {
            // basic.ThisRun 的 this
            val a = this@ThisRun
            // B 的 this
            val b = this@B
            // foo() 的接收者，一个 Int
            val c = this
            val c1 = this@foo

            val funLit = lambda@ fun String.() {
                // funLit 的接收者
                val d = this
            }

            val funLit2 = { s: String ->
                // foo() 的接收者，因为它包含的 lambda 表达式
                // 没有任何接收者
                val d1 = this
            }
        }
    }
}


fun main() {
    var name = ""
    name = "jack"
    // true  equals 结构相等
    println(name == "jack")
    // false 引用相等
    println(name === " jack")
    // true
    println("1" === "1")
    val name1 = "jack"
    // true
    println(name === name1)

    val res = name.filter { it -> it > 'c' }
    println(res)
}