public class Arr79maxdiffinorder {
    public static void main(String args[]){
        int arr[]={4,3,10,2,9,1};
        int min=arr[0];
        int maxdiff=arr[1]-arr[0];

        for(int i=1;i<arr.length;i++){
       if(arr[i]-min>maxdiff){
        maxdiff=arr[i]-min;
       }
       if(arr[i]<min){
        min=arr[i];

       }
        }
        System.out.println("Maximum differnce (order matters) : "+maxdiff);
    }
}
