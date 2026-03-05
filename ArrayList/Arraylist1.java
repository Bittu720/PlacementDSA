import java.util.ArrayList;
public class Arraylist1 {
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
       // ArrayList<String> list2=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(11);
        list.add(7);
        list.add(9);

         System.out.println(list.size());

         
        System.out.println(list);


       int element= list.get(2);
       System.out.println(element);

       list.remove(2);
       System.out.println(list);

       list.set(2,5);
       System.out.println(list);

       System.out.println(list.contains(9));
        }
}
