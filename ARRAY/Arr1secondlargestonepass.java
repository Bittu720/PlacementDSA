import java.util.Scanner;

public class Arr1secondlargestonepass {
    static int getSecondLargest(int arr[],int n) {
        int largest = -1, secondLargest = -1;
        for (int i = 0; i < n; i++) {
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
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
        System.out.println(getSecondLargest(arr,n));
    }
}
 

