// Thread class using extends Thread

public class MyThread1 extends Thread {
    @Override
    public void run() {
        // Printing numbers from 1 to 5
        System.out.println("MyThread1 is printing numbers 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread-1: " + i);
            try {
                Thread.sleep(500); // sleep for 500 ms
            } catch (InterruptedException e) {
                System.out.println("Thread-1 Interrupted");
            }
        }
    }
}
