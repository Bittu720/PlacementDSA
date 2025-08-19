public class Str39countsubstrwithkchareff {
    static int count(String str, int k) {
        int ans = 0;
        int n = str.length();
        int freq[] = new int[26];
        int distinctcnt = 0;
        int i = 0;
        for (int j = 0; j < n; j++) {
            freq[str.charAt(j) - 'a']++;
            if (freq[str.charAt(j) - 'a'] == 1)
                distinctcnt++;
            while (distinctcnt > k) {
                freq[str.charAt(i) - 'a']--;
                if (freq[str.charAt(i) - 'a'] == 0)
                    distinctcnt--;
                i++;
            }
            ans += j - i + 1;
        }
        return ans;
    }

    static int countsubstr(String str, int k) {
        return count(str, k) - count(str, k - 1);
    }

    public static void main(String args[]) {
        String str = "abc";
        int k = 2;
        System.out.println(countsubstr(str, k));  
    }
}
