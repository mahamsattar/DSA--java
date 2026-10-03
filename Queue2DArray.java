import java.util.Scanner;

class Queue2DArray {

    int[][] queue = new int[3][5];

    int front = 0;
    int rear = -1;

    // Enqueue
    void enqueue(int value) {

        if (rear == 4) {
            System.out.println("Queue is full.");
        } else {
            rear++;
            queue[0][rear] = value;

            System.out.println(value + " added to queue.");
        }
    }

    // Dequeue
    void dequeue() {

        if (front > rear) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println(queue[0][front] + " removed from queue.");
            front++;
        }
    }

    // Peek
    void peek() {

        if (front > rear) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Front element: " + queue[0][front]);
        }
    }

    // Display
    void display() {

        if (front > rear) {
            System.out.println("Queue is empty.");
        } else {

            System.out.println("Queue elements:");

            for (int i = front; i <= rear; i++) {
                System.out.println(queue[0][i]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Queue2DArray q = new Queue2DArray();

        int choice;

        do {

            System.out.println("\n--- QUEUE USING 2D ARRAY ---");
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

                q.enqueue(value);

            } else if (choice == 2) {

                q.dequeue();

            } else if (choice == 3) {

                q.peek();

            } else if (choice == 4) {

                q.display();

            } else if (choice == 5) {

                System.out.println("Program ended.");

            } else {

                System.out.println("Invalid choice.");

            }

        } while (choice != 5);

        input.close();
    }
}