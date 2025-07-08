public class Arr50countsubarrayexactkditicteff {
   static int atMostK(int arr[],int k){
    int n=arr.length;
    int res=0;
    int[] freq=new int[101];
    int left=0;
    int distinct=0;
    for(int right=0;right<n;right++){
        if(freq[arr[right]]==0){
            distinct++;
                }
        freq[arr[right]]++;
        while(distinct>k){
            freq[arr[left]]--;
            if(freq[arr[left]]==0){
                distinct--;
            }
            left++;
        } 
        res+=(right-left+1);       
    }
    return res;
   } 
   static int exactlyK(int arr[],int k){
    return atMostK(arr,k)-atMostK(arr,k-1);
   }
   public static void main(String args[]){
    int arr[]={1,2,2,3};
    int k=2;
    System.out.println(exactlyK(arr,k));
   }
}
