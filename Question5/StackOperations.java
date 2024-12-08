package Task4.Question5;

import java.util.Stack;

public class StackOperations {
    private Stack<Integer> stack;

    public StackOperations() {
        stack = new Stack<>();
    }

    // To push an element onto the stack
    public void pushElement(int element) {
        stack.push(element);
        System.out.println("Element " + element + " pushed onto the stack.");
    }

    // To pop an element from the stack
    public void popElement() {
        if (!stack.isEmpty()) {
            int poppedElement = stack.pop();
            System.out.println("Element " + poppedElement + " popped from the stack.");
        } else {
            System.out.println("Stack is empty. Cannot pop element.");
        }
    }

    // To check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Function to display the stack contents
    public void displayStack() {
        if (!stack.isEmpty()) {
            System.out.println("Stack contents: " + stack);
        } else {
            System.out.println("Stack is empty.");
        }
    }

}
