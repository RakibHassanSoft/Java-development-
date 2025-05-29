package First10;

public class Laptop {
    String model;
    int RAM;
    int storage;

    Laptop(String m, int r, int s) {
        model = m;
        RAM = r;
        storage = s;
    }

    void showSpecs() {
        System.out.println(model + " with " + RAM + "GB RAM and " + storage + "GB Storage.");
    }

    public static void main(String[] args) {
        Laptop l = new Laptop("Dell Inspiron", 16, 512);
        l.showSpecs();
    }
}

