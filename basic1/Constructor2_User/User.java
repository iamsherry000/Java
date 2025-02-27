package basic1.Constructor2_User;

public class User {
    String username; 
    String email;
    int age;

    User(String username) { // constructor
        this.username = username;
        this.email = "EMPTY";
        this.age = 0;
    }

    User(String username, String email) { // constructor
        this.username = username;
        this.email = email;
        this.age = 1;
    }
}
