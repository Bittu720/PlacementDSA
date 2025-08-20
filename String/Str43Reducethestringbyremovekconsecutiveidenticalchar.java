public class Str43Reducethestringbyremovekconsecutiveidenticalchar {
  public static String removekchar(int k,String s){
    StringBuilder sb=new StringBuilder();
    int count[]=new int[s.length()];
    for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        sb.append(c);
        int last=sb.length()-1;
        if(last>0 && sb.charAt(last)==sb.charAt(last-1)){
            count[last]=count[last-1]+1;
        }
        else{
            count[last]=1;
        }
        if(count[last]==k){
            sb.delete(sb.length()-k,sb.length());
        }
    }
    return sb.toString();
  } 
  public static void main(String args[]){
    int k=2;
    String s="geeksforgeeks";
    String ans=removekchar(k,s);
    System.out.println(ans);
  }
}
