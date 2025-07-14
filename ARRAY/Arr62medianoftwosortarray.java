public class Arr62medianoftwosortarray {
 static double medianof2(int a[],int b[]){
    int n=a.length,m=b.length;
    int i=0,j=0;
    int m1=-1,m2=-1;
    for(int count=0;count<=(m+n)/2;count++){
        m2=m1;
        if(i!=n && j!=m)
        m1=(a[i]>b[j])?b[j++]:a[i++];
        else if(i<n)
        m1=a[i++];
        else
        m1=b[j++];
    }
    if((m+n)%2==1)
    return m1;
    else
    return (m1+m2)/2.0;
 }  
 public static void main(String args[]){
    int a[]={-5,3,6,12,15};
    int b[]={-12,-10,-6,-3,4,10};
    System.out.println(medianof2(a,b));
 } 
}
