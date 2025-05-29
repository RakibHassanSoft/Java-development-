package First10;
import java.util.Scanner;

public class Student {
    String name;
    int id;

    public void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter ID: ");
        id = sc.nextInt();
    }

    public void printDetails() {
        System.out.println("Name: " + name + ", ID: " + id);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.getDetails();
        s.printDetails();
    }
}
