public class Str19licenseformate {
  public static String reverseS(String str){
    String nstr = "";
    for (int i = 0; i < str.length(); i++) {
      char ch
        = str.charAt(i); 
      nstr
        = ch + nstr; 
    }
    return nstr;
  }

  public static String ReFormatString(String S, int K)
  {
    int len = S.length();
    int x = 0;
    for (int i = len - 1; i >= 0; i--) {
      if (S.charAt(i) == '-') {
        x++;
      }
      else {
        S = S.substring(0, i + x)
          + Character.toUpperCase(S.charAt(i))
          + S.substring(i + x + 1);
      }
    }
    int slen = len - x;
    int step = (int)(slen / K);
    S = reverseS(S);
    int val = x;
    while (val > 0) {
      S = S.substring(0, S.length() - 1);
      val--;
    }
    int temp = step;
    while (temp > 0) {
      S += " ";
      temp--;
    }
    S = reverseS(S);
    len = S.length();
    int i = slen, j = step, f = 0;
    while (j < len) {
      step = (int)(i / K);
      if (f == 1)
        step--;
      int rem = i % K;
      if (rem == 0 && f == 0) {
        S = S.substring(0, j - step) + "-"
          + S.substring(j - step + 1);
        f = 1;
        continue;
      }
      S = S.substring(0, j - step) + S.charAt(j)
        + S.substring(j - step + 1);
      i--;
      j++;
      f = 0;
    }
    len = S.length();
    S = reverseS(S);
    for (int m = len - 1; m >= 0; m--) {
      if (S.charAt(m) != '-') {
        break;
      }
      if (S.charAt(m) == '-')
        S = S.substring(0, S.length() - 1);
    }
    S = reverseS(S);

    return S;
  }

  public static void main(String[] args)
  {
    String s = "5F3Z-2e-9-w";
    int K = 4;
    System.out.println(ReFormatString(s, K));
  }
}