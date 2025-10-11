class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class LL12TraversalofCircularlinkedlistiterative {
  static void printList(Node head){
    if(head==null)
    return;
    Node curr=head;
    do{
        System.out.print(curr.data+" ");
        curr=curr.next;
    }
    while(curr!=head);
    System.out.println();
  }
  public static void main(String args[]){
    Node head = new Node(11);
        head.next = new Node(2);
        head.next.next = new Node(56);
        head.next.next.next = new Node(12);

        head.next.next.next.next = head;

        printList(head);
  }  
}
