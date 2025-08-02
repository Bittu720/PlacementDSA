class Str14checkstringkanagrameff{
    public static boolean Kanagram(String str1,String str2,int k){
        if(str1.length()!=str2.length()){
            return false;
        }
        int freq1[]=new int[256];
        int freq2[]=new int[256];
        for(int i=0;i<str1.length();i++){
            freq1[str1.charAt(i)]++;
           freq2[str2.charAt(i)]++;
        }
        int count=0;
        for(int i=0;i<256;i++){
            count+=Math.abs(freq1[i]-freq2[i]);
        }
        return count<=2*k;
    }
    public static void main(String args[]){
        String str1="anagram";
        String str2="grammar";
        int k=2;
        if(Kanagram(str1,str2,k))
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}