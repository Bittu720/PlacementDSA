public class Arr59maxindexofarray {
  static int maxIndexdiff(int arr[]){
    int n=arr.length;
    int[] Lmin=new int[n];
    int[] Rmax=new int[n];
    Lmin[0]=arr[0];
    for(int i=1;i<n;i++){
        Lmin[i]=Math.min(arr[i],Lmin[i-1]);
    }
    Rmax[n-1]=arr[n-1];
    for(int j=n-2;j>=0;j--){
        Rmax[j]=Math.max(arr[j],Rmax[j+1]);
    }
    int i=0,j=0,maxDiff=-1;
    while(i<n && j<n){
        if(Lmin[i]<Rmax[j]){
            maxDiff=Math.max(maxDiff,j-i);
            j++;
        }
        else{
            i++;
        }
    }
    return maxDiff;
  }  
  public static void main(String args[]){
    int arr1[]={1,10};
    int arr2[]={34,8,10,3,2,80,30,33,1};
    System.out.println(maxIndexdiff(arr1));
    System.out.println(maxIndexdiff(arr2));
  }
}
