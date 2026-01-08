import java.util.Scanner;
public class Math3sumofnumwithoutloop {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number : ");
        int n=sc.nextInt();
        sc.close();
        int sum=n*(n+1)/2;
        System.out.println("Sum of first "+ n+ " natural number is : "+sum);
    }
}
