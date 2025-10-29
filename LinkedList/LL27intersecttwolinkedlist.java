public class LL27intersecttwolinkedlist {
    static Node a=null,b=null;
    static Node dummy=null;
    static Node tail=null;
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    void printList(Node start){
        Node p=start;
        while(p!=null){
            System.out.print(p.data+" ");
            p=p.next;
        }
        System.out.println();
    }
     void push(int data) {
        Node temp = new Node(data);
        if(dummy == null) {
            dummy = temp;
            tail = temp;
        }
        else {
            tail.next = temp;
            tail = temp;
        }
    }
    void sortedIntersect()
    {
        Node p = a,q = b;
        while(p != null  &&  q != null)
        {
            if(p.data == q.data)
            {
                push(p.data);
                p = p.next;
                q = q.next;
            }
            else if(p.data < q.data)
                p = p.next;
            else
                q= q.next;
        }
    }
     public static void main(String args[])
    {
     LL27intersecttwolinkedlist list = new LL27intersecttwolinkedlist();
        list.a = new Node(1);
        list.a.next = new Node(2);
        list.a.next.next = new Node(3);
        list.a.next.next.next = new Node(4);
        list.a.next.next.next.next = new Node(6);
        list.b = new Node(2);
        list.b.next = new Node(4);
        list.b.next.next = new Node(6);
        list.b.next.next.next = new Node(8);
        list.sortedIntersect();
        System.out.println("Linked list containing common items of a & b");
        list.printList(dummy);
    }
}
