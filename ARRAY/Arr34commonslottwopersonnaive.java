import java.util.*;
 class Solution {
    public int[] commonSlot(int[][] slt1, int[][] slt2, int d) {
        Arrays.sort(slt1, (a, b) -> a[0] - b[0]);
        Arrays.sort(slt2, (a, b) -> a[0] - b[0]);

        int i = 0, j = 0;
        while (i < slt1.length && j < slt2.length) {
            int start = Math.max(slt1[i][0], slt2[j][0]);
            int end = Math.min(slt1[i][1], slt2[j][1]);

            if (end - start >= d)
                return new int[]{start, start + d};

            if (slt1[i][1] < slt2[j][1])
                i++;
            else
                j++;
        }

        return new int[0];
    }
}

public class Arr34commonslottwopersonnaive  {
    public static void main(String[] args) {
        int[][] slt1 = {{10, 50}, {60, 120}, {140, 210}};
        int[][] slt2 = {{0, 15}, {60, 70}};
        int d = 8;

        Solution sol = new Solution();
        int[] result = sol.commonSlot(slt1, slt2, d);
        System.out.println(Arrays.toString(result));
    }
}

