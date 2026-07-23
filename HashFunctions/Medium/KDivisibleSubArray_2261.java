package Medium;
import java.util.*;
class KDivisibleSubArray_2261 {
    public int countDistinct(int[] nums, int k, int p) {

        HashSet<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int divisibleCount = 0;
            List<Integer> current = new ArrayList<>();

            for (int j = i; j < n; j++) {

                if (nums[j] % p == 0) {
                    divisibleCount++;
                }

                if (divisibleCount > k) {
                    break;
                }

                current.add(nums[j]);
                set.add(new ArrayList<>(current));
            }
        }
        return set.size();
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();
        System.out.print("Enter p: ");
        int p = sc.nextInt();

        KDivisibleSubArray_2261 sol = new KDivisibleSubArray_2261();
        int ans = sol.countDistinct(nums, k, p);
        System.out.println("Number of distinct valid subarrays = " + ans);
    }
}