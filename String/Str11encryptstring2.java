public class Str11encryptstring2 {
  static String convertToHex(int num){
    StringBuilder temp=new StringBuilder();
    while(num!=0){
        int rem=num%16;
        if(rem<10){
            temp.append((char)(rem+'0'));
        }
        else{
            temp.append((char)(rem-10+'a'));
        }
        num=num/16;
    }
    return temp.reverse().toString();
  }  
  static String encryptString(String str){
    StringBuilder ans=new StringBuilder();
    int n=str.length();
    for(int i=0;i<n;i++){
        char ch=str.charAt(i);
        int count=0;
        while(i<n && str.charAt(i)==ch){
            count++;
            i++;
        }
        i--;
        String hex=convertToHex(count);
        ans.append(ch);
        ans.append(hex);
    }
    return ans.reverse().toString();
  }
  public static void main(String args[]){
    String str="abc";
    System.out.println(encryptString(str));
  }
}
