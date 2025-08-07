public class Str24addtwobinarystring {
  static String trimleadingzeroes(String str){
    int firstone=str.indexOf('1');
    return (firstone==-1)?"0":str.substring(firstone);
  } 
  static String addBinary(String str1,String str2){
    str1=trimleadingzeroes(str1);
    str2=trimleadingzeroes(str2);
    int n=str1.length();
    int m=str2.length();
    if(n<m){
        return addBinary(str2,str1);
    }
    int j=m-1;
    int carry=0;
    StringBuilder result=new StringBuilder();
    for(int i=n-1;i>=0;i--){
        int bit1=str1.charAt(i)-'0';
        int sum=bit1+carry;
        if(j>=0){
            int bit2=str2.charAt(j)-'0';
            sum+=bit2;
            j--;
        }
        int bit=sum%2;
        carry=sum/2;
        result.append((char)(bit+'0'));
    }
    if(carry>0)
    result.append('1');
    return result.reverse().toString();
  } 
  public static void main(String args[]){
    String str1="1101";
    String str2="111";
    System.out.println(addBinary(str1,str2));
  }
}