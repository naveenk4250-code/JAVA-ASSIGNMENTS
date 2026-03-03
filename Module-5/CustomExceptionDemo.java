class AgeException extends Exception {
    AgeException(String msg) { super(msg); }
}

public class CustomExceptionDemo {
    static void checkAge(int age) throws AgeException {
        if (age < 18) throw new AgeException("Underage");
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (AgeException e) {
            System.out.println("Caught: " + e);
        }
    }
}
