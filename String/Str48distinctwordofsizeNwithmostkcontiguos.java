import java.util.*;
public class Str48distinctwordofsizeNwithmostkcontiguos {
    static final int mod = 1000000007;
    static int countWays(
        int ind, int vow, int n, int k, boolean prev, int[][][] memo) {
        if (ind == n) return 1;
        if (memo[ind][vow][prev ? 1 : 0] != -1)
            return memo[ind][vow][prev ? 1 : 0];
        int res = 0;
        int ways = countWays(ind + 1, 0, n, k, false, memo);
        res = (res + 21 * ways) % mod;
        if (!prev || vow < k) {
            ways = countWays(ind + 1, prev ? vow + 1 : 1, n, k, true, memo);
            res = (res + 5 * ways) % mod;
        }
        memo[ind][vow][prev ? 1 : 0] = res;
        return res;
    }
    static int kVowelWords(int n, int k) {
        int[][][] memo = new int[n + 1][k + 1][2];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= k; j++) {
                Arrays.fill(memo[i][j], -1);
            }
        }
        return countWays(0, 0, n, k, false, memo);
    }
    public static void main(String[] args) {
        int n = 3, k = 3;
        System.out.println(kVowelWords(n, k));
    }
}