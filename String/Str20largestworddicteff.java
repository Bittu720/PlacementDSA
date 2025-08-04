public class Str20largestworddicteff {
   public static boolean isSubsequence(String s1,String s2){
    int m=s1.length(),n=s2.length();
    int j=0;
    for(int i=0;i<n&& j<m;i++){
        if(s1.charAt(j)==s2.charAt(i)){
            j++;
        }
    }
    return j==m;
   } 
   public static String longestWord(String dict[],String str){
    String result="";
    int length=0;
    for(String word:dict){
        if(word.length()>length && isSubsequence(word,str)){
            result=word;
            length=word.length();
        }
    }
    return result;
   }
   public static void main(String args[]){
    String dict[]={"pintu","geeksfor","geeksgeeks","forgeek"};
    String str="geeksforgeeks";
    System.out.println(longestWord(dict,str));
   }
}
