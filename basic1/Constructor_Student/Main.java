package basic1.Constructor_Student;

public class Main {
    public static void main(String[] args) {
        
        Student student1 = new Student("SpongeBob", 20, 3);
        Student student2 = new Student("Banana", 23, 5);
        
        System.out.println(student1.name);
        student2.study();
    }
}
