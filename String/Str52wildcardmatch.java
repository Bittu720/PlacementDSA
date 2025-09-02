import java.util.Scanner;
public class Str52wildcardmatch {
    public static boolean isMatch(String pattern, String str) {
        int m = pattern.length();
        int n = str.length();
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true; 
        for (int i = 1; i <= m; i++) {
            if (pattern.charAt(i - 1) == '*')
                dp[i][0] = dp[i - 1][0];
        }
        for (int i = 1; i <= m; i++) {
            char pc = pattern.charAt(i - 1);
            for (int j = 1; j <= n; j++) {
                char sc = str.charAt(j - 1);
                if (pc == sc || pc == '?') {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (pc == '*') {
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1]; 
                }
            }
        }
        return dp[m][n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pattern = sc.nextLine();
        String str = sc.nextLine();
sc.close();
        if (isMatch(pattern, str)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
