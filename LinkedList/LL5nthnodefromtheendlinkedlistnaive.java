class Node{
    int data;
    Node next;
    Node(int newdata){
        data=newdata;
        next=null;
    }
}
public class LL5nthnodefromtheendlinkedlistnaive {
 static int findNthfromlast(Node head,int N){
    int len=0,i;
    Node temp=head;
    while(temp!=null){
        temp=temp.next;
        len++;
    }
    if(len<N)
    return -1;
    temp=head;
    for(i=1;i<len-N+1;i++)
    temp=temp.next;
    return temp.data;
 }  
 public static void main(String args[]){
    Node head=new Node(35);
    head.next=new Node(15);
    head.next.next=new Node(4);
    head.next.next.next=new Node(20);
    System.out.println(findNthfromlast(head,4));
 } 
}
