public class Str36smallestwindowcontaincharofstringeff {
  public static String smallestWindow(String str,String p){
    int len1=str.length();
    int len2=p.length();
    if(len1<len2)
    return "-1";
    int countP[]=new int[256];
    int countS[]=new int[256];
    for(int i=0;i<len2;i++)
    countP[p.charAt(i)]++;
    int start=0,start_idx=-1,min_len=Integer.MAX_VALUE;
    int count=0;
    for(int j=0;j<len1;j++){
        char currChar=str.charAt(j);
        countS[currChar]++;
        if(countP[currChar]>0 && countS[currChar]<=countP[currChar]){
            count++;
        }
        if(count==len2){
            char startChar;
            while(countS[startChar=str.charAt(start)]>countP[startChar]||countP[startChar]==0){
                if(countS[startChar]>countP[startChar]){
                    countS[startChar]--;
                }
                start++;
            }
            int len=j-start+1;
            if(min_len>len){
                min_len=len;
                start_idx=start;
            }
        }
    }
    if(start_idx==-1)
    return "-1";
    return str.substring(start_idx,start_idx+min_len);
  }  
  public static void main(String args[]){
    String str="timetopractice";
    String p="toc";
    String result=smallestWindow(str,p);
    System.out.println(result);
  }
}
