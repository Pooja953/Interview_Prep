package Programs;

import java.util.Stack;

public class BalancedBrackets1 {
    public static void main(String[] args) {
        boolean result = isBalanced("{[()]}");
        if (result) {
            System.out.println("Balanced Bracket");
        } else {
            System.out.println("Not a balanced bracket");
        }
    }

    public static boolean isBalanced(String a) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);

            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
                continue;
            }

            if (stack.isEmpty()) {
                return false;
            }

            switch (ch) {
                case ')':
                    char check = stack.pop();
                    if (ch == '{' || ch == '[')
                        return false;
                    break;

                case ']':
                    check = stack.pop();
                    if (ch == '(' || ch == '{')
                        return false;
                    break;

                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;
            }
        }
        return stack.isEmpty();
    }
}





