public class Arr37sortarrayuseequationeff {
 static void sortArray(int arr[],int n,int a,int b,int c){
    for(int i=0;i<n;i++)
    arr[i]=a*arr[i]*arr[i]+b*arr[i]+c;
    int index=-1;
    int maximum=-999999;
    for(int i=0;i<n;i++){
        if(maximum<arr[i]){
            index=i;
            maximum=arr[i];
        }
    }
    int i=0,j=n-1;
    int newarr[]=new int[n];
    int k=0;
    while(i<index && j>index){
        if(arr[i]<arr[j])
        newarr[k++]=arr[i++];
        else
        newarr[k++]=arr[j--];
    }
    while(i<index)
    newarr[k++]=arr[i++];
    while(j>index)
    newarr[k++]=arr[j--];
    newarr[n-1]=maximum;
    for(int p=0;p<n;p++)
    arr[p]=newarr[p];
 } 
 public static void main (String[] args) 
 {
     int arr[] = {-21 ,-15, 12, 13, 14 };
     int n = arr.length;
     int a = -6, b =-7, c = 2;
   
     sortArray(arr, n, a, b, c);
   
     System.out.println("Array after sorting is : ");
     for (int i=0; i<n; i++)
        System.out.print(arr[i]+" ");
 } 
}
