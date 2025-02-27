package basic1.Interface_Action;

public class Human implements Flying, Swimming{
    @Override
    public void fly(){
        System.out.println("I(human) fly too.");
    }
    @Override
    public void swim(){
        System.out.println("I(human) swim too.");
    }
}
