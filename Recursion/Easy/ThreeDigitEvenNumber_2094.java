package Easy;

import java.util.*;
class ThreeDigitEvenNumber_2094 {
    public static int[] findEvenNumbers(int[] digits) {

        int[] freq = new int[10];
        for (int i = 0; i < digits.length; i++) {
            int digit = digits[i];
            freq[digit]++;
        }
        List<Integer> result = new ArrayList<>();
        for (int a = 1; a <= 9; a++) {
            if (freq[a] == 0)
                continue;
            freq[a]--;
            for (int b = 0; b <= 9; b++) {
                if (freq[b] == 0)
                    continue;
                freq[b]--;
                for (int c = 0; c <= 8; c += 2) {
                    if (freq[c] > 0) {
                        int number = a * 100 + b * 10 + c;
                        result.add(number);
                    }
                }
                freq[b]++;
            }
            freq[a]++;
        }
        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] digits = {2, 1, 3, 1};
        int[] result = findEvenNumbers(digits);
        System.out.println(Arrays.toString(result));
    }
}
