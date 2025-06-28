import java.util.Arrays;
public class Arr23maxminheight{
    public static int minHeightdiff(int k,int arr[]){
        int n=arr.length;
        Arrays.sort(arr);
        int tempdiff=arr[n-1]-arr[0];
        if(n==1){
            return 0;
        }
        int mindiff=tempdiff;
        for(int i=1;i<n;i++){
            int newMin=Math.min(arr[0]+k,arr[i]-k);
            int newMax=Math.max(arr[i-1]+k,arr[n-1]-k);
            mindiff=Math.min(mindiff,newMax-newMin);
        }
        return mindiff;
    }
    public static void main(String args[]){
        int arr1[]={1,5,8,10};
        int k1=2;
        System.out.println(minHeightdiff(k1,arr1));
        int arr2[]={3,9,12,16,20};
        int k2=3;
        System.out.println(minHeightdiff(k2,arr2));
    }
}