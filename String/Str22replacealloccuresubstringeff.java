public class Str22replacealloccuresubstringeff {
  static int[] LPS(String s1){
    int m=s1.length();
    int lps[]=new int[m];
    int len=0,i=1;
    while(i<m){
        if(s1.charAt(i)==s1.charAt(len)){
            len++;
            lps[i]=len;
            i++;
        }
        else{
            if(len>0){
                len=lps[len-1];
            }
            else{
                lps[i]=0;
                i++;
            }
        }
    }
    return lps;
  }
  static String replacesubStr(String s,String s1,String s2){
    int n=s.length(),m=s1.length();
    int lps[]=LPS(s1);
    StringBuilder ans=new StringBuilder();
    int i=0,j=0,prev=0;
    while(i<n){
        if(s.charAt(i)==s1.charAt(j)){
            i++;
            j++;
        }
        if(j==m){
            ans.append(s2);
            prev=i;
            j=lps[j-1];
        }
        else if(i<n && s.charAt(i)!=s1.charAt(j)){
            if(j>0){
                j=lps[j-1];
            }
            else {
                ans.append(s.charAt(i));
                i++;
            }
        }
    }
    if(prev<n)
    ans.append(s.substring(prev));
    return ans.toString();
  }  
  public static void main(String args[]){
    String s="geeksforgeeks",s1="eek",s2="ok";
    System.out.println(replacesubStr(s,s1,s2));
  }
}
