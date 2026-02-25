class Parent {
    public void display() {
        System.out.println("Parent class display method");
    }
    public int add(int a, int b) {
        System.out.println("Parent class add (int, int)");
        return a + b;
    }
    public double add(double a, double b) {
        System.out.println("Parent class add (double, double) - Overloading");
        return a + b;
    }
}
class Child extends Parent {
    public void display() {
        System.out.println("Child class display method - Overriding");
    }
    public int add(int a, int b, int c) {
        System.out.println("Child class add (int, int, int) - Overloading");
        return a + b + c;
    }
    public String add(String a, String b) {
        System.out.println("Child class add (String, String) - Overloading");
        return a + b;
    }
}
public class OverloadingVsOverriding {
    public static void main(String[] args) {
        System.out.println("=== METHOD OVERLOADING DEMONSTRATION ===");
        Child child = new Child();
        System.out.println("Result 1: " + child.add(5, 10));
        System.out.println("Result 2: " + child.add(5.5, 10.7));
        System.out.println("Result 3: " + child.add(5, 10, 15));
        System.out.println("Result 4: " + child.add("Hello ", "World"));
        System.out.println("\n=== METHOD OVERRIDING DEMONSTRATION ===");
        Parent parentRef = new Parent();
        Parent childRef = new Child();
        System.out.println("Parent reference to Parent object:");
        parentRef.display();
        System.out.println("Parent reference to Child object:");
        childRef.display();
        System.out.println("\n=== DIFFERENCE SUMMARY ===");
        System.out.println("Method Overloading:");
        System.out.println("- Same class, same method name, different parameters");
        System.out.println("- Compile-time polymorphism");
        System.out.println("- Return type may or may not be same");
        System.out.println("\nMethod Overriding:");
        System.out.println("- Different classes (inheritance), same method name and parameters");
        System.out.println("- Runtime polymorphism");
        System.out.println("- Return type must be same or covariant");
    }
}
