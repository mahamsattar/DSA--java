import java.util.Scanner;

class QueueLinkedList {

    Node front;
    Node rear;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Enqueue
    void enqueue(int data) {
        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        System.out.println(data + " added to queue.");
    }

    // Dequeue
    void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println(front.data + " removed from queue.");
            front = front.next;

            if (front == null) {
                rear = null;
            }
        }
    }

    // Peek
    void peek() {
        if (front == null) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Front element: " + front.data);
        }
    }

    // Display
    void display() {
        if (front == null) {
            System.out.println("Queue is empty.");
        } else {
            Node temp = front;

            System.out.println("Queue elements:");

            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        QueueLinkedList queue = new QueueLinkedList();

        int choice;

        do {
            System.out.println("\n--- QUEUE USING LINKED LIST ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            if (choice == 1) {

                System.out.print("Enter value: ");
                int value = input.nextInt();

                queue.enqueue(value);

            } else if (choice == 2) {

                queue.dequeue();

            } else if (choice == 3) {

                queue.peek();

            } else if (choice == 4) {

                queue.display();

            } else if (choice == 5) {

                System.out.println("Program ended.");

            } else {

                System.out.println("Invalid choice.");

            }

        } while (choice != 5);

        input.close();
    }
}