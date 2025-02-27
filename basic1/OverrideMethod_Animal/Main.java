package basic1.OverrideMethod_Animal;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("doggie1", "doggie2");
        Cat cat1 = new Cat("kat", "catties");

        dog1.eat();
        cat1.eat();
    }
}
