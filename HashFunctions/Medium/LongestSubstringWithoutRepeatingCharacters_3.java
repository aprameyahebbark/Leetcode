package Medium;
import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters_3{

    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int right = 0;
        int maxLength = 0;
        while (right < s.length()) {

            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);

                right++;

            } else {
                set.remove(s.charAt(left));
                left++;

            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        int answer = lengthOfLongestSubstring(s);
        System.out.println("Longest Length = " + answer);

    }
}