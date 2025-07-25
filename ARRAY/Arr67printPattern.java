public class Arr67printPattern {
    public static void pattern(int n) {
        int temp = n;
        while (temp > 0) {
            System.out.print(temp + " ");
            temp -= 5;
        }
        System.out.print(temp + " ");
        while (temp < n) {
            temp += 5;
            System.out.print(temp + " ");
        }
    }
    public static void main(String[] args) {
        int n = 16;
        pattern(n);  
    }
}

