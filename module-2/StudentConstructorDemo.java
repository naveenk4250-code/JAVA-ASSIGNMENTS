class Student {
    String name;
    int age;
    String studentId;
    public Student() {
        this.name = "Unknown";
        this.age = 0;
        this.studentId = "Not Assigned";
        System.out.println("Default constructor called");
    }
    public Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        System.out.println("Parameterized constructor called");
    }
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student ID: " + studentId);
        System.out.println("------------------------");
    }
}
public class StudentConstructorDemo {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.displayInfo();
        Student student2 = new Student("John Doe", 20, "S12345");
        student2.displayInfo();
        Student student3 = new Student("Jane Smith", 22, "S67890");
        student3.displayInfo();
    }
}
