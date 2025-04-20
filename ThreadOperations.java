// Contains reusable static methods for starting threads

public class ThreadOperations {
    
    // Start thread using class that extends Thread
    public static void startThreadOne() {
        MyThread1 t1 = new MyThread1();
        t1.start();
    }

    // Start thread using class that implements Runnable
    public static void startThreadTwo() {
        Thread t2 = new Thread(new MyThread2());
        t2.start();
    }

    // Start anonymous thread using Thread class
    public static void startAnonymousThread() {
        Thread t3 = new Thread() {
            public void run() {
                System.out.println("Anonymous thread printing numbers 6 to 10:");
                for (int i = 6; i <= 10; i++) {
                    System.out.println("Anonymous Thread: " + i);
                    try {
                        Thread.sleep(400);
                    } catch (InterruptedException e) {
                        System.out.println("Anonymous thread interrupted");
                    }
                }
            }
        };
        t3.start();
    }

    // Start thread using lambda expression (Java 8+)
    public static void startRunnableLambda() {
        Thread t4 = new Thread(() -> {
            System.out.println("Lambda thread printing squares of 1 to 5:");
            for (int i = 1; i <= 5; i++) {
                System.out.println("Lambda Thread: " + (i * i));
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    System.out.println("Lambda thread interrupted");
                }
            }
        });
        t4.start();
    }
}
