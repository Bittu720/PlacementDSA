import java.util.Scanner;

public class Queue2circularqueue {

    static class Queue {
        int arr[];
        int size;
        int rear;
        int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        // Add
        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full!");
                return;
            }
            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
            System.out.println(data + " added to queue.");
        }

        // Remove
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }

            int result = arr[front];

            // if only one element is left
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }

            System.out.println(result + " removed from queue.");
            return result;
        }

        // Peek
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }
            System.out.println("Front element: " + arr[front]);
            return arr[front];
        }

        // Display
        public void display() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return;
            }

            System.out.print("Queue elements: ");
            int i = front;
            while (true) {
                System.out.print(arr[i] + " ");
                if (i == rear) break;
                i = (i + 1) % size;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter queue size: ");
        int n = sc.nextInt();

        Queue q = new Queue(n);
        int choice;

        while (true) {
            System.out.println("\n---- Circular Queue Menu ----");
            System.out.println("1. Add (Enqueue)");
            System.out.println("2. Remove (Dequeue)");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to add: ");
                    int val = sc.nextInt();
                    q.add(val);
                    break;
                case 2:
                    q.remove();
                    break;
                case 3:
                    q.peek();
                    break;
                case 4:
                    q.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
