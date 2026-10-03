import java.util.Scanner;

class Stack2DArray {

    int[][] stack = new int[3][5];
    int top = -1;

    // Push
    void push(int value) {

        if (top == 4) {
            System.out.println("Stack is full.");
        } else {
            top++;
            stack[0][top] = value;

            System.out.println(value + " pushed into stack.");
        }
    }

    // Pop
    void pop() {

        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println(stack[0][top] + " popped from stack.");
            top--;
        }
    }

    // Peek
    void peek() {

        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Top element: " + stack[0][top]);
        }
    }

    // Display
    void display() {

        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack elements:");

            for (int i = top; i >= 0; i--) {
                System.out.println(stack[0][i]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Stack2DArray s = new Stack2DArray();

        int choice;

        do {

            System.out.println("\n--- STACK USING 2D ARRAY ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            if (choice == 1) {

                System.out.print("Enter value: ");
                int value = input.nextInt();

                s.push(value);

            } else if (choice == 2) {

                s.pop();

            } else if (choice == 3) {

                s.peek();

            } else if (choice == 4) {

                s.display();

            } else if (choice == 5) {

                System.out.println("Program ended.");

            } else {

                System.out.println("Invalid choice.");

            }

        } while (choice != 5);

        input.close();
    }
}