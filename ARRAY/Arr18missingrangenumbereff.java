public class Arr18missingrangenumbereff {
        public static void missingRanges(int[] arr, int lower, int upper) {
            int n = arr.length;
            if (lower < arr[0]) {
                System.out.println(lower + " " + (arr[0] - 1));
            }
            for (int i = 0; i < n - 1; ++i) {
                if (arr[i + 1] - arr[i] > 1) {  
                    System.out.println((arr[i] + 1) + " " + (arr[i + 1] - 1));
                }
            }
            if (upper > arr[n - 1]) {
                System.out.println((arr[n - 1] + 1) + " " + upper);
            }
        }
        public static void main(String[] args) {
            int lower = 10;
            int upper = 50;
            int[] arr = {14, 15, 20, 30, 31, 45};
            missingRanges(arr, lower, upper);  
        }
    }
     
