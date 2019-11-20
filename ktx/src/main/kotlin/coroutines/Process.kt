package coroutines

import java.lang.management.ManagementFactory

/**
 * Process
 * ktx
 * @author guobin211
 * @date 2019/11/14 at 8:13 下午
 * @version 0.0.1
 */


fun main() {
    val process = ManagementFactory.getRuntimeMXBean()
    val thread = Thread.currentThread()
    println(process.name)
    println(thread.name)
}