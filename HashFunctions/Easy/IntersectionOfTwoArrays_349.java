package Easy;

import java.util.HashSet;
import java.util.Scanner;

public class IntersectionOfTwoArrays_349 {

    public static int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> firstArrayElements = new HashSet<>();

        HashSet<Integer> commonElements = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            firstArrayElements.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (firstArrayElements.contains(nums2[i])) {
                commonElements.add(nums2[i]);
            }
        }
        int[] answer = new int[commonElements.size()];
        int index = 0;
        for (Integer value : commonElements) {
            answer[index] = value;
            index++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();
        int[] nums1 = new int[n];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n; i++) {
            nums1[i] = sc.nextInt();
        }
        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();
        int[] nums2 = new int[m];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < m; i++) {
            nums2[i] = sc.nextInt();
        }
        int[] result = intersection(nums1, nums2);
        System.out.print("Intersection of both arrays: ");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
