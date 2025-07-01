public class Arr32maxdistanceseateff {
static int maxdistancetoclosest(int seats[]){
    int res=-1;
    int empcount=0;
    for(int i=0;i<seats.length;i++){
        if(seats[i]== 0){
            empcount++;
        }
        else if(seats[i]==1 && res==-1){
            res=empcount;
         empcount=0;
        }
        else{
            res=Math.max(res,(empcount+1)/2);
            empcount=0;
        }
    }
    res=Math.max(res,empcount);
    return res;
}   
public static void main(String args[]) {
    int seats[] = {1, 0, 0, 0, 1, 0, 1};
    System.out.println(maxdistancetoclosest(seats)); 
} 
}
