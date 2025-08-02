public class Str15checkPanagrameff {
    static final int MAX_CHAR = 26;

    public static boolean checkPanagram(String str) {
        boolean vis[] = new boolean[MAX_CHAR];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z')
                vis[c - 'A'] = true;
            else if (c >= 'a' && c <= 'z')
                vis[c - 'a'] = true;
        }

        for (int i = 0; i < MAX_CHAR; i++) {
            if (!vis[i])
                return false;
        }

        return true;
    }

    public static void main(String args[]) {
        String str = "the quick brown fox jumps over the lazy dog";
        System.out.println(checkPanagram(str) ? "true" : "false");
    }
}
