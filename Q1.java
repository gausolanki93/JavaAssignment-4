public class Q1 {
    // Fields
    String name;
    int id;

    // Constructor
    public Q1(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Main method
    public static void main(String[] args) {
        // Create an object of the Student class
        Q1 student = new Q1("John Doe", 12345);

        // Print the values of the fields
        System.out.println("Student Name: " + student.name);
        System.out.println("Student ID: " + student.id);
    }
}