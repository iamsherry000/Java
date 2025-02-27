package basic1.Inheritance_Animal;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("doggie1", "doggie2");
        Cat cat1 = new Cat("kat", "catties");

        System.out.println("dog alive? " + dog1.isAlive);
        dog1.eat();
        System.out.print("dog sound? ");
        dog1.sound();
        System.out.println("=========");
        System.out.println("cat alive? " + cat1.isAlive);
        cat1.eat();
        System.out.print("cat sound? ");
        cat1.sound();
        System.out.println("=========");
        System.out.println("dog1 nickname1: " + dog1.nickname1);
        System.out.println("cat1 nickname2: " + cat1.nickname2);
    }
}
