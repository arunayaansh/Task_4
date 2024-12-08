package Task4.Question4;

import java.util.HashMap;

public class StudentGrades {
    private HashMap<String, Integer> studentGrades;

    public StudentGrades() {
        studentGrades = new HashMap<>();
    }

    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
        System.out.println("Student " + name + " added with grade " + grade);
    }

    public void removeStudent(String name) {
        if (studentGrades.containsKey(name)) {
            studentGrades.remove(name);
            System.out.println("Student " + name + " removed.");
        } else {
            System.out.println("Student " + name + " not found.");
        }
    }

    public void displayGrade(String name) {
        if (studentGrades.containsKey(name)) {
            System.out.println("Grade of " + name + ": " + studentGrades.get(name));
        } else {
            System.out.println("Student " + name + " not found.");
        }
    }
}


