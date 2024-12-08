package Task4;

public class StudentManagementSystem {
    public static void main(String[] args) {
        try {
            // Valid Student
            Student student1 = new Student(1, "John Doe", 20, "Computer Science");
            student1.displayInfo();
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            // Invalid Age
            Student student2 = new Student(2, "Jane Doe", 22, "Mathematics");
            student2.displayInfo();
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            // Invalid Name
            Student student3 = new Student(3, "John123", 19, "Physics");
            student3.displayInfo();
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            // Invalid Age and Name
            Student student4 = new Student(4, "Bob@Smith", 25, "Chemistry");
            student4.displayInfo();
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}


/* Output:
Roll No: 1
Name: John Doe
Age: 20
Course: Computer Science
Exception: Age must be between 15 and 21. Provided: 22
Exception: Name contains invalid characters. Provided: John123
Exception: Age must be between 15 and 21. Provided: 25

Process finished with exit code 0 */
