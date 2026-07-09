package Easy;

public class PowerOfFour_342 {

    public static boolean isPowerOfThree(int n) {

        if (n <= 0) {
            return false;
        }

        while (n % 4 == 0) {
            n /= 4;
        }

        return n == 1;
    }

    public static void main(String[] args) {

        int n = 16;

        if (isPowerOfThree(n)) {
            System.out.println(n + " is a Power of Four");
        } else {
            System.out.println(n + " isn't a Power of four");
        }
    }
}
