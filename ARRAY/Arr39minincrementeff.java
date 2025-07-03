import java.util.Arrays;
public class Arr39minincrementeff {
  public static int minOperation(int arr[]){
    int n=arr.length;
    int sum=0;
    int minVal=Arrays.stream(arr).min().getAsInt();
    for(int i=0;i<n;i++){
        sum+=arr[i];
    }
    return sum-n*minVal;
  }  
  public static void main(String args[]){
    int arr[]={4,3,4};
    System.out.println(minOperation(arr));
  }
}
