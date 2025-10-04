class Node{
    int data;
    Node next;
    Node(int newdata){
        data=newdata;
        next=null;
    }
}
public class LL5nthnodefromendlinkedlisteff {
 static int Nthfromend(Node head,int N){
    Node mainptr=head;
    Node refptr=head;
    for(int i=1;i<N;i++){
        refptr=refptr.next;
        if(refptr==null){
            return -1;
        }
    }
    while(refptr.next!=null){
        refptr=refptr.next;
        mainptr=mainptr.next;
    }
    return mainptr.data;
 }  
 public static void main(String args[]){
   Node head = new Node(35);
        head.next = new Node(15);
        head.next.next = new Node(4);
        head.next.next.next = new Node(20); 
          System.out.println(Nthfromend(head, 4));
 } 
}
