public class Str16mindelstrpalindromeeff {
    static int minDeletion(String str){
        int n=str.length();
        int prev1[]=new int[n];
        int curr[]=new int[n];
        int prev2[]=new int[n];
        for(int l=2;l<=n;l++){
            for(int i=n-l;i>=0;i--){
                int j=i+l-1;
                if(l==2){
                    curr[i]=(str.charAt(i)==str.charAt(j))?0:1;
                }
                else{
                    if (str.charAt(i) == str.charAt(j)) {
                        curr[i] = prev2[i + 1];
                }
                else{
                    curr[i]=1+Math.min(prev1[i],prev1[i+1]);
                }
            }
        }
        prev2=prev1.clone();
        prev1=curr.clone();
    }
    return prev1[0];
}
public static void main(String args[]){
    String str="aebcbda";
    System.out.println(minDeletion(str));
}
}
