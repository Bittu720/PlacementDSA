import java.util.*;

public class HashMap1operationhashmap {
  
 public static void main(String args[]){
  HashMap<String,Integer> hm = new HashMap<>();
  hm.put("India",100);
  hm.put("China",50); 
  hm.put("US",150);

  System.out.println(hm);

  int population=hm.get("India");
  System.out.println(population);

  System.out.println(hm.get("Indonasia"));

  System.out.println(hm.containsKey("India"));
  System.out.println(hm.containsKey("Indonasia"));

  System.out.println(hm.remove("China"));
  System.out.println(hm);

  System.out.println(hm.size());

  hm.clear();
  System.out.println(hm.isEmpty());
 }   
}

