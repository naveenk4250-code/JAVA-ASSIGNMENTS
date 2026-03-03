public class DeadlockDemo {
    public static void main(String[] args) {
        String lock1 = "Lock1";
        String lock2 = "Lock2";

        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                try { Thread.sleep(100); } catch (Exception e) {}
                synchronized (lock2) {
                    System.out.println("Thread 1");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                synchronized (lock1) {
                    System.out.println("Thread 2");
                }
            }
        });

        t1.start(); t2.start();
    }
}
