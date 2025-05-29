package First10;
public class Book {
    String title, author;
    double price;

    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    public void display() {
        System.out.println(title + " by " + author + " costs $" + price);
    }

    public static void main(String[] args) {
        Book b = new Book("Java Basics", "John Doe", 29.99);
        b.display();
    }
}
