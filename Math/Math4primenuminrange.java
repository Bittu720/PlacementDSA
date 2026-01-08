import java.util.Scanner;
public class Math4primenuminrange {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter  first number : ");
        int start=sc.nextInt();
        System.out.print("Enter second number : ");
        int end=sc.nextInt();
        sc.close();

        System.out.println("prime number between "+start+" and "+end+" are : ");
        for(int i=start;i<=end;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    static boolean isPrime(int n){
        if(n<=1)
        return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
            return false;
        }
        return true;
    }
}
