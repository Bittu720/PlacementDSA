public class Arr14insertdupeff {
    static int[] duplicateK(int arr[], int k) {
        int n = arr.length;
        int cnt = count(arr, k);
        int[] result = new int[n + cnt];
        int write_idx = n + cnt - 1;
        int curr = n - 1;
        while (curr >= 0 && write_idx >= 0) {
            if (write_idx < n + cnt) {
                result[write_idx] = arr[curr];
            }
            write_idx -= 1;
            
            if (arr[curr] == k) {
                if (write_idx < n + cnt) {
                    result[write_idx] = k;
                }
                write_idx -= 1;
            }
            curr--;
        }
        return result;
    }
    static int count(int arr[], int num) {
        int ans = 0;
        for (int i : arr) {
            if (i == num) {
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 0, 2, 3, 0, 4, 5, 0 };
        int k = 0;
        
        int[] ans = duplicateK(arr, k);
        
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
