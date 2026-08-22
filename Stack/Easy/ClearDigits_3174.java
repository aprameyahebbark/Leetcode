package Easy;

import java.util.Stack;
public class ClearDigits_3174 {
    public static String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                char top = stack.peek();
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.reverse().toString();
    }
    public static void main(String[] args) {
        String s = "cbww35";
        String result = clearDigits(s);
        System.out.println("Result is : " + result);
    }
}