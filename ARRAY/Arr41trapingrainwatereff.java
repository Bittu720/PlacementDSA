public class Arr41trapingrainwatereff {
   static int MaxWater(int arr[]){
    int left=1;
    int right=arr.length-2;
    int leftmax=arr[left-1];
    int rightmax=arr[right+1];
    int res=0;
    while(left<=right){
        if(rightmax<=leftmax){
            res+=Math.max(0,rightmax-arr[right]);
            rightmax=Math.max(rightmax,arr[right]);
            right-=1;
        }
        else{
            res+=Math.max(0,leftmax-arr[left]);
            leftmax=Math.max(leftmax,arr[left]);
            left+=1;
        }
    }
    return res;
   } 
   public static void main(String args[]){
    int arr[]={2,1,5,3,1,0,4};
    System.out.println(MaxWater(arr));
   }
}
