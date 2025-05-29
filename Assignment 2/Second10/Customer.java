package Second10;

public class Customer {
    String name;
    double purchaseAmount;

    Customer(String n, double amt) {
        name = n;
        purchaseAmount = amt;
    }

    public static void main(String[] args) {
        Customer[] customers = {
            new Customer("Rakib", 1200),
            new Customer("Amina", 800),
            new Customer("John", 1500)
        };

        int count = 0;
        for (Customer c : customers) {
            if (c.purchaseAmount > 1000) count++;
        }

        System.out.println("Customers with purchase over 1000: " + count);
    }
}

