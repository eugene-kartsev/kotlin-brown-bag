/**
 * @author ykartsev
 */
fun main(args: Array<String>) {
    val ticks : Long by lazy {
        // heavy init function
        System.currentTimeMillis()
    }

    println("Ticks: $ticks")
    Thread.sleep(100)
    println("Ticks: $ticks")
}

