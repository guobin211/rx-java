import java.lang.management.ManagementFactory

/**
 *
 * @author guobin211
 * @date 2019/11/13 at 4:07 下午
 * @version 0.0.1
 */

fun main() {
    println("进程-线程-协程")
    val runtime = ManagementFactory.getRuntimeMXBean()
    println("进程: " + runtime.name)
    println("Process Id: " + runtime.name.substring(0, runtime.name.indexOf("@")))
    val thread = Thread.currentThread()
    println("Thread Id: " + thread.id)

    // delay
    println("sleep...")
}