// Thread class implementing Runnable

public class MyThread2 implements Runnable {
    @Override
    public void run() {
        // Printing characters from A to E
        System.out.println("MyThread2 is printing characters A to E:");
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.println("Thread-2: " + c);
            try {
                Thread.sleep(500); // sleep for 500 ms
            } catch (InterruptedException e) {
                System.out.println("Thread-2 Interrupted");
            }
        }
    }
}
