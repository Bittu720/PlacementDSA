import java.util.ArrayList;
import java.util.Collections;

public class Arraylist5Sorting {

    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
       int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }

 public static void main(String args[]){
ArrayList<Integer> list =new ArrayList<>();
        list.add(2);
        list.add(8);
        list.add(10);
        list.add(4);
        list.add(6);

        System.out.println(list);
   Collections.sort(list);
   System.out.println(list);

   Collections.sort(list,Collections.reverseOrder());
   System.out.println(list);
 }   
}
