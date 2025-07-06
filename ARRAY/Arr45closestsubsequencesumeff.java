import java.util.Arrays;
public class Arr45closestsubsequencesumeff {
  static int[] generateSum(int arr[],int start,int end){
    int n=end-start;
    int total=1<<n;
    int sumT[]=new int[total];
    for(int i=0;i<total;i++){
        int sum=0;
        for(int j=0;j<n;j++){
            if((i&(1<<j))!=0){
                sum+=arr[start+j];
            }
        }
        sumT[i]=sum;
    }
    return sumT;
  } 
  public static int MinAbsDifference(int arr[],int goal){
    int n=arr.length;
    int leftsum[]=generateSum(arr,0,n/2);
    int rightsum[]=generateSum(arr,n/2,n);
    Arrays.sort(rightsum);
    int minDiff=Math.abs(goal);
    for(int i=0;i<leftsum.length;i++){
        int remaining=goal-leftsum[i];
        int pos=Arrays.binarySearch(rightsum,remaining);
        if(pos>=0){
            return 0;
        }
        else{
            pos=-pos-1;
        }
        if(pos<rightsum.length){
            minDiff=Math.min(minDiff,Math.abs(remaining-rightsum[pos]));
        }
        if(pos>0){
            minDiff=Math.min(minDiff,Math.abs(remaining-rightsum[pos-1]));
        }
    }
    return minDiff;
  } 
  public static void main(String args[]){
    int arr[]={5,-7,3,5};
    int target=6;
    System.out.println(MinAbsDifference(arr,target));
  }
}
