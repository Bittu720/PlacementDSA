class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LL10deletenaftermnodeoflinkedlist {

    static Node skipMdeleteN(Node head, int m, int n) {
        Node curr = head;

        while (curr != null) {
            for (int count = 1; count < m && curr != null; count++) {
                curr = curr.next;
            }

            if (curr == null) {
                return head;
            }
            Node temp = curr.next;
            for (int count = 1; count <= n && temp != null; count++) {
                temp = temp.next;
            }
            curr.next = temp;
            curr = temp;
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

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        int m = 2, n = 2;
        head = skipMdeleteN(head, m, n);

        printList(head); 
    }
}
