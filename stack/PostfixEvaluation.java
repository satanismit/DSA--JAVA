import java.util.Scanner;
import java.util.Stack;

public class PostfixEvaluation {
    public static int evaluatePostfix(String postfix) {
        Stack<Integer> stack = new Stack<>();
        for (char c : postfix.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else { // operator
                //for postfix expression
                
                int b = stack.pop();  //op2
                int a = stack.pop();  //op1
                switch (c) {
                    case '+': stack.push(a + b); break;
                    case '-': stack.push(a - b); break;
                    case '*': stack.push(a * b); break;
                    case '/': stack.push(a / b); break;
                }
            }
        }
        return stack.pop();
    }
     public static void main(String[] a)
    {
        char c='h';
        System.out.println(c);
        Scanner sc=new Scanner(System.in);
       // PostfixEvaluation obj=new PostfixEvaluation();
        String str=sc.nextLine();
        int s= evaluatePostfix(str);
        System.out.println(s);
        sc.close();
    }
    
    
}
