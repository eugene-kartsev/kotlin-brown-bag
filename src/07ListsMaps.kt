fun main() {
    val list = listOf(1, 2, 3)
    val map = mapOf(
            1 to "One",
            2 to "Two",
            3 to "Three"
    )

    // no 'stream()' no 'collect()', yay!
    val values = map
            .filter { x -> x.key > 1 }
            .map { x -> "${x.key}:${x.value}"  }

    println("Lists: first element=${list.get(0)}")
    // overloaded indexing operation
    println("Lists: second element=${list[1]}")

    println("Maps: first element=${values[0]}")
}


