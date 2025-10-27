class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LL22reverselinkedlistwithgivensize {

    public Node reverseKgroup(Node head, int k) {
        Node dum = new Node(0);
        dum.next = head;
        Node prev = dum;

        while (haskNodes(prev.next, k)) {
            Node curr = prev.next;
            Node next = null;
            Node tail = curr;
            Node prevNode = null;
            int count = 0;

            while (count < k && curr != null) {
                next = curr.next;
                curr.next = prevNode;
                prevNode = curr;
                curr = next;
                count++;
            }

            prev.next = prevNode;
            tail.next = curr;
            prev = tail;
        }

        if (prev.next != null) {
            Node curr = prev.next;
            Node prevNode = null;
            while (curr != null) {
                Node next = curr.next;
                curr.next = prevNode;
                prevNode = curr;
                curr = next;
            }
            prev.next = prevNode;
        }

        return dum.next;
    }

    public static boolean haskNodes(Node node, int k) {
        int count = 0;
        while (node != null && count < k) {
            node = node.next;
            count++;
        }
        return count == k;
    }

    public static Node buildList(int[] values) {
        Node dum = new Node(0);
        Node current = dum;
        for (int val : values) {
            current.next = new Node(val);
            current = current.next;
        }
        return dum.next;
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null) {
                System.out.print(" -> ");
            }
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] values1 = {1, 2, 2, 4, 5, 6, 7, 8};
        int k = 4;
        Node head1 = buildList(values1);

        LL22reverselinkedlistwithgivensize obj = new LL22reverselinkedlistwithgivensize();
        Node result1 = obj.reverseKgroup(head1, k);

        printList(result1);
    }
}
