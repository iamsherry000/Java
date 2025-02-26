
public class BasicVariables {
    public static void main(String[] args) {
        // Variable = a reusable container for a value
            // primitive = simple value stored directly in memory (stack)
            // reference = memory address that points to the (heap)
    
        // Primitive
        // two steps to creating a variable
            // 1. declaration
            //int age;
            // 2. assignment
            //age = 21;
            //System.out.println("age: " + age); // age: 21

            //double weight = 50;
            //System.out.println("weight: " + weight); // weight: 50.0

            //char grade = 'A';
            //char symbol = '!';
            //System.out.println("grade,symbol: " + grade + " " + symbol); // grade,symbol: A !

            //boolean isHuman = true;
            // if(isHuman) {
            //     System.out.println("You are a human");
            // }
            // else{
            //     System.out.println("You are not a human");
            // }

        // Reference
            String name = "Sherry";
            System.out.println("Hello " + name);

    }
}
