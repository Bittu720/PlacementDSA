public class Arr33intersectionoftwolist {
  static void printInterval(int arr1[][],int arr2[][]){
    int i=0,j=0;
    int n=arr1.length,m=arr2.length;
    while(i<n && j<m){
        int left=Math.max(arr1[i][0],arr2[j][0]);
        int right=Math.min(arr1[i][1],arr2[j][1]);
        if(left<=right)
        System.out.println("["+left+","+right+"]");
        if(arr1[i][1] < arr2[j][1])
        i++;
        else
        j++;
    }
  }  
  public static void main(String args[]){
    int arr1[][]={{0,4},{5,10},
    {13,20},{24,25}};
    int arr2[][] = { { 1, 5 }, { 8, 12 }, 
                     { 15, 24 }, { 25, 26 } };

    printInterval(arr1, arr2);
  }
}
