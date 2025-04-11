import java.util.Arrays;
import java.util.Scanner;
public class Arr3threegreatcandibetter {
    static int maxProduct(int arr[],int n) {
        Arrays.sort(arr);
        return Math.max(arr[0] * arr[1] * arr[n - 1],
                        arr[n - 1] * arr[n - 2] * arr[n - 3]);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.print("enter size of array : ");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.print("enter element in array : ");
    for(int i=0;i<n;i++){
   arr[i]=sc.nextInt();
    }
    sc.close();
        int max = maxProduct(arr,n);
        System.out.println(max);
    }
}

