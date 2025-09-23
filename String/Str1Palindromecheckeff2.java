import java.util.Scanner;

public class Str1palindromecheckeff2 {
    static int palindrome(String str){
        int len=str.length();
        for(int i=0;i<len/2;i++){
            if(str.charAt(i)!=str.charAt(len-i-1))
            return 0;
        }
        return 1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter string :");
        String str=sc.nextLine();
        sc.close();
        System.out.println(palindrome(str));
    }
}
