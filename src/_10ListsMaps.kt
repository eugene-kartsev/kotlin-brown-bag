fun main() {
    val list = listOf(1, 2, 3)
    val map = mapOf(
        1 to "One",
        2 to "Two",
        3 to "Three"
    )

    // No 'stream()', no 'collect()', yay!
    // Can use "it" inside lambda.
    // Can omit "()" when lambda is the last argument
    val values = map
            .filter { it.key > 1 }
            .map { x -> "${x.key}:${x.value}"  }

    println("Lists: first element=${list.get(0)}")
    // overloaded indexing operation
    println("Lists: second element=${list[1]}")

    println("Maps: element with id==0 = ${values[0]}")
}


