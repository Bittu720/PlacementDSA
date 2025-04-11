import java.util.Scanner;

public class Arr2thirdlargesteffi1 {
    static int thirdlargest(int arr[],int n) {
        int first = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > first) first = arr[i];
        }
        int second = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > second && arr[i] < first) {
                second = arr[i];
            }
        }
        int third = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > third && arr[i] < second) {
                third = arr[i];
            }
        }
        return third;
    }
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
     System.out.println("enter size of array :");
     int n=sc.nextInt();
     int arr[]=new int[n];
     System.out.println("enter number :");
     for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
     }
         sc.close();
         System.out.print("second largest is : ");
        System.out.println(thirdlargest(arr,n));
    }
}
 
