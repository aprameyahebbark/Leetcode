package Medium;
import java.util.*;

public class LargestNumber_179 {
    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
        if (arr[0].equals("0")) {
            return "0";
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            result.append(arr[i]);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        LargestNumber_179 obj = new LargestNumber_179();
        int[] nums = {3, 390, 34, 5, 9};
        System.out.println(obj.largestNumber(nums));
    }
}