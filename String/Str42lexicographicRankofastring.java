import java.util.Arrays;
public class Str42lexicographicRankofastring {
    static int findRank(String str) {
        String original = str;
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        int rank = 1;
        while (!String.valueOf(arr).equals(original)) {
            nextPermutation(arr);
            rank++;
        }
        return rank;
    }
    static void nextPermutation(char[] arr) {
        int i = arr.length - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) i--;
        if (i >= 0) {
            int j = arr.length - 1;
            while (arr[j] <= arr[i]) j--;
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        reverse(arr, i + 1, arr.length - 1);
    }
    static void reverse(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }
    public static void main(String[] args) {
        String str = "string";
        System.out.println(findRank(str));
    }
} 

