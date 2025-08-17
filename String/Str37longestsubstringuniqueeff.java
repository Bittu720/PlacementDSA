public class Str37longestsubstringuniqueeff {
static int longestuniquesubstr(String str){
    if(str.length()==0||str.length()==1)
    return str.length();
    int res=0;
    boolean vis[]=new boolean[26];
    int left=0,right=0;
    while(right<str.length()){
        while(vis[str.charAt(right)-'a']==true){
            vis[str.charAt(left)-'a']=false;
            left++;
        }
        vis[str.charAt(right)-'a']=true;
        res=Math.max(res,(right-left+1));
        right++;
    }
    return res;
}
public static void main(String args[]){
    String str="geeksforgeeks";
    System.out.println(longestuniquesubstr(str));
}
}
