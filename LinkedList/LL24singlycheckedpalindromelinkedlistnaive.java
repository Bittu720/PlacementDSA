import java.util.Stack;
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
public class LL24singlycheckedpalindromelinkedlistnaive {
static boolean isPalindrome(Node head) {
        Node currNode = head;
        Stack<Integer> s = new Stack<>();
        while (currNode != null) {
            s.push(currNode.data);
            currNode = currNode.next;
        }
        while (head != null) {
            int c = s.pop();
            if (head.data != c) {
                return false;
            }
            head = head.next;
        }
        return true;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);
        boolean result = isPalindrome(head);
        if (result)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
