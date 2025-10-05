class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
public class LL7deletemiddleofthelinkedlist {
   static Node deletemid(Node head){
if(head==null)
return null;
if(head.next==null){
    return null;
}
Node prev=null;
Node slow=head;
Node fast=head;
while(fast!=null && fast.next!=null){
    fast=fast.next.next;
    prev=slow;
    slow=slow.next;
}
prev.next=slow.next;
return head;
   }
   static void printList(Node head){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
    System.out.println("null");
   } 
   public static void main(String args[]){
     Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        System.out.print("Original Linked List: ");
        printList(head);
          head = deletemid(head);
        System.out.print
          ("Linked List after deleting the middle node: ");
        printList(head);
   }
}
