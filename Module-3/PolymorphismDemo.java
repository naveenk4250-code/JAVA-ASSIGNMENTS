abstract class Shape {
    protected String color;
    public Shape(String color) {
        this.color = color;
    }
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    public void displayInfo() {
        System.out.println("Shape Color: " + color);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}
class Circle extends Shape {
    private double radius;
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
class Rectangle extends Shape {
    private double length;
    private double width;
    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    public double calculateArea() {
        return length * width;
    }
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
public class PolymorphismDemo {
    public static void main(String[] args) {
        Shape shape1 = new Circle("Red", 5.0);
        Shape shape2 = new Rectangle("Blue", 4.0, 6.0);
        System.out.println("=== Circle Info ===");
        shape1.displayInfo();
        System.out.println("\n=== Rectangle Info ===");
        shape2.displayInfo();
        Shape[] shapes = {shape1, shape2};
        System.out.println("\n=== Polymorphic Behavior ===");
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.calculateArea());
        }
    }
}
