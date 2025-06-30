
public class Arr29subarraythreeequalsumeff {
    static int[] findsplit(int arr[]){
        int res[]=new int[2];
        int n=arr.length;
        int residx=0;
        int total=0;
        for(int i=0;i<n;i++)
        total+=arr[i];
        if(total%3!=0){
            res[0]=-1;
            res[1]=-1;
            return res;
        }
        int currsum=0;
        for(int i=0;i<n;i++){
            currsum+=arr[i];
            if(currsum==total/3){
                currsum=0;
                res[residx++]=i;
                if(residx==2&&i<n-1){
                    return res;
                }
            }
        }
        res[0]=-1;
        res[1]=-1;
        return res;
    }
    public static void main(String args[]){
        int arr[]={1,3,4,0,4};
        int res[]=findsplit(arr);
        System.out.println(res[0]+" "+res[1]);
}
}