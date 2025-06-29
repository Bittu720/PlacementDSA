public class Arr26maxproductsubarrayeff {
  static int max(int a,int b,int c){
    return Math.max(a,Math.max(b,c));
  }  
  static int min(int a,int b,int c){
    return Math.min(a,Math.min(b,c));
  }
  static int maxProduct(int arr[])
{
    int n=arr.length;
    int currmax=arr[0];
    int currmin=arr[0];
    int maxprod=arr[0];
    for(int i=1;i<n;i++){
        int temp=max(arr[i],arr[i]*currmax,arr[i]*currmin);
        currmin=min(arr[i],arr[i]*currmax,arr[i]*currmin);
        currmax=temp;
        maxprod=Math.max(maxprod,currmax);
    }
return maxprod;
}
public static void main(String args[]){
    int arr[]={-2,6,-3,-10,0,2};
    System.out.println(maxProduct(arr));
}
}
