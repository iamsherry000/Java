package basic1.OverrideMethod_Animal;

public class Animal {
    boolean isAlive;
    String nickname1;
    String nickname2;

    Animal(String nickname1, String nickname2) { // constructor
        isAlive = true;
        this.nickname1 = nickname1;
        this.nickname2 = nickname2;
    }

    void eat() {
        System.out.println("Eating");
    }
}
