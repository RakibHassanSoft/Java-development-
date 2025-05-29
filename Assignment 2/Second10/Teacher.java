package Second10;

public class Teacher {
    String name, subject;

    Teacher(String n, String s) {
        name = n;
        subject = s;
    }

    public static void main(String[] args) {
        Teacher[] teachers = {
            new Teacher("Mr. Rahim", "Math"),
            new Teacher("Ms. Sarah", "English"),
            new Teacher("Mr. Karim", "CSE")
        };

        System.out.println("Teachers who teach Mathematics:");
        for (Teacher t : teachers) {
            if (t.subject.equals("Mathematics")) {
                System.out.println(t.name);
            }
        }
    }
}
