package Second10;

public class Student {
    String name;
    int[] marks;

    Student(String n, int[] m) {
        name = n;
        marks = m;
    }

    double average() {
        int total = 0;
        for (int m : marks) total += m;
        return total / (double) marks.length;
    }

    public static void main(String[] args) {
        Student[] students = {
            new Student("Rakib", new int[]{80, 90, 85}),
            new Student("Aisha", new int[]{70, 75, 80})
        };

        for (Student s : students) {
            System.out.println(s.name + " Average: " + s.average());
        }
    }
}

