package basic2.multithreading;

public class Main {
    public static void main(String[] args) {
        
        Thread thread1 = new Thread(new MyRunnable("ping"));
        Thread thread2 = new Thread(new MyRunnable("pong"));

        thread1.start();
        thread2.start();

        // try-catch to use the thread1.join() to make sure the order of it
    }
}
