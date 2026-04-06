import java.util.Arrays;

public class LongestCommonPrefix_14 {

    public static void main(String[] args) {
        String[] strs = new String[]{"flower", "flow", "flight"};
        LongestCommonPrefix_14 obj = new LongestCommonPrefix_14();
        System.out.println(obj.longestCommonPrefix(strs));
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }
}