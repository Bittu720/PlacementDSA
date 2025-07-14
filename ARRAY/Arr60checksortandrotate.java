public class Arr60checksortandrotate {
    public static boolean check(int arr[],int n){
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]>arr[(i+1)%n]){
                count++;
            }
        }
        return count<=1;
    }
    public static void main(String args[]){
        int arr[]={3,4,5,1,2};
        int n=arr.length;
        if(check(arr,n))
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}
