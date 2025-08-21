public class Str44editdistance {
  static int editDistance(String s1,String s2){
    int m=s1.length();
    int n=s2.length();
    int prev[]=new int[n+1];
    int curr[]=new int[n+1];
    for(int j=0;j<=n;j++)
    prev[j]=j;
    for(int i=1;i<=m;i++){
        curr[0]=i;
        for(int j=1;j<=n;j++){
            if(s1.charAt(i-1)==s2.charAt(j-1))
            curr[j]=prev[j-1];
            else
            curr[j]=1+Math.min(Math.min(curr[j-1],prev[j]),prev[j-1]);
        }
        prev=curr.clone();
    }
    return prev[n];
  }  
  
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "bcfe";

        System.out.println(editDistance(s1, s2));
    }
}
