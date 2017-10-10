/**
 * @author ykartsev
 */
fun main(args: Array<String>) {
    val lazyTicks : Long by lazy {
        // heavy init function
        println("initialized!")
        System.currentTimeMillis()
    }

    val ticks = System.currentTimeMillis()
    Thread.sleep(100)

    println("Ticks: $ticks")
    println("Lazy ticks: $lazyTicks")
}

