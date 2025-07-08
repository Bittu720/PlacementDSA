public class Arr52maxsumallrotateeff {
    static int maxSum(int arr[]){
        int n=arr.length;
        int currSum=0;
        for(int i=0;i<n;i++)
        currSum+=arr[i];
        int currval=0;
        for(int i=0;i<n;i++)
        currval+=i*arr[i];
        int res=currval;
        for(int i=1;i<n;i++){
            int nextval=currval-(currSum-arr[i-1])+arr[i-1]*(n-1);
            currval=nextval;
            res=Math.max(res,nextval);
        }
        return res;
    }
    public static void main(String args[]){
        int arr[]={8,3,1,2};
        System.out.println(maxSum(arr));
    }
}
