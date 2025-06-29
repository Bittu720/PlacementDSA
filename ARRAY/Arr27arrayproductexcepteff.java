import java.util.Arrays;

public class Arr27arrayproductexcepteff {
 static int[] productArray(int arr[]){
    int zero=0,idx=-1,product=1;
    int n=arr.length;
    for(int i=0;i<n;i++){
        if(arr[i]==0){
            zero++;
            idx=i;
        }
        else{
            product*=arr[i];
        }
    }
    int res[]=new int[n];
    Arrays.fill(res,0);
    if(zero==0){
        for(int i=0;i<n;i++)
        res[i]=product/arr[i];
    }
    else if(zero==1)
    res[idx]=product;
    return res;
 }  
 public static void main(String[] args) {
        int[] arr = {10, 3, 5, 6, 2};
        int[] res = productArray(arr);

        for (int val : res)
            System.out.print(val + " ");
    }
}
