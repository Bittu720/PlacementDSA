public class Arr21majorityelementeffp2 {
  static void findmajority(int arr[]){
    int n=arr.length;
    int element1=-1,element2=-1;
    int count1=0,count2=0;
    for(int ele:arr){
        if(element1==ele){
            count1++;
        }
        else if(element2==ele){
            count2++;
        }
        else if(count1==0){
            element1=ele;
            count1++;
        }
        else if(count2==0){
            element2=ele;
            count2++;
        }
        else{
            count1--;
            count2--;
        }
    }
    count1=0;
    count2=0;
    for(int ele:arr){
        if(element1==ele)
        count1++;
        if(element2==ele)
        count2++;
    }
    if (count1 > n / 3) {
        System.out.print(element1 + " ");
    }
    if (count2 > n / 3 && element1 != element2) {
        System.out.print(element2 + " ");
    }
}

public static void main(String[] args) {
    int[] arr = {2, 2, 3, 1, 3, 2, 1, 1};
    findmajority(arr); 
}

  }  

