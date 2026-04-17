class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);

        if (marks >= 40) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Student[] students = new Student[3];

        students[0] = new Student(1, "Arun", 85);
        students[1] = new Student(2, "Kumar", 35);
        students[2] = new Student(3, "Divya", 70);

        System.out.println("Student Details:\n");

        for (Student s : students) {
            s.display();
        }
    }
}
