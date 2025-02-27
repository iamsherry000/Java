package basic1.OO_Cars;

public class Car {

    String band = "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 50000.99;
    boolean isRunning = false;

    void start() {
        isRunning = true;
        System.out.println("VOM VOM VOM");
    }

    void UrgentBreak() {
        isRunning = false;
        System.out.println("geeeeeeeeee");
    }

    void stop() {
        isRunning = false;
        System.out.println("Mumm Mumm Mummmm");
    }
}
