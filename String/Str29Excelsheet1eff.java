public class Str29Excelsheet1eff {
   static String colName(int n){
    if(n==0)
    return "";
    n--;
    return colName(n/26)+(char)(n%26+'A');
   } 
   public static void main(String args[]){
    int n=702;
    System.out.println(colName(n));
   }
}
