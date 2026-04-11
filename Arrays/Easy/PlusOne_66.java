import java.util.Arrays;

public class PlusOne_66 {

    public static void main(String[] args) {

        int[] digits = {9, 9, 9};

        PlusOne_66 obj = new PlusOne_66();
        int[] result = obj.plusOne(digits);
        System.out.println("Result: " + Arrays.toString(result));
    }

    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }
}