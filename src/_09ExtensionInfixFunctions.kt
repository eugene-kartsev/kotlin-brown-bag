import types.Book

fun main() {
    "Eugene".sayHi()

    // "Eugene".sayHiXtimes(3)

    // "Eugene" hey 2

    // val book = Book("Dark Matter", "Black")
    // book.changeColor("Red")
    //     .print()
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

fun Book.changeColor(newColor: String) = this.copy(color = newColor)
fun Book.print() = println(this)