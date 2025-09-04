import java.util.Scanner;

public class Str57countuplowerspecial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sentence : ");
        String str = sc.nextLine();
        sc.close();

        int upper = 0, lower = 0, special = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                upper++;
            }

            if (Character.isLowerCase(ch)) {
                lower++;
            }

            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                special++;
            }
        }

        System.out.println("Uppercase letters: " + upper);
        System.out.println("Lowercase letters: " + lower);
        System.out.println("Special characters: " + special);
    }
}
