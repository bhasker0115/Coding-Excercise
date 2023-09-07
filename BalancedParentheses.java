import java.util.Stack;

public class BalancedParentheses {

    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false; // Unmatched closing parenthesis
                }
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false; // Mismatched pair
                }
            }
        }

        return stack.isEmpty(); // If the stack is empty, all parentheses are balanced.
    }

    public static boolean isMatchingPair(char left, char right) {
        return (left == '(' && right == ')') || (left == '{' && right == '}') || (left == '[' && right == ']');
    }

    public static void main(String[] args) {
        String input = "{[()]}"; // Change this to the string you want to check
        if (isBalanced(input)) {
            System.out.println("The string has balanced parentheses.");
        } else {
            System.out.println("The string does not have balanced parentheses.");
        }
    }
}
