import java.util.*;

public class infixtoprefix {

    public static String prefixconversion(String str) {
        Stack<Character> stack = new Stack<>();
        StringBuilder prefix = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                prefix.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    prefix.append(stack.pop());
                }
                stack.pop();
            }

            else {
                while (!stack.isEmpty() && precedence(c) < precedence(stack.peek())) {
                    prefix.append(stack.pop());

                }
                stack.push(c);

            }
        }
        while (!stack.isEmpty()) {
            prefix.append(stack.pop());
        }
        String s = prefix.toString();
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            st.push(c);
        }
        StringBuilder str1 = new StringBuilder();
        while (!st.isEmpty()) {
            str1.append(st.pop());
        }
        return str1.toString();

    }

    private static int precedence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String sy = (prefixconversion(s));
        System.out.println("hello:" + sy);
        sc.close();

    }
}
