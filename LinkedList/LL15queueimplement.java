class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

class Queue {
    private Node front;
    private Node rear;
    public Queue() {
        front = rear = null;
    }
    public boolean isEmpty() {
        return front == null;
    }
    public void enqueue(int new_data) {
        Node new_node = new Node(new_data);
        if (isEmpty()) {
            front = rear = new_node;
        } else {
            rear.next = new_node;
            rear = new_node;
        }
        printQueue();
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        Node temp= front;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        temp = null;  
        printQueue();
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        Node temp = front;
        System.out.print("Current queue: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class LL15queueimplement {
    public static void main(String args[]) {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
        q.dequeue();
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.dequeue();
    }
}
