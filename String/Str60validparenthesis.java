import java.util.Stack;
import java.util.Scanner;
public class Str60validparenthesis {
     
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string brackets : ");
        String s=sc.nextLine();
        sc.close();

        if(isValid(s)){
            System.out.println("Valid Parenthesis");
        }
        else{
            System.out.println("Invalid Parenthesis");
        }
    }

    static boolean isValid(String s){
        Stack<Character> stack =new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }
            else if(ch==')'||ch=='}' || ch==']'){
                if(stack.isEmpty())
                return false;
                char top=stack.pop();
                if((ch==')' && top!='(') ||
                (ch=='}'&& top!='{')||
                (ch==']' && top!='[')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
