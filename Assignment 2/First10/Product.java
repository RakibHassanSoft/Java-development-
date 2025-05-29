package First10;

import java.util.Scanner;

class Product {
    String name;
    double price;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product name: ");
        name = sc.nextLine();
        System.out.print("Enter price: ");
        price = sc.nextDouble();
    }

    void print() {
        System.out.println("Product: " + name + ", Price: $" + price);
    }

    public static void main(String[] args) {
        Product p = new Product();
        p.input();
        p.print();
    }
}
