import java.util.*;
public class HashMap7hashSetoperation {
  
 public static void main(String args[]){
  HashSet<Integer>set=new HashSet<>();

  set.add(1);
  set.add(2);
  set.add(4);
  set.add(2);
  set.add(1);

  System.out.println(set);
  System.out.println(set.size());
 // set.clear();

  set.remove(2);  
  if(set.contains(2)){
    System.out.println("set contains");
  }
  if(set.contains(4)){
    System.out.println("set contains 4");
  }
 }   
}
