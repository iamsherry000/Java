package CourseProject;

import java.util.Scanner;

public class CompoundCalculator { // Compound interest calculator
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double principle, rate, amount;
        int timesCompounded, years;

        System.out.println("Enter the principal amount: ");
        principle = scanner.nextDouble();

        System.out.println("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.println("Enter the # of the times compunded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.println("Enter the number of years: ");
        years = scanner.nextInt();

        amount = principle * Math.pow(1 + rate/ timesCompounded, timesCompounded * years);
        System.out.println("The amount after " + years + " is $" + amount);

        scanner.close();
    }
}
