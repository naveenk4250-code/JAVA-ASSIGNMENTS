import java.io.*;

public class ExceptionTypes {
    public static void main(String[] args) {
        try {
            throw new IOException("Checked exception");
        } catch (IOException e) {
            System.out.println("Caught: " + e);
        }

        try {
            throw new ArithmeticException("Unchecked exception");
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e);
        }
    }
}
