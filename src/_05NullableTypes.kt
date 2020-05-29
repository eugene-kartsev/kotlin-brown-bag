fun main() {
    val str1: String = "Eugene"
    val str2 = "Eugene"
    // The following line will not compile,
    // because "str2" is effectively final
    // and cannot be re-assigned
    //
    // str2 = "Someone else"

    var str3 = "Eugene"
    str3 = "Someone else"

    sayHi(str3)

    val str4: String? = null
    // The following line is not going to compile.
    // It will work only if we change the definition
    // of sayHi function to:
    //     fun sayHi(str: String?) {}
    // sayHi(str4)
}

fun sayHi(str: String) {
    // Cannot re-assign input parameters
    // str = ""

    println("Hey, $str")
    // println("Hey, ${str ?: "noname"}")
}
