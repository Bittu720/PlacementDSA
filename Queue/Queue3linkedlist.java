import java.util.Scanner;

public class Queue3linkedlist {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        Node head = null;
        Node tail = null;

        public boolean isEmpty() {
            return head == null && tail == null;
        }

        public void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }
            int front = head.data;
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
            }
            return front;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }
            return head.data;
        }

        public void display() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return;
            }
            Node temp = head;
            System.out.print("Queue elements: ");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();
        int choice;

        while (true) {
            System.out.println("\n---- Queue Menu ----");
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
                    int removed = q.remove();
                    if (removed != -1)
                        System.out.println("Removed: " + removed);
                    break;

                case 3:
                    int peeked = q.peek();
                    if (peeked != -1)
                        System.out.println("Front element: " + peeked);
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
