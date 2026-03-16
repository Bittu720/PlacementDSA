import java.util.*;
public class Fu2Sum {
    public static void CalculateSum(int a,int b){
        int sum=a+b;
        System.out.println("Sum = "+sum);
    }
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
sc.close();
CalculateSum(a,b);
    }
}
