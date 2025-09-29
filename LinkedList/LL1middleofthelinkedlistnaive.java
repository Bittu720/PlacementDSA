class Node{
    int data;
    Node next;
    Node(int x){
     this.data=x;
     this.next=null;   
    }
}
public class LL1middleofthelinkedlistnaive {
   static int getLength(Node head){
    int length=0;
    while(head!=null){
        length++;
        head=head.next;
    }
    return length;
   }
   static int getMiddle(Node head){
    int length=getLength(head);
    int mid_index=length/2;
    while(mid_index>0){
        head=head.next;
        mid_index--;
    }
    return head.data;
   } 
public static void main(String args[]){
    Node head=new Node(10);
    head.next=new Node(20);
    head.next.next=new Node(30);
    System.out.println(getMiddle(head));
}
}
