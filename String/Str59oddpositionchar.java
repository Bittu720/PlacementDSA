import java.util.Scanner;

public class Str59oddpositionchar {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str=sc.nextLine();
        sc.close();

        System.out.println("Characters at even positions : ");
        for(int i=0;i<str.length();i+=2){
            System.out.print(str.charAt(i)+" ");
        }
    }
}
