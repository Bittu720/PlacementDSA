public class Str18writeAtoi1 {
 static int myAtoi(String str){
    int sign=1,res=0,idx=0;
    while (idx<str.length() && str.charAt(idx)==' '){
        idx++;
    } 
    if(idx<str.length() && (str.charAt(idx)=='-'||str.charAt(idx)=='+')){
        if(str.charAt(idx++)=='-'){
            sign=-1;
        }
    }
    while(idx<str.length() && str.charAt(idx)>='0'&& str.charAt(idx)<='9'){
      if(res>Integer.MAX_VALUE/10||(res==Integer.MAX_VALUE/10 && str.charAt(idx)-'0'>7)){
       return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE; 
      }  
      res=10*res+(str.charAt(idx++)-'0');
    }
    return res*sign;
 } 
 public static void main(String args[]){
    String str="-0012g4";
    System.out.println(myAtoi(str));
 }  
}
