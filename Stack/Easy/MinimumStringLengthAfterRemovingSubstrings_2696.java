package Easy;

import java.util.Stack;
public class MinimumStringLengthAfterRemovingSubstrings_2696 {

    public static int minLength(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty()) {
                char top = stack.peek();
                if ((top == 'A' && c == 'B') ||
                        (top == 'C' && c == 'D')) {
                    stack.pop();
                    continue;
                }
            }
            stack.push(c);
        }
        return stack.size();
    }
    public static void main(String[] args) {
        String s = "ABFCACDB";
        int result = minLength(s);
        System.out.println("Minimum length: " + result);
    }
}
