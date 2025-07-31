public class Str9minimumdistancebttwoword {
    static int shortestDistance(String str[],String word1,String word2){
        int idx1=-1,idx2=-1;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<str.length;i++){
            if(str[i].equals(word1)){
                idx1=i;
            }
            if(str[i].equals(word2)){
                idx2=i;
            }
            if(idx1 !=-1 && idx2 !=-1){
                ans=Math.min(ans,Math.abs(idx1-idx2));
            }
        }
        return ans;
    }
    public static void main(String args[]){
        String str[]={"the","quick","brown","fox","quick"};
        String word1="the" ,word2="fox";
        System.out.println(shortestDistance(str,word1,word2));
    }
}
