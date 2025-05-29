package Second10;

public class Circle {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle[] circles = {
            new Circle(3),
            new Circle(5),
            new Circle(4)
        };

        Circle largest = circles[0];
        for (Circle c : circles) {
            if (c.area() > largest.area()) {
                largest = c;
            }
        }

        System.out.println("Circle with largest area: " + largest.area());
    }
}
