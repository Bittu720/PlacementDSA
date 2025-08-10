public class Str28s1repeats2substringeff {
    static void computeLPSArray(String pattern, int[] lps) {
        int length = 0;
        int i = 1;
        lps[0] = 0; 
        while (i < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(length)) {
                length++;
                lps[i] = length;
                i++;
            } else {
                if (length == 0) {
                    lps[i] = 0;
                    i++;
                } else {
                    length = lps[length - 1];
                }
            }
        }
    }
    static boolean KMPsearch(String text, String pattern, int[] lps, int repeat) {
        int n = text.length(), m = pattern.length();
        int i = 0, j = 0;
        while (i < n * repeat) {
            if (text.charAt(i % n) == pattern.charAt(j)) {
                i++;
                j++;
                if (j == m) {
                    return true; 
                }
            } else {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }

        return false;
    }
    static int minRepeats(String str1, String str2) {
        int n = str1.length(), m = str2.length();
        int[] lps = new int[m];
        computeLPSArray(str2, lps);
        int minRepeats = (m + n - 1) / n; // Ceiling of m / n
        if (KMPsearch(str1, str2, lps, minRepeats)) {
            return minRepeats;
        }
        if (KMPsearch(str1, str2, lps, minRepeats + 1)) {
            return minRepeats + 1;
        }

        return -1; 
    }

    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "cdabcdab";
        System.out.println(minRepeats(str1, str2)); // Output: 3
    }
}
