package basic1.Polymorphism_Transportation;

public class Car extends Transportation { 
    
    Car() { // Constructor
        catagories = this.catagories;
    }
    
    @Override
    void NumOfWheels() {
        System.out.println("4 wheels");
    }
}
