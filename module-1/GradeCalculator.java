import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your marks (0-100): ");
        int marks = scanner.nextInt();
        char grade;
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks! Please enter between 0 and 100");
            scanner.close();
            return;
        }
        int category = marks / 10;
        switch (category) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }
        System.out.println("Your grade is: " + grade);
        scanner.close();
    }
}
