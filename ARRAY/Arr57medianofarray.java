import java.util.Arrays;
public class Arr57medianofarray{
    public static double findMedian(int[] arr) {
        Arrays.sort(arr);  
        int n = arr.length;
        int mid = n / 2;
        if (n % 2 == 1) {
            return arr[mid];  
        } else {
            return (arr[mid - 1] + arr[mid]) / 2.0; 
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {90, 100, 78, 89, 67};
        int[] arr2 = {56, 67, 30, 79};
        int[] arr3 = {1, 2};
        System.out.println("Median 1: " + findMedian(arr1)); 
        System.out.println("Median 2: " + findMedian(arr2));  
        System.out.println("Median 3: " + findMedian(arr3));  
    }
}


