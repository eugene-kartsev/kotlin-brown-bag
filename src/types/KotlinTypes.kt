package types

// not "open" by default
class Product(val name: String, val price: Int)

// final (cannot have sub-classes)
data class Book(val title: String, val color: String)

// same as static class in Java
object Movie {
    fun getName() = "a super hero movie"
}