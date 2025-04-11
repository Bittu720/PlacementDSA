import java.util.Scanner;
public class leftmostnonrepbetter {
   static final int CHAR=256;
   static  int nonrep(String str){
    int count[]=new int [CHAR];
    for(int i=0;i<str.length();i++){
        count[str.charAt(i)]++;
    }
    for(int i=0;i<str.length();i++){
        if(count[str.charAt(i)]==1)
        return i;
    }
    return -1;
   }
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter string : ");
    String str=sc.nextLine();
    sc.close();
    System.out.print("index of left most repeating character:");
    System.out.print(nonrep(str));
 } 
}
