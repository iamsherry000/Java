
public class NestedIf {
    public static void main(String[] args) {
        boolean isStudent = true; 
        boolean isSenior = true; // age > 65
        double price = 9.99;
        
        if(isStudent) {
            if(isSenior) {
                System.out.println("senior discount : 20%");
                System.out.println("student discount : 10%");
                price *= 0.7;
            }
            else{
                System.out.println("student discount : 10%");
                price *= 0.9;
            }
        }
        else if(isSenior) {
            System.out.println("senior discount : 20%");
            price *= 0.7;
        }
        else {
            price *= 1; // no change
        }
        
        System.out.printf("Pay: %.2f", price);
    }
}
