class Demo {
    static int count = 0;
    Demo() { count++; }
    static void showCount() {
        System.out.println("Count: " + count);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        new Demo();
        new Demo();
        new Demo();
        Demo.showCount();
    }
}
