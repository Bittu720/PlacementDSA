public class Str4rotatestringeff {
   static boolean Rotations(String s1,String s2){
    if(s1.length()!=s2.length()){
        return false;
    }
    String combined=s1+s1;
    return combined.contains(s2);
   }
   public static void main(String args[]){
    String s1="aab";
    String s2="aba";
    System.out.println(Rotations(s1,s2));
   }
}
