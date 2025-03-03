package basic1.Polymorphism_Transportation;

import java.util.Scanner;

/*
 * Polymorphism can be implement as abstract class or interface
 * Poly = many shape, morph = shape
 * objects can identify as other objects 
 * object can be treated as objects of a common superclass 
 * 
 * Dynamic Polymorphism = when the method that gets excuted is decided at runtime
 */

public class Main {
    public static void main(String[] args) {
        //poly1();
        poly2();
    }
    
    private static void poly1() {
        Transportation car = new Car();
        Boat boat = new Boat();

        Transportation[] trans = {car, boat};

        for(Transportation tran : trans) {
            System.out.print(tran.catagories + " ");
            tran.NumOfWheels();
        }
    }

    private static void poly2() { // Dynamic poly
        Scanner scanner = new Scanner(System.in);
        Transportation tran = null;
        System.out.println("1. Car, 2. Boat");
        int choice = scanner.nextInt();

        if(choice == 1) tran = new Car();
        if(choice == 2) tran = new Boat();
        tran.NumOfWheels();
        scanner.close();
    }
}
