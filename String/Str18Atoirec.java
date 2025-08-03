public class Str18Atoirec {
  static int myAtoi(String str,int n){
    if(str==""||!str.matches("^\\d*$")){
        return 0;
    }
    if(n==1){
        return str.charAt(0)-'0';
    }
    return (10*myAtoi(str,n-1)+str.charAt(n-1)-'0');
  }
  public static void main(String args[]){
    String str="112";
    int n=str.length();
    System.out.println(myAtoi(str,n));
  }  
}
