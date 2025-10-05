 class Node{
    int data;
    Node next;
    Node(int newdata){
        data=newdata;
        next=null;
    }
 }
 class LL6deletelastoccurofanelement{
static Node deletelastoccur(Node head,int key){
    Node last=null,lastprev=null;
    Node curr=head,prev=null;
    while(curr!=null){
        if(curr.data==key){
            lastprev=prev;
            last=curr;
        }
        prev=curr;
        curr=curr.next;
    }
   if(last!=null){
    if(lastprev!=null){
        lastprev.next=last.next;
    }
    else{
        head=head.next;
    }
   } 
   return head;
}
static void print(Node curr) {
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
public static void main(String args[]){
    Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        int key = 2;
        head = deletelastoccur(head, key);
        print(head);
}
}