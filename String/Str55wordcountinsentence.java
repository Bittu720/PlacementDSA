import java.util.*;
public class Str55wordcountinsentence {
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print(" Enter sentence : ");
    String str=sc.nextLine();
    sc.close();
    int count=1;
    for(int i=0;i<str.length()-1;i++){
        if((str.charAt(i)==' ') && (str.charAt(i+1)!=' ')){
            count++;
        }
    }
    System.out.println("total words : "+count);
   } 
}
