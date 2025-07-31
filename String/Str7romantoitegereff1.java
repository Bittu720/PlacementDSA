public class Str7romantoitegereff1 {
  static int value(char r){
    if(r=='I')
    return 1;
    if(r=='V')
    return 5;
    if(r=='X')
    return 10;
    if(r=='L')
    return 50;
    if(r=='C')
    return 100;
    if(r=='D')
    return 500;
    if(r=='M')
    return 1000;
    return -1;
  }
  static int romantoDecimal(String str){
    int res=0;
    for(int i=0;i<str.length();i++){
        int str1=value(str.charAt(i));
        if(i+1<str.length()){
            int str2=value(str.charAt(i+1));
         if(str1>=str2){
            res+=str1;
         }
         else{
            res+=(str2-str1);
            i++;
         }
        }
        else{
            res+=str1;
        }
    }
    return res;
  }
  public static void main(String args[]){
    String str="IX";
    System.out.println(romantoDecimal(str));
  }  
}
