public class Str42printmaxnumberofAusinggivenfourkey{
    static int optimalKeys(int n) {
        if (n <= 6)
            return n;
        int[] screen = new int[n];
        for (int i = 1; i <= 6; i++)
            screen[i - 1] = i;
        for (int i = 7; i <= n; i++) {
            screen[i - 1] = Math.max(2 * screen[i - 4],
                                     Math.max(3 * screen[i - 5],
                                              4 * screen[i - 6]));
        }
        return screen[n - 1];
    }
    public static void main(String[] args) {
        int n = 7;
        System.out.println(optimalKeys(n));
    }
}  

