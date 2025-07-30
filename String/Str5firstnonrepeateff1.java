public class Str5firstnonrepeateff1 {
  static char nonRep(String str) {
    int freq[]=new int[256];
    for(int i=0;i<str.length();i++){
        freq[str.charAt(i)]++;
    }
    for(int i=0;i<str.length();i++){
        if(freq[str.charAt(i)]==1){
            return str.charAt(i);
        }
    }
    return 0;
  } 
  public static void main(String args[]){
    String str="bittukushwaha";
    System.out.println(nonRep(str));
  }
}
