public class Str30mininserttoformpalindrome {
   static int minRec(String s,int l,int h){
    if(l>=h)
    return 0;
    if(s.charAt(l)==s.charAt(h)){
        return minRec(s,l+1,h-1);
    }
    return Math.min(minRec(s,l+1,h),minRec(s,l,h-1))+1;
   } 
   static int findMinInsert(String s){
    return minRec(s,0,s.length()-1);
   }
   public static void main(String args[]){
    String s="geeks";
    System.out.println(findMinInsert(s));
   }
}
