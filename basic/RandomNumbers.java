package basic;
import java.util.Random;
public class RandomNumbers {
    public static void main(String[] args) {
        
        Random random = new Random();

        //int number = random.nextInt(1,5); // Java 17 以上
        int number = random.nextInt(5) + 1;
        System.out.println(number);

        // double, boolean 也可以
    }
}
