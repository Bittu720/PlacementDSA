public class Arr63rearrangearrextraspace {
    void Rearrange(int arr[],int n){
        for(int i=0;i<n;i++)
        arr[i]+=(arr[arr[i]]%n)*n;
        for(int i=0;i<n;i++)
        arr[i]/=n;
    }
    void PrintArr(int arr[],int n){
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        System.out.println("");
    }
    public static void main(String args[]){
        Arr63rearrangearrextraspace Rearrange=new Arr63rearrangearrextraspace();
        int arr[]={3,2,0,1};
        int n=arr.length;
        System.out.println("Array is : ");
        Rearrange.PrintArr(arr,n);
        Rearrange.Rearrange(arr,n);
        System.out.println("Modified array is :");
        Rearrange.PrintArr(arr,n);
    }
}
