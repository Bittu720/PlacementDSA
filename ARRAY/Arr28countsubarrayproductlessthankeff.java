public class Arr28countsubarrayproductlessthankeff {
        static int countSubArray(int arr[], int n, int k) {
            if (k <= 1) return 0; 
            int prod = 1, count = 0;
            int left = 0;
            for (int right = 0; right < n; right++) {
                prod *= arr[right];
    
                while (prod >= k && left <= right) {
                    prod /= arr[left];
                    left++;
                }
                count += (right - left + 1);
            }
    
            return count;
        }
    
        public static void main(String args[]) {
            int arr[] = {1, 2, 3, 4};
            int k = 10;
            int n = arr.length;
            int Count = countSubArray(arr, n, k);
            System.out.print(Count); // Output: 7
        }
    }
     
