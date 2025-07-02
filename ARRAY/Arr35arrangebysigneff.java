import java.util.Arrays;
public class Arr35arrangebysigneff {
        static void rearrange(int[] arr) {
            int n = arr.length;
            int[] pos = new int[n];
            int[] neg = new int[n];
            int posCount = 0, negCount = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] >= 0)
                    pos[posCount++] = arr[i];
                else
                    neg[negCount++] = arr[i];
            }
            int i = 0, p = 0, ne = 0;
            while (p < posCount && ne < negCount) {
                if (i % 2 == 0)
                    arr[i++] = pos[p++];
                else
                    arr[i++] = neg[ne++];
            }
            while (p < posCount)
                arr[i++] = pos[p++];
            while (ne < negCount)
                arr[i++] = neg[ne++];
        }
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, -4, -1, 4};
            rearrange(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
     

