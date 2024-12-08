package Task4.Question4;

import java.util.Scanner;

public class StudentMangement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentGrades studentGradesObj = new StudentGrades();

        studentGradesObj.addStudent("John", 85);
        studentGradesObj.addStudent("Alice", 90);
        studentGradesObj.addStudent("Bob", 78);

        System.out.print("Enter student's name to display grade: ");
        String nameToDisplay = scanner.nextLine();
        studentGradesObj.displayGrade(nameToDisplay);

        System.out.print("Enter student's name to remove: ");
        String nameToRemove = scanner.nextLine();
        studentGradesObj.removeStudent(nameToRemove);

        System.out.print("Enter student's name to display grade after removal: ");
        String nameAfterRemoval = scanner.nextLine();
        studentGradesObj.displayGrade(nameAfterRemoval);
    }
}


/* Output:
Student John added with grade 85
Student Alice added with grade 90
Student Bob added with grade 78
Enter student's name to display grade: Alice
Grade of Alice: 90
Enter student's name to remove: Bob
Student Bob removed.
Enter student's name to display grade after removal: Bob
Student Bob not found.  */
