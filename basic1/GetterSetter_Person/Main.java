package basic1.GetterSetter_Person;

import java.util.Scanner;

/*
 * 建立一個 Person 類別，它有 name（String）和 age（int）兩個私有屬性。
 * 提供 getName() 和 setName(String name) 方法，讓外部可以獲取和修改 name。
 * 提供 getAge() 和 setAge(int age) 方法，確保 age 不能是負數（在 setter 做檢查）。
 * 在 main 方法中，創建一個 Person 物件，使用 setter 設定屬性，然後用 getter 取得值並印出來。
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Person person = new Person();
        System.out.println("What do you name the person? ");
        person.setName(scanner.nextLine());
        System.out.println("You named the person " + person.getName());
    }
}
