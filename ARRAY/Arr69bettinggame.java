import java.util.Scanner;
public class Arr69bettinggame {
    static int betBalance(String result) {
        int total = 4;
        int bet = 1;
        for (int i = 0; i < result.length(); i++) {
            if (bet > total) {
                System.out.println(" Game over.");
                return -1;
            }
            char outcome = result.charAt(i);
            if (outcome == 'W') {
                total += bet;
                System.out.println("Round " + (i + 1) + ": Win → Total = " + total);
                bet = 1; 
            } else {
                total -= bet;
                System.out.println("Round " + (i + 1) + ": Loss → Total = " + total);
                bet *= 2; 
            }
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the result string : ");
        String result = scanner.nextLine().toUpperCase(); 
        int finalBalance = betBalance(result);
        if (finalBalance != -1) {
            System.out.println(" Final balance: " + finalBalance);
        } else {
            System.out.println("You went bankrupt");
        }
        scanner.close();
    }
}
