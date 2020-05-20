import types.Book
import types.Library

// See "Library" java type definition in "types/Library"
fun main() {
    val library = Library()
    library.addBook(
        Book("The Hitchhiker's Guide to the Galaxy", "42")
    )

    println("library: ${library.allBooks()}")
}