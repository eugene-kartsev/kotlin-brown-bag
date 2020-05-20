import types.Product
import types.Movie
import types.Book

// See type definitions in types/KotlinTypes.kt
fun main() {
    objectExample()
    // classExample()
    // dataClassExample()
}



fun objectExample() {
    // the following line won't compile
    // because 'object' class is the same
    // as 'static' class in Java.
    //
    // val movie = Movie()
    val movieName = Movie.getName()
    println("movieName: $movieName")
}



fun classExample() {
    val product1 = Product("iPhone", 300)
    val product2 = Product(product1.name, product1.price)

    // Won't work, unless component1, component2 are defined in Product
    // val (name, _) = product1

    println("product1.hashCode: ${product1.hashCode()}")
    println("product2.hashCode: ${product2.hashCode()}")
}



fun dataClassExample() {
    val book1 = Book("a blue book", "blue")
    val book2 = book1.copy()
    val book3 = book1.copy(title = "a white book")

    val (title, _) = book1
    println("book1.title = $title")

    println("book1.hashCode: ${book1.hashCode()}")
    println("book2.hashCode: ${book2.hashCode()}")
    println("book3.hashCode: ${book3.hashCode()}")
}