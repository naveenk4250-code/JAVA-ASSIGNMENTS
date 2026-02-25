public class MethodOverloadingDemo {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public double add(double a, double b) {
        return a + b;
    }
    public String add(String a, String b) {
        return a + b;
    }
    public static void main(String[] args) {
        MethodOverloadingDemo demo = new MethodOverloadingDemo();
        System.out.println("Sum of 2 integers (10 + 20): " + demo.add(10, 20));
        System.out.println("Sum of 3 integers (10 + 20 + 30): " + demo.add(10, 20, 30));
        System.out.println("Sum of 2 doubles (10.5 + 20.7): " + demo.add(10.5, 20.7));
        System.out.println("Concatenation of strings (Hello + World): " + demo.add("Hello ", "World"));
    }
}
