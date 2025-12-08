import java.util.*;

public class HashMap2Iteration {
 
 public static void main(String args[]){
    HashMap<String,Integer> hm =new HashMap<>();
    hm.put("India",100);
    hm.put("China",96);
    hm.put("US",50);
    hm.put("Indonasia",45);
    hm.put("Nepal",25);

    Set<String> keys=hm.keySet();
    System.out.println(keys);

    for(String k:keys){
    System.out.println("keys : "+k+",value="+hm.get(k));
    
    }
 }   
}
