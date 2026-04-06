import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray_26 {

    public static void main(String[] args) {
        int nums[] = {1, 1, 2};

        RemoveDuplicatesFromSortedArray_26 obj = new RemoveDuplicatesFromSortedArray_26();
        int k = obj.removeDuplicates(nums);

        System.out.println("k = " + k);
        System.out.println("New array = " + Arrays.toString(nums));
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 1; // first element is always unique

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}