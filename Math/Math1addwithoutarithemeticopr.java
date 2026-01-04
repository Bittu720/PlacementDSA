public class Math1addwithoutarithemeticopr {
    static int sum(int a, int b) { 
        while (b != 0) { 
            int carry = (a & b) << 1;
            a = a ^ b;
            b = carry; 
        } 
        return a;
    } 
    public static void main(String[] args) {
        int a = -1, b = 2;
        System.out.println(sum(a, b));
    } 
}  

