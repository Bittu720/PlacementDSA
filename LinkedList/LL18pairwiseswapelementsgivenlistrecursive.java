class Node{
    int data;
 Node next;
 Node(int val){
    data=val;
    next=null;
 }
}
public class LL18pairwiseswapelementsgivenlistrecursive {
  static void  pairwiseSwap(Node head){
    if(head==null||head.next==null){
        return;
    }
    int temp=head.data;
    head.data=head.next.data;
    head.next.data=temp;
    pairwiseSwap(head.next.next);
  }  
  static void printList(Node head){
    Node curr=head;
    while(curr!=null){
        System.out.print(curr.data+" ");
        curr=curr.next;
    }
    System.out.println();
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
