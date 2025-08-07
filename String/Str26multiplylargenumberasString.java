public class Str26multiplylargenumberasString {
    public static String multiply(String num1, String num2) {
        boolean negative = false;
        if (num1.startsWith("-")) {
            negative = !negative;
            num1 = num1.substring(1);
        }
        if (num2.startsWith("-")) {
            negative = !negative;
            num2 = num2.substring(1);
        }
        num1 = removeLeadingZeros(num1);
        num2 = removeLeadingZeros(num2);
        if (num1.equals("0") || num2.equals("0")) return "0";
        int m = num1.length(), n = num2.length();
        int[] result = new int[m + n];
        for (int i = m - 1; i >= 0; i--) {
            int d1 = num1.charAt(i) - '0';
            for (int j = n - 1; j >= 0; j--) {
                int d2 = num2.charAt(j) - '0';
                int sum = d1 * d2 + result[i + j + 1];

                result[i + j + 1] = sum % 10;
                result[i + j] += sum / 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (sb.length() == 0 && num == 0) continue; // skip leading zero
            sb.append(num);
        }
        return negative ? "-" + sb.toString() : sb.toString();
    }
    private static String removeLeadingZeros(String str) {
        int i = 0;
        while (i < str.length() - 1 && str.charAt(i) == '0') {
            i++;
        }
        return str.substring(i);
    }
    public static void main(String[] args) {
        System.out.println(multiply("0033", "2"));      // Output: 66
        System.out.println(multiply("11", "23"));       // Output: 253
        System.out.println(multiply("123", "0"));       // Output: 0
        System.out.println(multiply("-12", "-3"));      // Output: 36
        System.out.println(multiply("-5", "7"));        // Output: -35
    }
}
