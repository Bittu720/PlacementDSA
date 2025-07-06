import java.util.Scanner;
public class Arr46gadgetsearch {
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
int q=sc.nextInt();
for(int i=0;i<q;i++){
int target=sc.nextInt();
int index=-1;
for(int j=0;j<n;j++){
if(arr[j]==target){
index=j;
break;
}
}
System.out.println(index);
} sc.close();
}
}

