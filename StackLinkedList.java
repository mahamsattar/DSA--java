import java.util.Scanner;

class StackLinkedList {

    Node top;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Push
    void push(int data) {
        Node newNode = new Node(data);

        newNode.next = top;
        top = newNode;

        System.out.println(data + " pushed into stack.");
    }

    // Pop
    void pop() {
        if (top == null) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println(top.data + " popped from stack.");
            top = top.next;
        }
    }

    // Peek
    void peek() {
        if (top == null) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Top element: " + top.data);
        }
    }

    // Display
    void display() {
        if (top == null) {
            System.out.println("Stack is empty.");
        } else {
            Node temp = top;

            System.out.println("Stack elements:");

            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        StackLinkedList stack = new StackLinkedList();

        int choice;

        do {
            System.out.println("\n--- STACK USING LINKED LIST ---");
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

                stack.push(value);

            } else if (choice == 2) {

                stack.pop();

            } else if (choice == 3) {

                stack.peek();

            } else if (choice == 4) {

                stack.display();

            } else if (choice == 5) {

                System.out.println("Program ended.");

            } else {

                System.out.println("Invalid choice.");

            }

        } while (choice != 5);

        input.close();
    }
}