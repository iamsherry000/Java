package basic1.Inheritance_Animal;

public class Dog extends Animal {
    int lives = 1;

    Dog(String nickname1, String nickname2){
        super(nickname1, nickname2);
    }

    void sound() {
        System.out.println("Bark");
    }
}
