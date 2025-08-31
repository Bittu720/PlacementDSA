class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

public class LL17removeeveryknodeofthelinkedlist {

    static Node deleteK(Node head, int k) {
        if (head == null || k <= 0)
            return head;

        Node curr = head;
        Node prev = null;
        int count = 0;

        while (curr != null) {
            count++;
            if (count % k == 0) {
                if (prev != null) {
                    prev.next = curr.next;
                } else {
                    head = curr.next;
                }
            } else {
                prev = curr;
            }
            curr = curr.next;
        }

        return head;
    }

    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        int k = 2;

        head = deleteK(head, k);
        printList(head);
    }
}

