public class Arr38swaponetogethereff {
   static int minSwap(int arr[]){
    int one=0;
    int n=arr.length;
    for(int i=0;i<n;i++){
        if(arr[i]==1)
        one++;
    }
    if(one==0)
    return -1;
    int x=one;
    int count=0,maxone;
    for(int i=0;i<x;i++){
        if(arr[i]==1)
        count++;
    }
    maxone=count;
    for(int i=1;i<=n-x;i++){
        if (arr[i-1]==1)
        count--;
        if(arr[i+x-1]==1)
        count++;
     if(maxone<count)
     maxone=count;
    }
    int zero=x-maxone;
    return zero;
   } 
   public static void main(String args[]){
    int arr[]=new int[]{0,0,1,0,1,1,0,0,1};
    System.out.println(minSwap(arr));
   }
}
