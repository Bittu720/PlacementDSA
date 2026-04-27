public class Str21countsubstring012equaleff {
   public static int countSubstring(String str){
    int n=str.length(),cnt=0;
    int OFFSET=100;
    int freq[][]=new int[OFFSET*2+1][OFFSET*2+1];
    int z=0,o=0,t=0;
    freq[OFFSET][OFFSET]=1;
 for(int i=0;i<n;i++){
    if(str.charAt(i)=='0')
    z++;
    else if(str.charAt(i)=='1')
    o++;
    else if(str.charAt(i)=='2')
    t++;
    int x=z-o+OFFSET;
int y=z-t+OFFSET;
cnt+=freq[x][y];
freq[x][y]++;
 }
 return cnt;
   } 
   public static void main(String[] args) {
    String str = "102100211";
    System.out.println(countSubstring(str));  
}
}
