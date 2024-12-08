package Task4.Question3;

import java.util.Scanner;

public class WeekdayException {
    public static void main(String[] args) {

        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day position (0 for Sunday, 6 for Saturday): ");
        int dayPosition = scanner.nextInt();

        try {
            System.out.println("The day is: " + weekdays[dayPosition]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid day index. Please enter a number between 0 and 6.");
        }

    }
}


/* Output1:
Enter the day position (0 for Sunday, 6 for Saturday): 3
The day is: Wednesday */
/* Output2: 
Enter the day position (0 for Sunday, 6 for Saturday): 8
Error: Invalid day index. Please enter a number between 0 and 6. */
  
