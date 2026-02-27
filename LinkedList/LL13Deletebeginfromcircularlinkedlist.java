class Node{
    int data;
    Node next;
    Node(int value){
        data=value;
        next=null;
    }
}
public class LL13deletebeginfromcircularlinkedlist {
  public static Node deleteFirstNode(Node last){
    if(last==null){
        System.out.println("list is empty");
        return null;
    }
    Node head=last.next;
    if(head==last){
            last=null;
        }
        else{
          last.next=head.next;  
        }
        return last;
    }
    public static void printList(Node last){
        if(last==null)
        return;
        Node head=last.next;
        while(true){
            System.out.print(head.data+" ");
            head=head.next;
            if(head==last.next)
            break;
        }
        System.out.println();
    }
    public static void main(String args[]){
       Node first = new Node(2);
        first.next = new Node(3);
        first.next.next = new Node(4);
        Node last = first.next.next;
        last.next = first;
        System.out.print("Original list: ");
        printList(last);
   last = deleteFirstNode(last);
        System.out.print("List after deleting first node: ");
        printList(last);
    }
  }  

