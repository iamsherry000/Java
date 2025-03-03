package basic1.Enum_Days;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day: ");
        String input = scanner.nextLine().toUpperCase();
        
        
        try {
            //Day day = Day.SUNDAY;
            Day day = Day.valueOf(input);
            //System.out.println(day);
            //System.out.println(day.getDayNumber()); // for switches
            
            switch (day) {
                case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY 
                -> System.out.println("It is a weekday");
                case SATURDAY, SUNDAY -> System.out.println("It is weekend");
            }
        } 
        catch (IllegalArgumentException e) {
            System.out.println("Plz enter a valid day");
        }
        

        scanner.close();
    }
    
}
