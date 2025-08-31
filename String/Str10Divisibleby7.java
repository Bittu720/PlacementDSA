public class Str10divisibleby7 {
  static boolean Divisibleby7(int num){
    if(num<0)
    return Divisibleby7(-num);
if(num==0||num==7)
return true;
if(num<10)
return false;
return Divisibleby7(num/10-2*(num-num/10*10));
  }  
  public static void main(String args[]){
    int num=616;
    if(Divisibleby7(num))
    System.out.println("Divisible");
    else
    System.out.println("Not divisible");
  }

}

