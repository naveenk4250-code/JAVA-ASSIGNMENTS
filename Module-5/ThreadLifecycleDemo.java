public class ThreadLifecycleDemo {
    public static void main(String[] args) throws Exception {
        Thread t = new Thread(() -> {
            System.out.println("Thread running");
        });

        System.out.println("State: " + t.getState());
        t.start();
        System.out.println("State: " + t.getState());
        t.join();
        System.out.println("State: " + t.getState());
    }
}
