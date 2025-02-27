package basic1.Abstract_Legs;

public class Main {
    public static void main(String[] args) {
        // Animal animal = new Animal(); // cannot, coz abstract class
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.lives(); // override the abstract class
        dog.eat(); // inherit from parent 'Animal'

        cat.lives();
        cat.eat();

    }
}
