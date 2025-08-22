public class Str47shortestcommonSubsequenceusingLCS {
    static int shortestCommonSupersequence(String s1,
                                       String s2) {
        int m = s1.length();
        int n = s2.length();
        int l = lcs(s1, s2, m, n);
        return (m + n - l);
    }
    static int lcs(String s1, String s2, int m, int n) {
        int[][] L = new int[m + 1][n + 1];
        int i, j;
        for (i = 0; i <= m; i++) {
            for (j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    L[i][j] = 0;
                else if (s1.charAt(i - 1)
                         == s2.charAt(j - 1))
                    L[i][j] = L[i - 1][j - 1] + 1;
                else
                    L[i][j] = Math.max(L[i - 1][j],
                                       L[i][j - 1]);
            }
        }
        return L[m][n];
    }
    public static void main(String args[]) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";
        System.out.println(
            shortestCommonSupersequence(s1, s2));
    }
}