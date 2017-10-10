/**
 * @author ykartsev
 */
fun main(args: Array<String>) {
    val aNumber = SimpleJavaNumber(10)

    println("Example 1:")
    println("A number: ${aNumber.number}")
    println("A number: ${aNumber.getNumber()}")

    aNumber.number = 20
    println("Example 2:")
    println("A number: ${aNumber.number}")
    println("A number: ${aNumber.getNumber()}")
}