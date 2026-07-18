class Node{
    int data;
    Node next;
    Node(int val){
        data=val;
        next=null;
    } 
}
public class LL18pairwiseSwapiterative {
  static void pairwiseSwap(Node head){
    Node curr=head;
    while(curr!=null && curr.next!=null){
        int temp=curr.data;
        curr.data=curr.next.data;
        curr.next.data=temp;
        curr=curr.next.next;
    }
  } 
   static void printList(Node head){
    Node curr=head;
    while(curr!=null){
        System.out.print(curr.data+" ");
        curr=curr.next;
    }
   }
   public static void main(String args[]){
    Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        pairwiseSwap(head);
        printList(head);
   }
}
