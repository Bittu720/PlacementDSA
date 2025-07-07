public class Arr49minCandydistributeeff {
   static int minCandy(int arr[]){
    int n=arr.length;
    int total=n;
    int i=1;
    while(i<n){
        if(arr[i]==arr[i-1]){
            i++;
            continue;
        }
        int peak=0;
        while(i<n && arr[i]>arr[i-1]){
            peak++;
            total+=peak;
            i++;
        }
        if(i==n){
            return total;
        }
        int dist=0;
        while(i<n && arr[i]<arr[i-1]){
            dist++;
            total+=dist;
            i++;
        }
        total-=Math.min(peak,dist);
    }
    return total;
   } 
   public static void main(String[] args)
    {
        int[] arr = { 15, 40, 32, 12, 17, 23 };
        System.out.println(minCandy(arr));
    }
}
