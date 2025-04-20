//Main.java
// Name: Krrish Sinha
// PRN: 23070126063
// Batch: AIML-A3

public class Main {
    public static void main(String[] args) {
        // Display welcome message
        System.out.println("=== Java Threads Demonstration ===");

        // Start threads using different thread classes
        ThreadOperations.startThreadOne();
        ThreadOperations.startThreadTwo();
        ThreadOperations.startAnonymousThread();
        ThreadOperations.startRunnableLambda();
    }
}
