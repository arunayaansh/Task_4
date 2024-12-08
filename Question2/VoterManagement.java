package Task4.Question2;

public class VoterManagement {
    public static void main(String[] args) {
        try {
            // Valid Voter
            Voter voter1 = new Voter(1, "Alice", 25);
            voter1.displayInfo();

            // Invalid Voter
            Voter voter2 = new Voter(2, "Bob", 16);
            voter2.displayInfo();
        } catch (InvalidVoterAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

/* Output:
Voter ID: 1
Name: Alice
Age: 25
Exception: Invalid age for voter

Process finished with exit code 0 */
