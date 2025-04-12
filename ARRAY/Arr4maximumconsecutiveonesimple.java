import java.util.Scanner;
public class Arr4maximumconsecutiveonesimple {
   static int maxConsecutiveCount(int[] arr) {
    if (arr.length == 0) return 0; 
    int maxCount = 0, count = 1;
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] == arr[i - 1]) {
            count++;
        } else {
            maxCount = Math.max(maxCount, count);
            count = 1;
        }
    }
    return Math.max(maxCount, count);
}

    public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
    }
    sc.close();
    System.out.println("count maximum 1 : ");
        System.out.println(maxConsecutiveCount(arr));
    }
}

