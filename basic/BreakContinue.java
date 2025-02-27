package basic;
public class BreakContinue {
    public static void main(String[] args) {
        
        for(int i = 0 ; i < 10 ; i++) {
            if(i == 5) {
                continue; // skip one
            }
            if(i == 8) {
                break; // break the after
            }
            System.out.print(i + " "); //0 1 2 3 4 6 7 
        }
    }
}
