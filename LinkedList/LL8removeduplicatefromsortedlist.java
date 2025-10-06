class Node{
    int data;
    Node next;
    Node(int newdata){
        data=newdata;
        next=null;
    }
}
public class LL8removeduplicatefromsortedlist {
    Node head;
    public void removeDuplicates(){
        Node curr=head;
        while(curr!=null && curr.next!=null){
      if(curr.data==curr.next.data){
        curr.next=curr.next.next;
      }
      else{
        curr=curr.next;
      }
        }
    }
    public void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String args[]){
 LL8removeduplicatefromsortedlist list=new LL8removeduplicatefromsortedlist();
  list.head = new Node(2);
        list.head.next = new Node(2);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(5);

        System.out.print("Original List: ");
        list.printList();

        list.removeDuplicates();
        System.out.print("After Removing Duplicates: ");
        list.printList();
}
}
