fun main() {
    println("Example 1:")
    val map = mapOf(
            1 to "One",
            2 to "Two"
    )

    for ((key, value) in map) {
        println("Key:$key")
        println("Value:$value")
    }


    println("Example 2:")
    val user = User("1", "Eugene", "example@example.com")
    val (_, name, email) = user

    println("User.name=$name")
    println("User.email=$email")
}

class User(val id: String, val name: String, val email: String) {
    operator fun component1() = id
    operator fun component2() = name
    operator fun component3() = email
}