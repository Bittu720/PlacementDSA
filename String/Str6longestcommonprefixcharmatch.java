public class Str6longestcommonprefixcharmatch {
   static String longestcommonprefix(String arr[]){
    int minlen=arr[0].length();
    for(int i=1;i<arr.length;i++){
        if(arr[i].length()<minlen){
            minlen=arr[i].length();
        }
    }
    StringBuilder res=new StringBuilder();
    for(int i=0;i<minlen;i++){
        char ch=arr[0].charAt(i);
        for(int j=1;j<arr.length;j++){
            if(arr[j].charAt(i)!=ch){
                return res.toString();
            }
        }
        res.append(ch);
    }
    return res.toString();
   }
   public static void main(String args[]){
    String arr[]={"geeksfor","geeks","geek","geezer"};
    System.out.println(longestcommonprefix(arr));
   } 
}
