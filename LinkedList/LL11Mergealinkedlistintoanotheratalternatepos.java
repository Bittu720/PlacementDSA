import java.util.*;
class Node{
    int data;
    Node next;
    Node(int x){
        data =x;
        next=null;
    }
}
public class LL11mergealinkedlistintoanotheratalternatepos {
    static void printList(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
    static List<Node>merge(Node head1,Node head2){
        Node temp1=head1;
        Node temp2=head2;
        while(temp1!=null && temp2!=null){
            Node ptr1=temp1.next;
            Node ptr2=temp2.next;
             temp2.next = temp1.next;
            temp1.next = temp2;
             temp1 = ptr1;
            temp2 = ptr2;
        }
        return Arrays.asList(head1,temp2);
    }
    public static void main(String args[]){
       Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3); 
         Node head2 = new Node(4);
        head2.next = new Node(5);
        head2.next.next = new Node(6);
        head2.next.next.next = new Node(7);
        head2.next.next.next.next = new Node(8); 
        List<Node> ar = merge(head1, head2);
        printList(ar.get(0));
        printList(ar.get(1));
    }
}

