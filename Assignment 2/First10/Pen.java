package First10;

class Pen {
    String brand, color;

    Pen(String b, String c) {
        brand = b;
        color = c;
    }

    void printDetails() {
        System.out.println("Writing with a " + color + " " + brand + " pen.");
    }

    public static void main(String[] args) {
        Pen p = new Pen("Habijabi", "Blue");
        p.printDetails();
    }
}
