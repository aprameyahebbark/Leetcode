package Easy;

import java.util.Scanner;

public class MakeStringGreat_1544 {
    public static String makeGood(String s) {
        StringBuilder stack = new StringBuilder();

        for (char ch : s.toCharArray()) {
            int len = stack.length();
            if (len > 0 && Math.abs(stack.charAt(len - 1) - ch) == 32) {
                stack.deleteCharAt(len - 1);
            } else {
                stack.append(ch);
            }
        }
        return stack.toString();
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        String result = makeGood(s);
        System.out.println("The Good String: " + result);


    }
}