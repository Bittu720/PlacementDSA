public class Arr78maxdiffanyorder {
   public static void main(String args[]){
    int arr[]={4,10,2,9,1};
    int max=arr[0];
    int min=arr[0];
    for(int i=1;i<arr.length;i++){
        if(arr[i]>max)
        max=arr[i];
        if(arr[i]<min)
        min=arr[i];
    }
    int diff=max-min;
    System.out.println("Maximum diffrence(any order):"+diff);
   } 
}
