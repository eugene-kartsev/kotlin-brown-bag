import java.lang.Thread.sleep
import kotlin.concurrent.thread
import kotlin.system.measureTimeMillis

fun main() {
    val randomString = getRandomString()
    println("Random String: $randomString")

    // 'let' changes the original object and returns a new object
    val letResult = randomString.let {
        it.contains('A')
    }
    println("After 'let': $letResult")

    // 'also' doesn't change the original object
    val alsoResult = randomString.also {
        val x = it + "_suffix"
        println("Inside 'also': $x")
    }
    println("After 'also': $alsoResult")

    // 'apply' doesn't change the original object
    // It's very similar to 'also', but doesn't have
    // a parameter. You have to use 'this' inside of it.
    randomString.apply {
        val x = this + "_suffix"
        println("Inside 'apply': $x")
    }
    println("After 'apply': $alsoResult")

    // Inside 'with' you can skip variable name
    with(randomString) {
        println("Length: $length")
        println("equalsTo(OtherString) == ${equals("OtherString")}")
    }

    // 'repeat' is a shortcut for: "for (i in 0 until 3) {}"
    repeat(3) { attempt ->
        println("Running: $attempt")
    }

    // 'measureTimeMillis' tells you how much time in milliseconds
    // it took to execute a block
    val ms = measureTimeMillis {
        sleep(20)
    }
    println("How much time it took: $ms")

    // 'thread {}' is a shortcut to create a new thread.
    thread {
        println("Inside thread")
        sleep(100)
    }.join()
    println("After thread")
}

private val list = ('A'..'Z') + ('a'..'z')
private fun getRandomString(size: Int = 10): String =
        (0..size).map {
            list.random()
        }.joinToString("")
