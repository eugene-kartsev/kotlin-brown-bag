fun main() {
    println("Example 1: ${getResult(10)}")
    println("Example 2: ${getResult("abc")}")
    println("Example 3: ${getResult(1 until 10)}")
    println("Example 4: ${getResult(5.45)}")
    println("Example 5: ${getResult(5.45f)}")
}


fun getResult(x : Any?) = when(x) {
    is Int -> x + 1
    is String -> x.length + 1
    is IntRange -> x.sum()

    // The following line will
    // throw ClassCastException
    // because 'as' cast is unsafe
    //
    // x as Double -> x + 10.0

    x as? Double -> (x as Double) + 10.0

    else -> "Unknown"
}