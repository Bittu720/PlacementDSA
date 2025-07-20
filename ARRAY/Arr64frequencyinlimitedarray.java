import java.util.Arrays;
public class Arr64frequencyinlimitedarray {
    public static int[] countFrequency(int arr[]){
        int n=arr.length;
        int result[]=new int[n];
        for(int i=0;i<n;i++){
            result[arr[i]-1]++;
        }
        return result;
    }
    public static void main(String args[]){
        int arr1[]={2,3,2,3,5};
        int arr2[]={3,3,3,3};
        int arr3[]={1};
        System.out.println(Arrays.toString(countFrequency(arr1)));
        System.out.println(Arrays.toString(countFrequency(arr2)));
        System.out.println(Arrays.toString(countFrequency(arr3)));
    }
}
