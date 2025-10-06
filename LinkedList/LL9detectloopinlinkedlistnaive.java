import java.util.HashSet;
class Node{
    int data;
    Node next;
    Node(int x){
        this.data=x;
        this.next=null;
    }
}
public class LL9detectloopinlinkedlistnaive {
    static boolean detectLoop(Node head){
        HashSet<Node>st=new HashSet<>();
        while(head!=null){
            if(st.contains(head))
            return true;
            st.add(head);
            head=head.next;
        }
        return false;
    }
    public static void main(String args[]){
          Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(4);
head.next.next.next = head.next;

        if (detectLoop(head))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
