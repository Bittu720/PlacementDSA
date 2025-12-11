import java.util.*;
public class HashMap8hashSetiteration {
  
 public static void main(String args[]){
    HashSet<String> cities= new HashSet<>();
    cities.add("Delhi");
    cities.add("Mumbai");
    cities.add("Noida");
    cities.add("Bebguluru");

    Iterator it=cities.iterator();
    while(it.hasNext()){
        System.out.println(it.next());
    }
 }   
}