fun main() {
    val x = 13
    println("Example 1: ${example1(x)}")
    println("Example 2: ${example2(x)}")
    println("Example 3: ${example3(x)}")
    println("Example 4: ${example4(x)}")
}


fun example1(a: Int): String {
    if (a >= 10) {
        return "equals or more than 10"
    }
    return "less than 10"
}



fun example2(a: Int): String {
    val result = if (a >= 10) {
        "equals or more than 10"
    } else {
        "less than 10"
    }
    return result
}



fun example3(a: Int) = if (a >= 10) {
    "equals or more than 10"
} else {
    "less than 10"
}


fun example4(a: Int) = when (a) {
    1, 2, 3 -> "One, Two or Three"
    in 4..10 -> "Four to Ten"
    !in 10..20 -> "Not between 10 and 20"
    is Number, is Any -> "is Number or an Object"
    else -> {
        "Unknown"
    }
}