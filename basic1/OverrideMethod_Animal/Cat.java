package basic1.OverrideMethod_Animal;

public class Cat extends Animal {
    int lives = 9;

    Cat(String nickname1, String nickname2){
        super(nickname1, nickname2);
    }

    void sound() {
        System.out.println("Meow");
    }

    @Override
    void eat() {
        System.out.println("Cat eat fish");
    }
}