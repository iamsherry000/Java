package basic1.Polymorphism_Transportation;

public abstract class Transportation {
    boolean isRunning;
    String catagories;

    abstract void numOfWheels();
    
    void start() {
        isRunning = true;
        System.out.println("start");
    }

    void stop() {
        isRunning = false;
        System.out.println("stop");
    }
}
