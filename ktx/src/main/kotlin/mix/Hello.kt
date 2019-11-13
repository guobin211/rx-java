package mix
import kotlinx.coroutines.*

fun main(args: Array<String>) {
   blockRun()
}

fun blockRun() = runBlocking {
    launch {
        delay(2000L)
        println("launch delay 2s")
    }
    // 协程作用域
    coroutineScope {
        launch {
            delay(500L)
            println("coroutineScope launch")
        }

        delay(100L)
        // 这一行会在内嵌 launch 之前输出
        println("coroutineScope")
    }
    // 这一行在内嵌 launch 执行完毕后才输出
    println("Coroutine scope is over")
}

