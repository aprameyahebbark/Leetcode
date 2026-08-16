package Medium;

import java.util.*;
public class GenerateParentheses_22 {
    static List<String> result = new ArrayList<>();
    public static void generate(String str, int open, int close, int n) {

        if (str.length() == 2 * n) {
            result.add(str);
            return;
        }
        if (open < n) {
            generate(str + "(", open + 1, close, n);
        }
        if (close < open) {
            generate(str + ")", open, close + 1, n);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        generate("", 0, 0, n);
        System.out.println(result);


    }
}