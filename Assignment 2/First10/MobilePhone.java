package First10;

public class MobilePhone {
    String model;
    String brand;
    int price;

    void setDetails(String m, String b, int p) {
        model = m;
        brand = b;
        price = p;
    }

    void getDetails() {
        System.out.println(brand + " " + model + " costs $" + price);
    }

    public static void main(String[] args) {
        MobilePhone m1 = new MobilePhone();
        m1.setDetails("Galaxy", "Samsung", 999);
        MobilePhone m2 = new MobilePhone();
        m2.setDetails("iPhone", "Apple", 1099);
        m1.getDetails();
        m2.getDetails();
    }
}

