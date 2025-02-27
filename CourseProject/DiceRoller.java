package CourseProject;

import java.util.Random;
import java.util.Scanner;

public class DiceRoller {
    public static void main(String[] agrs) {
        
        // DECLARE VARIABLES
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numOfDice;
        int total = 0;

        // GET # OF DICE FROM THE USER
        System.out.print("Enter the # of the dice: ");
        numOfDice = scanner.nextInt();
        
        // CHECK IF # OF DICE > 0
        if(numOfDice > 0) {
            // ROLL ALL THE DICE
            // System.out.println("Rolled");
            for(int i = 0 ; i < numOfDice; i++) {
                int roll = random.nextInt(1,7);
                System.out.println("Rolled: " + roll);
                ASCIIPrintDie(roll); // DISPLAY ASCII OF DICE
                
                // GET THE TOTAL
                total += roll;
            }
            // print THE TOTAL
            System.out.println("Total: " + total);
        }
        else{
            System.out.println("Must > 0");
        }


        scanner.close();
    }
    
    //DISPLAY ASCII OF DICE
    static void ASCIIPrintDie(int roll) {
        String dice1 = """
                -------
                |     |
                |  ●  |
                |     |
                -------
            """;

            String dice2 = """
                -------
                | ●   |
                |     |
                |   ● |
                -------
            """;

            String dice3 = """
                -------
                | ●   |
                |  ●  |
                |   ● |
                -------
            """;

            String dice4 = """
                -------
                | ● ● |
                |     |
                | ● ● |
                -------
            """;

            String dice5 = """
                -------
                | ●  ●|
                |  ●  |
                | ●  ●|
                -------
            """;

            String dice6 = """
                -------
                | ●  ●|
                | ●  ●|
                | ●  ●|
                -------
            """;
        
        switch(roll) {
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid");
        }
    }
}
