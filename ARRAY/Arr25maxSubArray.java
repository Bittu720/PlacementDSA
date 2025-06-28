public class Arr25maxSubArray {
   static void maxSubArray(int arr[]){
    int resstart=0,resend=0;
    int currstart=0;
    int maxSum=arr[0];
    int maxend=arr[0];
    for(int i=1;i<arr.length;i++){
        if(maxend+arr[i]<arr[i]){
            maxend=arr[i];
            currstart=i;
        }
        else{
            maxend+=arr[i];
            }
        if(maxend>maxSum){
            maxSum=maxend;
            resstart=currstart;
            resend=i;
        }
   }
   System.out.print("Subarray : ");
   for(int i=resstart;i<=resend;i++){
    System.out.print(arr[i]+" ");
   }
   System.out.println();
}
public static void main(String args[]){
    int arr[]={2,3,-8,7,-1,2,3};
    maxSubArray(arr);
}
}
