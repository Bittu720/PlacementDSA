public class Arr65maxoccureinteger {
    public static int maxOccured(int left[],int right[],int n,int maxx){
        int freq[]=new int[maxx+2];
        for(int i=0;i<n;i++){
            freq[left[i]]+=1;
            freq[right[i]+1]-=1;
        }
            int maxFreq=freq[0],res=0;
            for(int i=1;i<=maxx;i++){
                freq[i]+=freq[i-1];
                if(freq[i]>maxFreq){
                    maxFreq=freq[i];
                    res=i;
                }
            }
            return res;
                }
        public static void main(String args[]){
            int left1[] = {2, 1, 3};
            int right1[] = {5, 3, 9};
            System.out.println(maxOccured(left1, right1, left1.length, 9)); 
    
            int left2[] = {1, 4, 3, 1};
            int right2[] = {15, 8, 5, 4};
            System.out.println(maxOccured(left2, right2, left2.length, 15)); 
    
            int left3[] = {1, 5, 9, 13, 21};
            int right3[] = {15, 8, 12, 20, 30};
            System.out.println(maxOccured(left3, right3, left3.length, 30)); 
        }        
    }

