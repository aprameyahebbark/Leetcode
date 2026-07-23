package Medium;
public class MaximumLengthRepeatedSubarray_718 {

    public static int findLength(int[] nums1, int[] nums2) {
        int max = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {

                int x = i;
                int y = j;
                int count = 0;
                while (x < nums1.length &&
                        y < nums2.length &&
                        nums1[x] == nums2[y]) {
                    count++;
                    x++;
                    y++;
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 2, 1};
        int[] nums2 = {3, 2, 1, 4, 7};
        int result = findLength(nums1, nums2);
        System.out.println("Maximum Length of Repeated Subarray: " + result);


    }


}
