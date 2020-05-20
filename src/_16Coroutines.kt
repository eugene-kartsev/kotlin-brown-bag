import kotlinx.coroutines.launch
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    // try with 1000_000L !!
    for (i in 1..10_000L) {
        launch {
            square(i)
        }
        println("i = $i")
    }
}

suspend fun square(num: Long) {
    delay(10)
    println("$num ^ 2 = ${num * num}")
}

