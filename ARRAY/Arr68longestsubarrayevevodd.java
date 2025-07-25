public class Arr68longestsubarrayevevodd {
  static int LongestOddEvenSubArray(int arr[],int n){
    int count=1;
    int ans=1;
    for(int i=1;i<n;i++){
        if((arr[i]%2==0 && arr[i-1]%2==0)||(arr[i]%2!=0 && arr[i-1]%2!=0)){
            count=count+1;
            ans=Math.max(ans,count);
        }
        else
            count=1;
    }
    return ans;
  }  
  public static void main(String args[]){
    int arr[]={2,5,7,2,4,6,8,3};
    int n=arr.length;
    System.out.println(LongestOddEvenSubArray(arr,n));
  }
}
