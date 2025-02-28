package basic1.Polymorphism_Transportation;

public class Car extends Transportation { 
    
    Car() { // Constructor
        catagories = "Cat_car";
    }
    
    @Override
    void numOfWheels() {
        System.out.println("4 wheels");
    }
}
