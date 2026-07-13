package Medium;
import java.util.Scanner;

public class LongestPalindromicSubstring_5 {

    private static int start = 0;
    private static int maxLen = 0;

    public static String longestPalindrome(String s) {

        start = 0;
        maxLen = 0;

        if (s == null || s.length() < 2) {
            return s;
        }

        for (int i = 0; i < s.length(); i++) {
            expand(s, i, i);
            expand(s, i, i + 1);
        }

        return s.substring(start, start + maxLen);
    }

    private static void expand(String s, int left, int right) {

        while (left >= 0 &&
                right < s.length() &&
                s.charAt(left) == s.charAt(right)) {

            left--;
            right++;
        }

        int length = right - left - 1;

        if (length > maxLen) {
            maxLen = length;
            start = left + 1;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        String answer = longestPalindrome(s);

        System.out.println("Longest Palindromic Substring: " + answer);

        scanner.close();
    }
}