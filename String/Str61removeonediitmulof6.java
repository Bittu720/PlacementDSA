import java.util.Scanner;
public class Str61removeonediitmulof6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = sc.next();  

        boolean found = false;

        for (int i = 0; i < num.length(); i++) {
            String newNumStr = num.substring(0, i) + num.substring(i + 1);
            if (newNumStr.isEmpty()) continue;

            int newNum = Integer.parseInt(newNumStr);

            if (newNum % 6 == 0) {
                System.out.println("Removed digit: " + num.charAt(i));
                System.out.println("Remaining number: " + newNum);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No digit removal makes it a multiple of 6.");
        }

        sc.close();
    }
}
 

