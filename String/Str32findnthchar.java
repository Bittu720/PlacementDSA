import java.util.BitSet;
public class Str32findnthchar {
    static void kthchar(int m,int n,int k){
        BitSet binary=BitSet.valueOf(new long[] {m});
        int distance=1<<n;
        int blocknumber=k/distance;
        int remaining=k%distance;
        int root=binary.get(n-blocknumber-1)?1:0;
        if(remaining==0){
            System.out.println(root);
            return;
        }
        boolean flip=false;
        while(remaining>1){
            flip=!flip;
            remaining=remaining>>1;
                }
                if(flip){
                    System.out.println(root==0?1:0);
                }
                else{
                    System.out.println(root);
                }
    }
    public static void main(String args[]){
        int m=5,k=5,n=3;
        kthchar(m,n,k);
    }
}
