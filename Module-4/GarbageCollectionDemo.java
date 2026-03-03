class Garbage {
    protected void finalize() {
        System.out.println("Object collected");
    }
}

public class GarbageCollectionDemo {
    public static void main(String[] args) {
        Garbage g = new Garbage();
        g = null;
        System.gc();
    }
}
