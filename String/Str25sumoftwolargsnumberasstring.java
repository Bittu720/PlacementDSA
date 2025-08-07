public class Str25sumoftwolargsnumberasstring {
    static String findSum(String str1,String str2){
        if(str1.isEmpty())
        return str2;
        if(str2.isEmpty())
        return str1;
        StringBuilder result=new StringBuilder();
        int i=str1.length()-1;
        int j=str2.length()-1;
        int carry=0;
        while(i>=0||j>=0||carry>0){
            int digit1=(i>=0)?str1.charAt(i)-'0':0;
            int digit2=(j>=0)?str2.charAt(j)-'0':0;
            int sum=digit1+digit2+carry;
         carry=sum/10;
         sum%=10;
         result.append((char)('0'+sum));
         i--;
         j--;
        }
        while(result.length()>1 && result.charAt(result.length()-1)=='0'){
            result.deleteCharAt(result.length()-1);
        }
        result.reverse();
        return result.toString();
    }
    public static void main(String args[]){
        String str1="25",str2="23";
        System.out.println(findSum(str1,str2));
    }
}
