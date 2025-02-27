package basic;
import java.util.Scanner;

public class SubStringExample {
    public static void main(String[] args) {
        // substring() = A method used to extract a portion of a string.substring(start, end)

        // String email = "iamsherry000@gmail.com";
        // String username = email.substring(0, email.indexOf("@"));
        // String domain = email.substring(email.indexOf("@"));

        // System.out.println("Username: " + username + " domain: " + domain);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your email: ");
        String email = scanner.nextLine();

        if(email.contains("@")) {
            String username = email.substring(0, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@"));
            System.out.println("Username: " + username + "domain: " + domain);
        }
        else{
            System.out.println("Not valid.");
        }
        
        scanner.close();
    }
}
