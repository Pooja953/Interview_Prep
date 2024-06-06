package Programs;

import java.util.Stack;

public class BalancedBracket {

    public static void main(String[] args) {
        boolean result = isBalanced("({[]})");
        if(result){
            System.out.println("String is balanced");
        }else{
            System.out.println("Not balanced");
        }
    }

    public static boolean isBalanced(String exp) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
                continue;
            }


            if (stack.isEmpty()) {
                return false;
            }

            switch (ch) {
                case ')':
                    char check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;
                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
                case '}':
                    check = stack.pop();
                    if (check == '[' || check == '(')
                        return false;
                    break;
            }
        }
        return stack.isEmpty();
    }
}
