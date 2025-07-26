public class Arr70equilibrium {
  static int equilibrium(int arr[]){
    int presum=0,total=0;
    for(int i=0;i<arr.length;i++){
        total+=arr[i];
    }
    for(int p=0;p<arr.length;p++){
        int suffsum=total-presum-arr[p];
        if(presum==suffsum){
            return p;
        }
        presum+=arr[p];
    }
    return -1;
  }  
  public static void main(String args[]){
    int arr[]={1,7,3,6,5,6};
    System.out.println(equilibrium(arr));
  }
}
