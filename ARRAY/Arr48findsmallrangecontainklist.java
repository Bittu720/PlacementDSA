class Arr48findsmallrangecontainklist {
    static void findSmallest(int[][] arr) {
        int k = arr.length;
        int n = arr[0].length;
        int[] ptr = new int[k];
        int minRange = -1;
        int minVal = 0, maxVal = 0;
        while (true) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int minIndex = -1;
            for (int i = 0; i < k; i++) {
                if (ptr[i] == n) {
                    System.out.println("Smallest range is [" + minVal + ", " + maxVal + "]");
                    return;
                }

                int val = arr[i][ptr[i]];
                if (val < min) {
                    min = val;
                    minIndex = i;
                }
                if (val > max) {
                    max = val;
                }
            }
            if (minRange == -1 || (max - min) < minRange) {
                minRange = max - min;
                minVal = min;
                maxVal = max;
            }
            ptr[minIndex]++;
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
            { 4, 7, 9, 12, 15 },
            { 0, 8, 10, 14, 20 },
            { 6, 12, 16, 30, 50 }
        };
        findSmallest(arr);
    }
}
