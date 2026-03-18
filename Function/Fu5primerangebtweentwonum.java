public class Fu5primerangebtweentwonum {
public static boolean isPrime(int n) {
        if (n <= 1) 
        return false; 
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; 
            }
        }
        return true;
    }
    public static void primeRange(int n){
    for(int i=2;i<=n;i++){
        if(isPrime(i)){
            System.out.print(i+" ");
        }
    }
    System.out.println();
 }  
 public static void main(String args[]){
    primeRange(100);
 } 
}
