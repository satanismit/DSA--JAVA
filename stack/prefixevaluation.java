import java.util.Stack;
import java.util.Scanner;

public class prefixevaluation {

    public static int prefix(String s) {

        Stack<Integer> st = new Stack<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (Character.isDigit(s.charAt(i))) {
                st.push(s.charAt(i) - '0');
            } else {
                int val1 = st.pop(); // operand 1
                int val2 = st.pop(); // operand 2
                st.push(value(val1, val2, s.charAt(i)));

            }
        }
        return st.pop();
    }

    public static int value(int n1, int n2, char c) {

        switch (c) {
            case '+':
                return n1 + n2;
            case '-':
                return n1 - n2;
            case '*':
                return n1 * n2;
            case '/':
                return n1 / n2;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
       // prefixevaluation obj = new prefixevaluation();
        int j = prefix(str);
        System.out.println("answer :" + j);

        sc.close();

    }
}
