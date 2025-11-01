import java.util.ArrayList;

class Node {
    int data;
    Node next, prev;

    Node(int value) {
        data = value;
        next = prev = null;
    }
}
public class LL29findpairwithgivensumeff {
   static ArrayList<ArrayList<Integer> >
    findPairsWithGivenSum(int target, Node head) {
        ArrayList<ArrayList<Integer> > res
            = new ArrayList<>(); 
            Node first = head;
        Node second = head;
        while (second.next != null)
            second = second.next;
             while (first != second && second.next != first) {
 if ((first.data + second.data) == target) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(first.data);
                pair.add(second.data);
                res.add(pair);
     first = first.next;
       second = second.prev;     
}
else {
                if ((first.data + second.data) < target)
                    first = first.next;
                else
                    second = second.prev;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(4);
        head.next.next.prev = head.next;
        head.next.next.next = new Node(5);
        head.next.next.next.prev = head.next.next;
        int target = 7;
        ArrayList<ArrayList<Integer> > pairs
            = findPairsWithGivenSum(target, head);
        if (pairs.isEmpty()) {
            System.out.println("No pairs found.");
        }
        else {
            for (ArrayList<Integer> pair : pairs) {
                System.out.println(pair.get(0)
                                   + " " + pair.get(1));
            }
        }
    }
}
