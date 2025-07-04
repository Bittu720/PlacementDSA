public class Arr42maxcircularsubarraysumeff {
   static int circularsubarraySum(int arr[]){
    int totalSum=0;
    int currmaxsum=0,currminsum=0;
    int maxsum=arr[0],minsum=arr[0];
    for(int i=0;i<arr.length;i++){
        currmaxsum=Math.max(currmaxsum+arr[i],arr[i]);
        maxsum=Math.max(maxsum,currmaxsum);
        currminsum=Math.min(minsum,currminsum);
        totalSum += arr[i];
    }
    int sum=maxsum;
    int circularsum=totalSum-minsum;
    if(minsum==totalSum)
    return sum;
    return Math.max(sum,circularsum);
   } 
   public static void main(String args[]){
    int arr[]={8,-8,9,-9,10,-11,12};
    System.out.println(circularsubarraySum(arr));
   }
}
