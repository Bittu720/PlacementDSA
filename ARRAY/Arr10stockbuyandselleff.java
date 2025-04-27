
public class Arr10stockbuyandselleff {
    static int maxProfit(int[] prices) {
        int minimum = prices[0];
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            minimum = Math.min(minimum, prices[i]);               
            res = Math.max(res, prices[i] - minimum);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] prices = {7, 10, 1, 3, 6, 9, 2};
        System.out.println(maxProfit(prices));
    }
}
 
