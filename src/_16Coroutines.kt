import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.launch
import kotlinx.coroutines.delay
import kotlinx.coroutines.Dispatchers.IO
import kotlin.system.measureTimeMillis

fun main() = runBlocking(IO) {
    // try with 1000_000L !!
    for (i in 1..2L) {
        launch {
            println("$i ^ 2 = ${square(i)}")
        }
    }

    println("done")
}

suspend fun square(num: Long): Long {
    println("$num: Thread name: ${Thread.currentThread().name}")
    delay(timeMillis = (10..100L).random())
    println("$num: Thread name: ${Thread.currentThread().name}")

    return num * num
}

