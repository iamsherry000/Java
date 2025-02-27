package basic1;

public class OverloadMethod {
    public static void main(String[] args) {
        // overload: methods that share the name, but different parameters.
            // signature = name + parameters
        
        
        //case1_add();
        case2_bakeBread();
    }

    

    public static void case1_add() {
        System.out.println(add(1,2)); // 3
        
        System.out.println(add(1.5,2)); // 3.5

        System.out.println(add(1,2,3)); // 6
    }

    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void case2_bakeBread() {
        String pizza = bakePizza("flat bread");
        System.out.println(pizza);
        String pizza1 = bakePizza("round bread", "mozzarella");
        System.out.println(pizza1);
    }


    static String bakePizza(String bread) {
        return bread + " pizza";
    }

    static String bakePizza(String bread, String cheese) {
        return cheese + " " + bread + " pizza";
    }
}
