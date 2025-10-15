class Node{
    int data;
    Node next;
    Node(int new_data){
        this.data=new_data;
        this.next=null;
    }
}
class Stack{
    Node head;
    Stack(){
        this.head=null;
    }
    boolean isEmpty(){
        return head==null;
    }
    void push(int new_data){
        Node new_node=new Node(new_data);
        if(new_node==null) {
            System.out.println("Stack Overflow");
            return;
        }
        new_node.next=head;
        head=new_node;
        }
    void pop(){
      if(isEmpty()){
        System.out.println("Stack Underflow");
        return;
      } 
      else{
        Node temp=head;
        head=head.next;
        temp=null;
      } 
    }
    int peek(){
        if(!isEmpty())
        return head.data;
        else{
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
    }    
}
public class LL16implementstackinsinglylinkedlist {
  public static void main(String args[]){
     Stack st = new Stack();
     st.push(11);
        st.push(22);
        st.push(33);
        st.push(44);
System.out.println("Top element is " + st.peek());
System.out.println("Removing two elements...");
        st.pop();
        st.pop();
        System.out.println("Top element is " + st.peek());
  }  
}
