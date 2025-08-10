public class Str27countandsay {
    public static String countandsay(int n) {
        if (n == 1) return "1";
        String curr = "1";
        for (int i = 2; i <= n; i++) {
            StringBuilder next = new StringBuilder();
            int cnt = 1;
            for (int j = 1; j < curr.length(); j++) {
                if (curr.charAt(j) == curr.charAt(j - 1)) {
                    cnt++;
                } else {
                    next.append(cnt).append(curr.charAt(j - 1));
                    cnt = 1;
                }
            }
            next.append(cnt).append(curr.charAt(curr.length() - 1));
            curr = next.toString();
        }
        return curr;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(countandsay(n));
    }
}