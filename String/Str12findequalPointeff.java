public class Str12findequalPointeff {
 public static int findeqlPoint(String str){
    int n=str.length(),openCnt=0,closeCnt=0;
    for(int i=0;i<n;i++){
        if(str.charAt(i)==')');
        closeCnt++;
    }
    for(int i=0;i<n;i++){
        if(openCnt==closeCnt)
        return i;
        if(str.charAt(i)=='(')
        openCnt++;
        if(str.charAt(i)==')')
        closeCnt--;
    }
    return -1;
 }   
 public static void main(String args[]){
    String str="))";
    System.out.println(findeqlPoint(str));
 }
}
