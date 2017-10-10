/**
 * @author ykartsev
 */


fun main(args: Array<String>) {
    // the following line won't compile
    // because 'object' class is the same
    // as 'static' class in Java.
    //
    // val movie = Movie()
    val movieName = Movie.getName()


    val product1 = Product("iPhone", 300)
    val book1 = Book("a blue book", "blue")

    println("product1.hashCode: ${product1.hashCode()}")
    println("book1.hashCode: ${book1.hashCode()}")
    println((1..10).map { _ -> '=' }.joinToString(""))


    val product2 = Product(product1.name, product1.price)
    val book2 = Book(book1.title, book1.color)

    println("product2.hashCode: ${product2.hashCode()}")
    println("book2.hashCode: ${book2.hashCode()}")

    println("product1 == product2: ${product1 == product2}")
    println("book1 == book2: ${book1 == book2}")

    // Won't compile, because 'Product'
    // doesn't have 'component1()' and 'component2()'
    // val (name, price) = product1
    // println("product1.name = $name")

    val (title, _) = book1
    println("book1.title = $title")
}



class Product(val name: String, val price: Int)

data class Book(val title: String, val color: String)

// same as static class in Java
object Movie {
    fun getName() = "a super hero movie"
}