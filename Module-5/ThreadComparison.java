class MyThread extends Thread {
    public void run() {
        System.out.println("Thread class running");
    }
}

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable running");
    }
}

public class ThreadComparison {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();

        Thread t2 = new Thread(new MyRunnable());
        t2.start();
    }
}
