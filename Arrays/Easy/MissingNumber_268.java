import java.util.Arrays;

public class MissingNumber_268 {

    public static void main(String[] args) {

        int[] nums = {3, 0, 1};
        MissingNumber_268 obj = new MissingNumber_268();
        int result = obj.missingNumber(nums);
        System.out.println("Missing Number: " + result);
    }
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i)
                return i;
        }
        return nums.length;
    }
}