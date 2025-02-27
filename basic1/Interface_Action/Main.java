package basic1.Interface_Action;


public class Main {
    public static void main(String[] args) {
        Fish fishy = new Fish();
        Bat baty = new Bat();
        Human child = new Human();

        fishy.swim();
        baty.fly();
        child.fly();
        child.swim();
    }
}
