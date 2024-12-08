package Task4.Question5;

import java.util.Scanner;

public class StackMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StackOperations stackOps = new StackOperations();

        // Pushing elements onto the stack
        stackOps.pushElement(10);
        stackOps.pushElement(20);
        stackOps.pushElement(30);
        stackOps.pushElement(40);


        // Display stack contents
        stackOps.displayStack();

        // Popping elements from the stack
        stackOps.popElement();
        stackOps.popElement();

        // Check if the stack is empty
        if (stackOps.isEmpty()) {
            System.out.println("The stack is empty.");
        } else {
            System.out.println("The stack is not empty.");
        }

        // Display stack contents after popping
        stackOps.displayStack();

    }
}


/* Output:
Element 10 pushed onto the stack.
Element 20 pushed onto the stack.
Element 30 pushed onto the stack.
Element 40 pushed onto the stack.
Stack contents: [10, 20, 30, 40]
Element 40 popped from the stack.
Element 30 popped from the stack.
The stack is not empty.
Stack contents: [10, 20]  */
