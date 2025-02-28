package basic1.Polymorphism_Transportation;

public class Boat extends Transportation {

    Boat() { // Constructor
        catagories = "Cat_boat";
    }

    @Override
    void numOfWheels() {
        System.out.println("0 wheels");
    }
}
