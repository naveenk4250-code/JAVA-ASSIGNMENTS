public class AgeValidator {
    static void validate(int age) {
        if (age < 18) throw new IllegalArgumentException("Age must be 18+");
        System.out.println("Valid age");
    }

    public static void main(String[] args) {
        try {
            validate(15);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
