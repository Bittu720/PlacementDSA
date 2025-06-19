public class Arr13remoduplicateeff {
    static int remodup(int arr[]){
        int n=arr.length;
        if(n<=1)
        return n;
        int index=1;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]){
                arr[index++]=arr[i];
            }
        }
        return index;
    }
    public static void main(String args[]){
        int arr[]={1,2,2,3,4,4,4,5,5};
        int newSize=remodup(arr);
        for(int i=0;i<newSize;i++){
            System.out.print(arr[i]+" ");
        }
     }  
}
