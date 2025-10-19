class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class LL21singlyconvertintocircularRec {
   static void circular(Node curr,Node head){
    if(curr.next==null){
        curr.next=head;
        return;
    }
    circular(curr.next,head);
   } 
   static void printList(Node head){
    Node curr=head;
    do{
        System.out.print(curr.data+" ");
        curr=curr.next;
    }
    while(curr!=head);
    System.out.println();
   }
   public static void main(String args[]){
     Node head = new Node(10);
        head.next = new Node(12);
        head.next.next = new Node(14);
        head.next.next.next = new Node(16);
        circular(head, head);
        printList(head);
   }
}
