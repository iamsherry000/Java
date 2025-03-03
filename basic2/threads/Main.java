package basic2.threads;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true); // finish the main process when main is over
        thread.start();

        System.out.println("10 sec for you to type your name");
        System.out.println("name?");
        String name = scanner.nextLine();
        System.out.println("hello " + name);

        scanner.close();
    }
}
