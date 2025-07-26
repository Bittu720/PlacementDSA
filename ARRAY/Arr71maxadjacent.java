public class Arr71maxadjacent {
 static void maxadjacent(int arr[],int n){
    for(int i=0;i<n-1;i++){
        System.out.print(Math.max(arr[i],arr[i+1])+" ");
    }
    System.out.println();
 } 
 public static void main(String args[]){
    int arr[]={1,2,2,3,4,5};
    int n=arr.length;
    maxadjacent(arr,n);
 }  
}
