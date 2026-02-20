import java.util.*;

public class DP10LongestIncreasingSubsequence {

    public static int lcs(int arr1[], int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;

        int dp[][] = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (arr1[i - 1] == arr2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[n][m];
    }

    public static int longestIncreasingSubsequence(int arr[]) {

        HashSet<Integer> set = new HashSet<>();

        // Remove duplicates
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        // Convert set to array
        int arr2[] = new int[set.size()];
        int i = 0;
        for (int num : set) {
            arr2[i] = num;
            i++;
        }

        // Sort array
        Arrays.sort(arr2);

        // Call LCS
        return lcs(arr, arr2);
    }

    public static void main(String args[]) {
        int arr[] = {50, 3, 10, 7, 40, 80};
        System.out.println("Length of LIS = " + longestIncreasingSubsequence(arr));
    }
}
