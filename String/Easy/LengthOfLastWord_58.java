package Easy;
import java.util.Scanner;
public class LengthOfLastWord_58{
    public static int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        int length = 0;
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }
        return length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();

        int result = lengthOfLastWord(s);
        System.out.println("Length of Last Word = " + result);

        sc.close();
    }
}