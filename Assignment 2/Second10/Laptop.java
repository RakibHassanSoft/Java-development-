package Second10;

public class Laptop {
    String brand;
    double price;
    int ram;

    Laptop(String b, double p, int r) {
        brand = b;
        price = p;
        ram = r;
    }

    public static void main(String[] args) {
        Laptop[] laptops = {
            new Laptop("Dell", 800, 8),
            new Laptop("HP", 750, 16),
            new Laptop("Lenovo", 700, 12)
        };

        Laptop max = laptops[0];
        for (Laptop l : laptops) {
            if (l.ram > max.ram) max = l;
        }

        System.out.println("Laptop with most RAM: " + max.brand + " (" + max.ram + "GB)");
    }
}
