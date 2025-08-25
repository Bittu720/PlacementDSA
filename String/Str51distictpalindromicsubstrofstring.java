import java.util.*;
public class Str51distictpalindromicsubstrofstring {
    static ArrayList<String> palindromicSubstr(String str) {
        int n = str.length();
        boolean[][] dp = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
            if (i < n - 1 && str.charAt(i) == str.charAt(i + 1)) {
                dp[i][i + 1] = true;
            }
        }
        for (int len = 3; len <= n; len++) {
            for (int i = 0; i + len - 1 < n; i++) {
                if (str.charAt(i) == str.charAt(i + len - 1) 
                && dp[i + 1][i + len - 2]) {
                    dp[i][i + len - 1] = true;
                }
            }
        }
        int[] kmp = new int[n];
        Arrays.fill(kmp, 0);
        for (int i = 0; i < n; i++) {
            int j = 0, k = 1;
            while (k + i < n) {
                if (str.charAt(j + i) == str.charAt(k + i)) {
                    dp[k + i - j][k + i] = false;
                    kmp[k++] = ++j;
                }
                else if (j > 0) {
                    j = kmp[j - 1];
                }
                else {
                    kmp[k++] = 0;
                }
            }
        }
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String cur = "";
            for (int j = i; j < n; j++) {
                cur += str.charAt(j);
                if (dp[i][j]) {
                    result.add(cur);
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String str = "abaaa";
        ArrayList<String> result = palindromicSubstr(str);
        for (String s : result)
            System.out.print(s + " ");
    }
}