import java.util.Scanner;
import java.util.Stack;

public class validpar{
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') return false;
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') return false;
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') return false;
                    break;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] a)
    {
        Scanner sc=new Scanner(System.in);
        validpar obj=new validpar();
        String str=sc.nextLine();
        System.out.println(obj.isValid(str));
        sc.close();
        
    }
}
