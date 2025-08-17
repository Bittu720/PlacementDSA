public abstract class Str38countsubstroflengthkwithkeff {
  static int countOfSubstrings(String s, int k) {
        if (k > s.length()) return 0; 
        int n = s.length();
        int[] cnt = new int[26];
        int ans = 0;
        for (int i = 0; i < k - 1; i++) {
            cnt[s.charAt(i) - 'a']++;
        }
        for (int i = k - 1; i < n; i++) {
            cnt[s.charAt(i) - 'a']++;
            int distinctCnt = 0;
            for (int j = 0; j < 26; j++) {
                if (cnt[j] > 0) distinctCnt++;
            }
            if (distinctCnt == k - 1) ans++;
            
            cnt[s.charAt(i - k + 1) - 'a']--;
        }
        
        return ans;
    }
    public static void main(String[] args) {

        String str = "abcc";
        int k = 2;
 System.out.println(countOfSubstrings(str, k));
    }
}