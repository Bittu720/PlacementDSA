import java.util.Scanner;
class Node {
    int data;
    Node next;
    Node(int x) {
        this.data = x;
        this.next = null;
    }
}
public class LL1middleofthelinkedlisteff {
    static int getMiddle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of nodes: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("List is empty.");
            sc.close();
            return;
        }
        System.out.print("Enter data for node 1: ");
        int data = sc.nextInt();
        Node head = new Node(data);
        Node current = head;
        for (int i = 2; i <= n; i++) {
            System.out.print("Enter data for node " + i + ": ");
            data = sc.nextInt();
            current.next = new Node(data);
            current = current.next;
        }
        sc.close();
        int middle = getMiddle(head);
        System.out.println("The middle element is: " + middle);
    }
}
