package collections

import java.text.SimpleDateFormat
import java.util.*

/**
 * @author guobin211
 * @version 0.0.1
 */
class Dylamic {
    var timestamp: Int = 0
        get() {
            println("get value of timestamp")
            return field
        }
        set(value) {
            println("set value for timestamp")
            field = value
        }
}

fun hash(obj: Any): Unit {
    println(obj.hashCode())
}

fun toString(obj: Any): Unit {
    println(obj.toString())
}

fun main() {
    val dylamic = Dylamic()
    // 1705736037
    hash(dylamic)
    toString(dylamic)

    println(dylamic.timestamp)
    dylamic.timestamp = 10
    println(dylamic.timestamp)

    val time = Date()
    println(time)
    val simpleDateFormat = SimpleDateFormat("yyyy-MM-dd HH-mm-ss")
    val res = simpleDateFormat.format(time)
    println(res)
}
