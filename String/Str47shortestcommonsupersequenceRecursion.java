public class Str47shortestcommonsupersequenceRecursion {
    static int superSeqHelper(String s1, String s2, int m,
                              int n) {
        if (m == 0)
            return n;
        if (n == 0)
            return m;
        if (s1.charAt(m - 1) == s2.charAt(n - 1))
            return 1 + superSeqHelper(s1, s2, m - 1, n - 1);
        return 1
            + Math.min(superSeqHelper(s1, s2, m - 1, n),
                       superSeqHelper(s1, s2, m, n - 1));
    }
    static int shortestCommonSupersequence(String s1,
                                           String s2) {
        return superSeqHelper(s1, s2, s1.length(),
                              s2.length());
    }
    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";
        int res = shortestCommonSupersequence(s1, s2);
        System.out.println(res);
    }
}