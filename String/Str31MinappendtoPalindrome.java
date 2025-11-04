public class Str31minappendtoPalindrome {
  static boolean isPalindrome(String s){
    int left=0,right=s.length()-1;
    while(left<right){
        if(s.charAt(left)!=s.charAt(right))
        return false;
        left++;
        right--;
    }
    return true;
  } 
  static int noOfappend(String s){
    int n=s.length();
    for(int i=0;i<n;i++){
        if(isPalindrome(s.substring(i))){
            return i;
        }
    }
    return n-1;
  } 
  public static void main(String args[]){
    String s="abede";
    int result=noOfappend(s);
    System.out.println(result);
  }
}

