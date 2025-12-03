class Node{
    int data;
    Node next;
    Node(int val){
        data=val;
        next=null;
    }
}
public class LL14deletenodewithoudheadptr {
    Node head;
    void deleteNodewithouthead(Node pos){
        if(pos==null)
        return;
        else{
            if (pos.next==null) {
           System.out.println("this is last node");
           return;     
            }
        }
        pos.data=pos.next.data;
        pos.next=pos.next.next;
    }
    public void push(int new_data){
        Node new_node=new Node(new_data);
        new_node.next=head;
        head=new_node;
    }
    public void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("\null");
    }
    public static void main(String args[]){
        LL14deletenodewithoudheadptr list=new LL14deletenodewithoudheadptr();
        list.push(20);
    list.push(4);
    list.push(15);
    list.push(35);
  System.out.println("Initial Linked List : ");
    list.printList();
    Node del = list.head.next;
list.deleteNodewithouthead(del);
    System.out.println("Final Linked List after deletion of 15 : ");
    list.printList();

    }
}

