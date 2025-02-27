package basic1;

import java.util.Scanner;

public class MethodExample {
    public static void main(String[] args) {
        // DRY : Dont Repeat Yourself

        PrintHappyBirthday();
    }

    private static void PrintHappyBirthday() {
        // 使用 String[] 來存 name 和 age
        String[] userInfo = getUserInfo();
        String name = userInfo[0];
        int age = Integer.parseInt(userInfo[1]);

        System.out.println("Happy birthday");
        System.out.printf("Happy birthday to %s\n", name);
        System.out.printf("You are %d years old\n", age);
    }

    private static String[] getUserInfo() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        System.out.print("What is your age? ");
        String age = scanner.nextLine();

        scanner.close();

        return new String[]{name, age}; // 用 String 陣列回傳
    }
}
