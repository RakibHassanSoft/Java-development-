/*
 * 21. Create a Student class with name and 3 subject marks (as an array). Add a method to calculate grade and display it for 5 students.
 */
package Third10;

public class Student {
    String name;
    int[] marks;

    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    double calculateAverage() {
        int total = 0;
        for (int mark : marks) total += mark;
        return total / (double) marks.length;
    }

    void display() {
        System.out.println("Name: " + name + ", Average: " + calculateAverage());
    }
}
