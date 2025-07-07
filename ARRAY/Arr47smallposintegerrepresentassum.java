import java.util.Arrays;

public class Arr47smallposintegerrepresentassum {
  int findsmallest(int arr[],int n){
    int res=1;
    Arrays.sort(arr);
    for(int i=0;i<n;i++){
        if(arr[i]>res){
            return res;
        }
        else{
            res+=arr[i];
        }
    }
    return res;
  }  
  public static void main(String args[]){
    Arr47smallposintegerrepresentassum obj=new Arr47smallposintegerrepresentassum();
    int arr1[]={1,3,4,5};
    int n1=arr1.length;
    System.out.println(obj.findsmallest(arr1,n1));
    int arr2[] = {1, 2, 6, 10, 11, 15};
        int n2 = arr2.length;
        System.out.println(obj.findsmallest(arr2, n2));
        int arr3[] = {1, 1, 1, 1};
        int n3 = arr3.length;
        System.out.println(obj.findsmallest(arr3, n3));
        int arr4[] = {1, 1, 3, 4};
        int n4 = arr4.length;
        System.out.println(obj.findsmallest(arr4, n4));
 
  }
}
