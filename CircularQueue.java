import java.util.Scanner;

class CircularQueue {

    int[] queue = new int[5];

    int front = -1;
    int rear = -1;

    // Enqueue
    void enqueue(int value) {

        if ((rear + 1) % queue.length == front) {
            System.out.println("Queue is full.");
            return;
        }

        if (front == -1) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % queue.length;
        }

        queue[rear] = value;

        System.out.println(value + " added to circular queue.");
    }

    // Dequeue
    void dequeue() {

        if (front == -1) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.println(queue[front] + " removed from circular queue.");

        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % queue.length;
        }
    }

    // Peek
    void peek() {

        if (front == -1) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Front element: " + queue[front]);
        }
    }

    // Display
    void display() {

        if (front == -1) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.println("Circular Queue elements:");

        int i = front;

        while (true) {

            System.out.println(queue[i]);

            if (i == rear) {
                break;
            }

            i = (i + 1) % queue.length;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        CircularQueue q = new CircularQueue();

        int choice;

        do {

            System.out.println("\n--- CIRCULAR QUEUE ---");
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
