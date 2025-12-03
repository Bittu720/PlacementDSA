class Node{
    int data;
    Node next;
    Node(int value){
        data=value;
        next=null;
    }
}
public class LL13deletespecificposincircularlinkedlist {
 public static Node deleteSpecificNode(Node last,int key){
    if(last==null){
        System.out.println("List is empty");
        return null;
    }
    Node curr=last.next;
    Node prev=last;
    if(curr==last && curr.data==key){
        last=null;
        return last;
    }
    if(curr.data==key){
    last.next=curr.next;
    return last;
    }
    while(curr!=last && curr.data!=key){
        prev=curr;
        curr=curr.next;
    }
    if(curr.data==key){
        prev.next=curr.next;
        if(curr==last){
            last=prev;
        }
    }
    else{
        System.out.println("Node with data "+key+" not found");
    }
    return last;
    }
    public static void printList(Node last){
       if(last==null){
        System.out.println("list is empty");
        return;
       } 
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
        int key = 3;
        last = deleteSpecificNode(last, key);
        System.out.print("List after deleting node " + key
                         + ": ");
        printList(last);
    }

 }   


