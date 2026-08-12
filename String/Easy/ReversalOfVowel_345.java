package Easy;
public class ReversalOfVowel_345 {

    public static String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            while (left < right && !isVowel(arr[left])) {
                left++;
            }
            while (left < right && !isVowel(arr[right])) {
                right--;
            }
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }
    public static boolean isVowel(char c) {

        return c == 'a' || c == 'e' || c == 'i' ||
                c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' ||
                c == 'O' || c == 'U';
    }

    public static void main(String[] args) {

        String s1 = "IceCreAm";
        String s2 = "leetcode";
        System.out.println("Input: " + s1);
        System.out.println("Output: " + reverseVowels(s1));
        System.out.println();
        System.out.println("Input: " + s2);
        System.out.println("Output: " + reverseVowels(s2));
    }
}