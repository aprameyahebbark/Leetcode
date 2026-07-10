package Easy;

public class PowerOfFour_342 {

    public static boolean isPowerOfFour(int n) {

        return n > 0 &&
                (n & (n - 1)) == 0 &&
                (n & 0x55555555) != 0;
    }

    public static void main(String[] args) {

        int n = 16;

        if (isPowerOfFour(n)) {
            System.out.println(n + " is a Power of Four");
        } else {
            System.out.println(n + " isn't a Power of Four");
        }
    }
}