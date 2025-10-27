import java.util.ArrayList;
import java.util.Collections;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class LL23mergetwosortedlinkedlistnaive {
   static Node sortedMerge(Node head1,Node head2){
    ArrayList<Integer>arr=new ArrayList<>();
      while (head1 != null) {
            arr.add(head1.data);
            head1 = head1.next;
        }
 while (head2 != null) {
            arr.add(head2.data);
            head2 = head2.next;
        }
Collections.sort(arr);
Node dummy = new Node(-1);
        Node curr = dummy;

        for (int i = 0; i < arr.size(); i++) {
            curr.next = new Node(arr.get(i));
            curr = curr.next;
        }

        return dummy.next;
   } 
    static void printList(Node curr) {
        while (curr != null) {
            System.out.print(curr.data);
            if (curr.next != null) {
                System.out.print(" ");
            }
            curr = curr.next;
        }
        System.out.println();
    }
public static void main(String[] args) {
        Node head1 = new Node(5);
        head1.next = new Node(10);
        head1.next.next = new Node(15);
        Node head2 = new Node(2);
        head2.next = new Node(3);
        head2.next.next = new Node(20);
        Node res = sortedMerge(head1, head2);
        printList(res);
    }
}