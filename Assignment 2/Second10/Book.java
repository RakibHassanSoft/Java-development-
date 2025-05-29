package Second10;

public class Book {
    String title, author;

    Book(String t, String a) {
        title = t;
        author = a;
    }

    void print() {
        System.out.println("Title: " + title + ", Author: " + author);
    }

    public static void main(String[] args) {
        Book[] books = {
            new Book("Java Basics", "Rakib Hassan"),
            new Book("OOP Concepts", "Rakib Hassan"),
            new Book("Data Structures", "Rakib Hassan"),
            new Book("Algorithms", "Rakib Hassan"),
            new Book("System Design", "Rakib Hassan")
        };

        for (Book b : books) {
            b.print();
        }
    }
}
