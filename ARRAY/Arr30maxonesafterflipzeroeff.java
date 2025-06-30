public class Arr30maxonesafterflipzeroeff {
   static int maxones(int arr[],int k){
    int res=0;
    int start=0,end=0;
    int count=0;
    while(end<arr.length){
        if(arr[end]==0)
        count++;
        while(count>k){
            if(arr[start]==0)
            count--;
            start++;
        }
        res=Math.max(res,(end-start+1));
        end++;
    }
    return res;
   }
   public static void main(String args[]){
    int arr[]={1,0,0,1,1,0,1,0,1,1,1};
    int k=2;
    System.out.println(maxones(arr,k));
   }
}
