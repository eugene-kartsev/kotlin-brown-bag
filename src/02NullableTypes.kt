fun main() {
    sayHi("Eugene")

    // The following line is not going to compile.
    // It will work only if we change the definition
    // of sayHi function to:
    //     fun sayHi(str: String?) {}
    // sayHi(null)
}


fun sayHi(str: String) {
    println("Hey, $str")
//    println("Hey, ${str ?: "noname"}")
}
