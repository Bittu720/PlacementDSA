public class Arr12removealloccure {
    static int remoelement(int arr[],int element){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=element){
                arr[count]=arr[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        int arr[]={0,1,3,5,2,2,4,2};
        int element=2;
        System.out.println(remoelement(arr,element));
    }
}

