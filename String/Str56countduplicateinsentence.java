import java.util.*;

public class Str56countduplicateinsentence {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        DuplicateWord(str);
    }

    static void DuplicateWord(String str) {
        String words[] = str.toLowerCase().split("\\s+"); 
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Duplicate words:");
        for (String word : wordCount.keySet()) {
            if (wordCount.get(word) > 1) {
                System.out.println(word + " : " + wordCount.get(word));
            }
        }
    }
}
