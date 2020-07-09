
fun main() {
    val set1 = setOf("a")
    val set2 = setOf("a", "b")
    val set3 = set1 + set2

    println(set3)

    val set4 = set3 - "b"
    println(set4)
}
