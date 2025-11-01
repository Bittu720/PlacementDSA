import java.util.*;
class Node{
    int data;
    Node next;
    Node(int value){
        data=value;
        next=null;
    }
}
public class LL29findpairwithsumindoublylinkedlistnaive {
  static ArrayList<ArrayList<Integer>>
  findPairwithGivenSum(int target,Node head){
    ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
    HashSet<Integer>visited=new HashSet<>();
    Node currNode=head;
    while(currNode!=null){
        int x=target-currNode.data;
        if(visited.contains(x)){
            ArrayList<Integer>pair=new ArrayList<>();
            pair.add(x);
            pair.add(currNode.data);
            ans.add(pair);
        }
        visited.add(currNode.data);
        currNode=currNode.next;
    }
    Collections.sort(ans,(a,b)->a.get(0).compareTo(b.get(0)));
    return ans;
  }  
   public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);

        int target = 7;
        ArrayList<ArrayList<Integer> > pairs
            = findPairwithGivenSum(target, head);

        if (pairs.isEmpty()) {
            System.out.println("No pairs found.");
        }
        else {
            for (ArrayList<Integer> pair : pairs) {
                System.out.println(pair.get(0) + " "
                                   + pair.get(1));
            }
        }
    }
}
