import java.util.Scanner;

public class math5allperfectsquareinrange {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter  first number : ");
        int start=sc.nextInt();
        System.out.print("Enter second number : ");
        int end=sc.nextInt();
        sc.close();
       
        System.out.println("Perfect square numbers between "+start+" and "+end+" are : ");
        for(int i=start;i<=end;i++){
            int sqrt=(int)Math.sqrt(i);
            if(sqrt*sqrt==i){
                System.out.print(i+" ");
            }
        }
    }
}
