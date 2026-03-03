final class FinalClass {
    void show() { System.out.println("Final class"); }
}

class Parent {
    final void display() { System.out.println("Final method"); }
}

class Child extends Parent {
}

public class FinalKeywordDemo {
    public static void main(String[] args) {
        final int x = 10;
        System.out.println("Final variable: " + x);
        
        Child c = new Child();
        c.display();
        
        FinalClass fc = new FinalClass();
        fc.show();
    }
}
