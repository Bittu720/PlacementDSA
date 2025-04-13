import java.util.Scanner;
import java.util.Arrays;
public class Arr6reverse {
        static void reverse(int arr[], int n) {
            int low = 0, high = n - 1;
            while (low < high) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of elements: ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            sc.close();
            System.out.println("Before Reverse: " + Arrays.toString(arr));
            reverse(arr, n);
            System.out.println("After Reverse: " + Arrays.toString(arr));
        }
    } 

