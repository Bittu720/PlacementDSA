import java.util.Scanner;
public class Math6printharmonicseries {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value : ");
    int n=sc.nextInt();
    sc.close();
    double sum=0.0;
    for(int i=1;i<=n;i++){
        sum+=1.0/i;
    }
    System.out.println("Sum of harmonic series up to 1/"+n+" is : "+sum);
  }  
}
