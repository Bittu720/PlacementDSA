import java.util.ArrayList;
public class Arraylist2reversearr {
   public static void main(String args[]){
    ArrayList<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);

         for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
         }
         System.out.println();
   } 
}
