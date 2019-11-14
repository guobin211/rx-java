package encryption

import java.lang.StringBuilder

/**
 * AsciiRun
 * ktx
 * @author guobin211
 * @date 2019/11/14 at 8:19 下午
 * @version 0.0.1
 */
class AsciiRun {}

fun AsciiRun.toInt(s: String): Int {
    return s.toInt()
}

fun AsciiRun.toInt(c: Char): Int {
    return c.toInt()
}


fun main() {
    val c: Char = 'a'
    println(c.toInt())

    val s: String = "hello world"
    val ca: CharArray = s.toCharArray()
    // with操作符
    val res = with(StringBuilder()) {
        for (item in ca) {
            println(item.toInt())
            this.append(item.toInt().toString() + " ")
        }
        this.toString()
    }
    println(res)

}