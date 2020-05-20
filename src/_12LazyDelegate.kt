fun main() {
    val lazyTicks : Long by lazy {
        // heavy init function
        println("initialized!")
        System.currentTimeMillis()
    }

    repeat(10) {
        println("Lazy ticks: $lazyTicks")
    }
}

