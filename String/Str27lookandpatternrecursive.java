public class Str27lookandpatternrecursive {
 public static String nextTerm(String prev){
    StringBuilder curr=new StringBuilder();
    int count=1;
    for(int i=1;i<prev.length();i++){
        if(prev.charAt(i)==prev.charAt(i-1)){
            count++;
        }
        else{
            curr.append(count).append(prev.charAt(i-1));
            count=1;
        }
    }
    curr.append(count).append(prev.charAt(prev.length()-1));
    return curr.toString();
 } 
 public static String countandsay(int n){
    if(n==1)
    return "1";
    String prev=countandsay(n-1);
    return nextTerm(prev);
 }  
 public static void main(String args[]){
    int n=5;
    System.out.print(countandsay(n));
 }
}
