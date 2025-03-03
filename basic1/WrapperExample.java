package basic1;

/*
 * Wrapper classes = allowe primitive values (int, char, double, boolean) to be used as obj.
 * generally dont wrap primitives unless you need an object
 * Allows use of collections frameword and static utility methods
 */

public class WrapperExample {
    public static void main(String[] args) {
        
        
        int a = 123;
        Integer a1 = 123; // wrapper classes // Autoboxing
        double b = 3.14;
        Double b1 = 3.14; // wrapper classes
        char c = '$';
        Character c1 = '$'; // wrapper classes
        boolean d = true;
        Boolean d1 = true; // wrapper classes

        // Unboxing
        int x = a1;

        
    }
}
