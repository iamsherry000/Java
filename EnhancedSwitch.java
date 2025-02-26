public class EnhancedSwitch {
    public static void main(String[] args) {
        // Enhanced switch = A replacement to many else if statements(Java14 feature)

        String day = "pizza";

        // if(day.equals("Monday")){
        //     System.out.println("Weekday");
        // }
        // else if(day.equals("Tuesday")) {
        //     System.out.println("Weekday");
        // }
        // else if(day.equals("Saturday")) {
        //     System.out.println("Weekend");
        // }
        // else if(day.equals("Sunday")) {
        //     System.out.println("Weekend");
        // }
        // else{
        //     System.out.println(day + " is not a day in the week");
        // }

        // switch (item) { // switch 可以用的
        //     case value:
                
        //         break;
        
        //     default:
        //         break;
        // }
        
        switch (day) {
            case "Monday": System.out.println("Weekday"); break;
            case "Tuesday": System.out.println("Weekday"); break;
            case "Wednesday", "Thursday", "Friday": System.out.println("Weekday"); // above java14 
            case "Saturday": System.out.println("Weekend"); break;
            case "Sunday": System.out.println("Weekend"); break;
            default: System.out.println(day + " is not a day in the week");
        }

        // switch (day) { // Java 14 以上
        //     case "Monday" -> System.out.println("Weekday");
        //     case "Tuesday" -> System.out.println("Weekday");
        // }
    }
}
