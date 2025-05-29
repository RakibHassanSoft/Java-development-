package Second10;

public class Product {
    String name;
    double price;

    Product(String n, double p) {
        name = n;
        price = p;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product("Pen", 1.5),
            new Product("Notebook", 2.0),
            new Product("Eraser", 0.5),
            new Product("Ruler", 1.0)
        };

        double total = 0;
        for (Product p : products) {
            total += p.price;
        }

        System.out.println("Total Price: $" + total);
    }
}
