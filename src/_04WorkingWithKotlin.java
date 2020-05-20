import types.Book;
import types.Library;

// See type definitions in types/KotlinTypes.kt
public class _04WorkingWithKotlin {
    public static void main(String[] argv) {
        Library library = new Library();
        library.addBook(
            new Book("The Hitchhiker's Guide to the Galaxy", "42")
        );

        System.out.println("library: " + library.allBooks());
    }
}
