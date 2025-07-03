public class Arr40countIndiceseff {
   public static int countIndex(int arr[]){
    int n=arr.length;
    if(n==1)
    return 1;
    if(n==2)
    return 0;
    int evensum=0;
    int oddsum=0;
    int res=0;
    for(int i=0;i<n;i++){
        if(i%2==1)
        oddsum+=arr[i];
        else
        evensum+=arr[i];
    }
    int curreven=0;
    int currodd=0;
    for(int i=0;i<n;i++){
        if(i%2==1)
        currodd+=arr[i];
        else
        curreven+=arr[i];
        int EvenSum=curreven+oddsum-currodd;
        int OddSum=currodd+evensum-curreven-arr[i];
        if(EvenSum==OddSum)
        res++;
    }
    return res;
   } 
   public static void main(String[] args) {
    int arr[] = { 1, 1, 1 };
    System.out.println(countIndex(arr));
}
}
