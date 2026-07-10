import java.util.HashSet;

public class UniqueThreeDigitEven_3483 {

    public static int totalNumbers(int[] digits) {

        HashSet<Integer> set = new HashSet<>();

        int n = digits.length;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {

                    if (i == j || j == k || i == k)
                        continue;

                    // First digit cannot be zero
                    if (digits[i] == 0)
                        continue;

                    // Last digit must be even
                    if (digits[k] % 2 != 0)
                        continue;

                    int number = digits[i] * 100 + digits[j] * 10 + digits[k];

                    set.add(number);
                }
            }
        }
        return set.size();
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 3, 4, 6 , 8};
        int answer = totalNumbers(digits);
        System.out.println("Total Unique 3 digit Even Numbers = " + answer);
    }
}