package Easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger_13 {

    public int romanToInt(String s) {
        // Creation of map to store the values of Roman numerals
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int currentVal = romanMap.get(s.charAt(i));

            if (i < n - 1 && currentVal < romanMap.get(s.charAt(i + 1))) {
                total -= currentVal;
            } else {
                total += currentVal;
            }
        }

        return total;
    }

    public static void main(String[] args) {
        RomanToInteger_13 solver = new RomanToInteger_13();

        String s1 = "III";
        System.out.println("Input: " + s1 + " -> Output: " + solver.romanToInt(s1));
        String s2 = "LVIII";
        System.out.println("Input: " + s2 + " -> Output: " + solver.romanToInt(s2));

        String s3 = "MCMXCIV";
        System.out.println("Input: " + s3 + " -> Output: " + solver.romanToInt(s3));
    }
}
