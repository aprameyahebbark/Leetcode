package Easy;

import java.util.Scanner;
public class Sqrt_69 {
    public static int mySqrt(int x) {

        if (x == 0 || x == 1) {
            return x;
        }
        int left = 1;
        int right = x;
        int ans = 0;
        while (left <= right) {

            int mid = left + (right - left) / 2;
            if (mid <= x / mid) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.println("Square Root = " + mySqrt(x));
    }
}
