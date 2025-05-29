/*
 25. Write a LibraryBook class with attributes: title, author, and borrowed (boolean). Print the list of available books from an array
 */
package Third10;

public class LibraryBook {
    String title, author;
    boolean borrowed;

    LibraryBook(String title, String author, boolean borrowed) {
        this.title = title;
        this.author = author;
        this.borrowed = borrowed;
    }

    boolean isAvailable() {
        return !borrowed;
    }
}
