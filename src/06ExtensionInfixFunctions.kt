fun main() {
    println("Example 1:")
    "Eugene".sayHi()

    println("Example 2:")
    "Eugene".sayHiXtimes(3)

    println("Example 3:")
    "Eugene" hey 2
}

fun String.sayHi() {
    println("Hey, $this")
}

fun String.sayHiXtimes(times : Int) {
    for(i in 1..times) {
        this.sayHi()
    }
}

infix fun String.hey(times : Int) {
    this.sayHiXtimes(times)
}

