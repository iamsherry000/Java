package basic;
import java .util.Scanner;

public class GetInput {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
            
            // System.out.print("Enter your first name: ");
            // String firstName = scanner.next(); // Same line
            
            // scanner.nextLine(); // 清除換行符 (沒有的話會造成)

            // System.out.println("Enter your family name: ");
            // String familyName = scanner.nextLine(); // next line

            // System.out.print("Enter your age: ");
            // int age = scanner.nextInt();

            // System.out.println("Enter your GPA: ");
            // double gpa = scanner.nextDouble();

            // System.out.println("Your name is " + firstName + familyName 
            //     + " and your age is " + age + " ,gpa: " + gpa); 
                //Your name is sherryTseng and your age is 25 ,gpa: 3.0
            
            
            System.out.println("Are you a human? (true/false)");
            boolean isHuman = scanner.nextBoolean();
            System.out.println("Human: " + isHuman);
        
        scanner.close();
        // Can lead to unexpected behaviour if you dont have the scanner closed.


        // printf() is a method used to format output
        // %[flags][width][.precision][specifier-character]

    }
}
