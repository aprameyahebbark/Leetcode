package Easy;
import java.util.Scanner;
public class FindDifference_389 {
    public char findTheDifference(String s, String t) {
        int xor = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            xor = xor ^ currentChar;
        }
        for (int i = 0; i < t.length(); i++) {
            char currentChar = t.charAt(i);
            xor = xor ^ currentChar;
        }
        return (char) xor;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string s: ");
        String s = sc.nextLine();
        System.out.print("Enter string t: ");
        String t = sc.nextLine();
        FindDifference_389 obj = new FindDifference_389();
        char answer = obj.findTheDifference(s, t);
        System.out.println("Extra character = " + answer);
        sc.close();
    }
}
