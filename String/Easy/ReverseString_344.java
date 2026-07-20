package Easy;
public class ReverseString_344 {
    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {

            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        System.out.print("Original: ");
        for (char ch : s) {
            System.out.print(ch + " ");
        }
        reverseString(s);
        System.out.print("\nReversed: ");
        for (char ch : s) {
            System.out.print(ch + " ");
        }
    }
}