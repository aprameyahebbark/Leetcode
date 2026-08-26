package Medium;

import java.util.Stack;
public class MakeArrayNonDecreasing_3523 {
    public static int maximumPossibleSize(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            int curr = nums[i];
            while (!stack.isEmpty() && curr > stack.peek()) {
                curr = Math.max(curr, stack.pop());
            }
            stack.push(curr);
        }
        return stack.size();
    }
    public static void main(String[] args) {
        int[] nums = {4, 2,9, 6, 5 , 3,5,12, 19,2,111};
        System.out.println(maximumPossibleSize(nums));
    }
}
