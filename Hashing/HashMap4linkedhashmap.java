import java.util.*;

public class HashMap4linkedhashmap {
 
  public static void main(String args[]){
   LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
   lhm.put("India",100);
   lhm.put("china",150);
   lhm.put("russia",200);

   HashMap<String,Integer> hm= new HashMap<>();
   hm.put("India",100);
   hm.put("china",150);
   hm.put("russia",200);

    System.out.println(lhm);
    System.out.println(hm);
  }  
}
