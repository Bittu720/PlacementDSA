import java.util.*;
public class HashMap10TreeSet {
 
 public static void main(String args[]){
   HashSet<String> cities = new HashSet<>();
   cities.add("Delhi");
   cities.add("Mumbai");
   cities.add("Noida");
   cities.add("Benguluru");
   
   System.out.println(cities);

   LinkedHashSet<String> lhs =new LinkedHashSet<>();
   lhs.add("Delhi");
   lhs.add("Mumbai");
   lhs.add("Noida");
   lhs.add("Benguluru");

   System.out.println(lhs);

   lhs.remove("Delhi");
   System.out.println(lhs);

   TreeSet<String>ts=new TreeSet<>();
   ts.add("Delhi");
   ts.add("Mumbai");
   ts.add("Noida");
   ts.add("Benguluru");
   System.out.println(ts);
 }   
}