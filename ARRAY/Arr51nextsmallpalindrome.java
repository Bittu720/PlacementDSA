public class Arr51nextsmallpalindrome {
   static int isPalindrome(int num){
    int n,k,rev=0;
    n=num;
    while(num!=0){
        k=num%10;
        rev=(rev*10)+k;
        num=num/10;
    }
    if(n==rev){
        return 1;
    }
    else{
        return 0;
           }
   } 
   public static void main(String args[]){
    int num=1220;
    while(isPalindrome(num)==0){
        num=num+1;
    }
    System.out.print("Next Palindrome :");
    System.out.print(num);
   }
}
