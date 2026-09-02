package Medium;

import java.util.*;
public class RemoveDuplicateLetters_316 {
    public static String removeDuplicateLetters(String s) {
        int[] last = new int[26];
        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
        }
        Stack<Character> stack = new Stack<>();
        boolean[] used = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int index = ch - 'a';
            if (used[index]) {
                continue;
            }
            while (!stack.isEmpty()
                    && stack.peek() > ch
                    && last[stack.peek() - 'a'] > i) {
                used[stack.pop() - 'a'] = false;
            }
            stack.push(ch);
            used[index] = true;
        }
        StringBuilder result = new StringBuilder();
        for (char ch : stack) {
            result.append(ch);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String s = "cbacdcfdsbc";
        System.out.println(removeDuplicateLetters(s));
    }
}