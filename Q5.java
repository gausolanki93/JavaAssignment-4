// Student class
class Student5 {
    // Fields
    String name;
    int id;

    // Method to initialize values
    public void initializeValues(String studentName, int studentId) {
        name = studentName;
        id = studentId;
    }
}

// Main class
public class Q5 {
    public static void main(String[] args) {
        // Create multiple objects of the Student class and initialize values
        Student5 student1 = new Student5();
        student1.initializeValues("John Doe", 12345);

        Student5 student2 = new Student5();
        student2.initializeValues("Jane Smith", 67890);

        // Access and print the values of the fields for each student
        System.out.println("Student 1 - Name: " + student1.name + ", ID: " + student1.id);
        System.out.println("Student 2 - Name: " + student2.name + ", ID: " + student2.id);
    }
}