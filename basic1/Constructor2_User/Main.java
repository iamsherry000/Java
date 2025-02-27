package basic1.Constructor2_User;

public class Main {
    // overloaded constructors 
        // = Allow a class have multiple constructors
        //   with different parameter lists.
        //   Enable objs to be initialized in various ways
    // Basically just overload method in constructors
    public static void main(String[] args) {
        User user1 = new User("Harry");
        User user2 = new User("Ron", "Ron@gmail.com");

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);
        System.out.println(" ");

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);
    }
}
