import java.util.Arrays;

public class ContainsDuplicate_217 {

    public static boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {
                return true;
            }

        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 3, 4};
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        int[] nums4= {5,7,8,4,1};

        System.out.println("Ex1: " + containsDuplicate(nums1));
        System.out.println("Ex2: " + containsDuplicate(nums2));
        System.out.println("Ex3: " + containsDuplicate(nums3));
        System.out.println("Ex4: " + containsDuplicate(nums4));
    }
}