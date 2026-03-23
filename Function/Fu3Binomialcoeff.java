public class Fu3binomialcoeff {
    public static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static long binomialCoefficient(int n, int k) {
        if (k < 0 || k > n) return 0;
        return factorial(n) / (factorial(k) * factorial(n - k));
    }
    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        long result = binomialCoefficient(n, k);
        System.out.println("C(" + n + ", " + k + ") = " + result);
    }
}
