public class Arr36longestmountaineff {
   public static int longestmountain(int arr[]){
    int i=0,j=-1,k=-1,d=0;
    if(arr.length<3)
    return 0;
    for(i=0;i<arr.length-1;i++){
        if(arr[i+1]>arr[i]){
            if(k!=-1){
                k=-1;
                j=-1;
            }
            if(j==-1)
            j=i;
        }
        else{
            if(arr[i+1]<arr[i]){
                if(j!=-1)
                k=i+1;
                if(k!=-1 && j!=-1){
                    if(d<k-j+1)
                    d=k-j+1;
                }
            }
            else {
                k=-1;
                j=-1;
            }
        }
    }
    if(k!=-1 && j!=-1){
        if(d<k-j+1)
        d=k-j+1;
    }
    return d;
   } 
   public static void main(String[] args)
   {
       int arr[] = { 1, 3, 1, 4, 5, 6, 7, 8, 9, 8, 7, 6, 5 };

       System.out.println(longestmountain(arr));
   }
}
