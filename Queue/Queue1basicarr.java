import java.util.Scanner;

public class Queue1basicarr {

    static class Queue {
        int arr[];
        int size;
        int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        // Add (Enqueue)
        public void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full!");
                return;
            }
            rear++;
            arr[rear] = data;
            System.out.println(data + " added to queue.");
        }

        // Remove (Dequeue)
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }

            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            System.out.println(front + " removed from queue.");
            return front;
        }

        // Peek
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }
            System.out.println("Front element: " + arr[0]);
            return arr[0];
        }

        // Display
        public void display() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return;
            }
            System.out.print("Queue elements: ");
            for (int i = 0; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter queue size: ");
        int n = sc.nextInt();

        Queue q = new Queue(n);

        while (true) {
            System.out.println("\n---- Queue Menu ----");
            System.out.println("1. Add (Enqueue)");
            System.out.println("2. Remove (Dequeue)");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

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
