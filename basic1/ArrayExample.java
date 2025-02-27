package basic1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        //fixedArray();
        //inputArray();
        //searchArray();
        array2D(); // Sorting matrix of data
    }

    private static void fixedArray() {
        String fruit1 = "Strawberry";
        String[] fruits = {"apple", "orange", "banana", "pinapple"};

        //Arrays.sort(fruits);
        //Arrays.fill(fruits, "test");

        for(String fruit : fruits) {
            System.out.println(fruit);
        }
    }

    private static void inputArray() {
        Scanner scanner = new Scanner(System.in); 
         
        String[] foods = new String[3]; // create an empty array with size
        for(int i = 0 ; i < foods.length ; i++) {
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        for(String food : foods) {
            System.out.println(food);
        }

        scanner.close();
    }

    private static void searchArray() {
        int[] numbers = {1, 4, 6, 2, 3};
        int target = 5;
        boolean isFound = false;

        // for(int i = 0 ; i < numbers.length; i++) {
        //     if(target == numbers[i]) { 
        //         System.out.print("index: " + i);
        //         isFound = true;
        //         break;
        //     }
        //     // if(i == numbers.length -1) {
        //     //     System.out.print("not in index");
        //     // }
        // }

        // if(!isFound) {
        //     System.out.print("not in index");
        // }

        String[] fruits = {"apples", "orange", "banana"};
        Scanner scanner = new Scanner(System.in);
        
        while(!isFound) {
            System.out.print("fruits: ");
            String targetFruit = scanner.nextLine();

            //for(String item : fruits) {
            for(int i = 0 ; i < fruits.length ; i++) {
                if(fruits[i].equals(targetFruit)) {
                    System.out.print("Found, index " + i);
                    isFound = true;
                    break;
                }
            }

            if(!isFound) {
                System.out.print("Pick another ");
            }
        }

        scanner.close();
    }

    private static void array2D(){
        String[] fruits = {"apple", "orange", "banana"};
        String[] vegetables = {"potato", "onion", "carrot"};
        String[] meats = {"chicken", "pork", "beef", "fish"};
        
        String[][] groceries = {fruits, vegetables, meats};

        for(String[] foods : groceries) {
            for(String food : foods) {
                System.out.print(food + " ");
            }
            System.out.println();
        }
    }
}
