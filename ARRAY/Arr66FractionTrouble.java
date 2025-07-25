public class Arr66FractionTrouble {
 public static void main(String args[]){
    int n=2,d=53;
    int maxDen=9999;
    int bestNum=0,bestDen=1;
    for(int denom=1;denom<=maxDen;denom++){
        int num=(n*denom-1)/d;
        if(gcd(num,denom)==1 && (long) num*bestDen>(long)bestNum*denom){
            bestNum=num;
            bestDen=denom;
        }
    }
    System.out.println(bestNum+" "+bestDen);
 }  
 public static int gcd(int a,int b){
    while(b!=0){
        int temp=a%b;
        a=b;
        b=temp;
    }
    return a;
 } 
}
