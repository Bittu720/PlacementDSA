import java.util.*;
public class Str49longestsubstringcharArrangedisPalindrome {
  static boolean ispalindromic(String s)
  {
    int n = s.length();
    HashMap<Character,Integer>hashmap = new HashMap<Character,Integer>();
    for (int ch = 0; ch < n; ch++) {
      if(hashmap.containsKey(s.charAt(ch))){
        hashmap.put(s.charAt(ch), hashmap.get(s.charAt(ch))+1);
      }
      else hashmap.put(s.charAt(ch),1);
    }
    int count = 0;
    for(Character i : hashmap.keySet()){
      if (hashmap.get(i) % 2 == 1)
        count++;
    }
    if (count > 1) {
      return false;
    }
    return true;
  }
  static int longestSubstring(String S, int n)
  {
    int ans = 0;
    for (int i = 0; i < S.length(); i++) {
      String curstr = "";
      for (int j = i; j < S.length(); j++) {
        curstr += S.charAt(j);
        if (ispalindromic(curstr)
            == true)
        {
          ans = Math.max(ans, j - i + 1);
        }
      }
    }
    return ans;
  }
  public static void main (String[] args)
  {
    String s = "adbabd";
    int n = s.length();
    System.out.println(longestSubstring(s, n));
  }
}