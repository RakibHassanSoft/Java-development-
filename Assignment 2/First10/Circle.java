package First10;

public class Circle {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle c = new Circle(4.5);
        System.out.println("Area: " + c.area());
    }
}
