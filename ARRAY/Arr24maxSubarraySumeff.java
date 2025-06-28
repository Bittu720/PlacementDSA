public class Arr24maxSubarraySumeff {
  static int maxsubArraySum(int arr[]){
    int res=arr[0];
    int maxend=arr[0];
    for(int i=1;i<arr.length;i++){
        maxend=Math.max(maxend+arr[i],arr[i]);
        res=Math.max(res,maxend);
    }
    return res;
  } 
  public static void main(String args[]){
    int arr[]={2,3,-8,7,-1,2,3};
    System.out.println(maxsubArraySum(arr));
  }
}
