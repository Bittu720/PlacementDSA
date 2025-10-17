class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class LL19occurenceCountinlinkedlistnaive {
 static int count(Node head,int key){
    if(head==null){
        return 0;
    }
    int ans=count(head.next,key);
    if (head.data==key) {
     ans++;   
    }
    return ans;
 } 
 public static void main(String args[]){
  Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);
        int key = 1;
        System.out.println(count(head, key));  
 }  
}
