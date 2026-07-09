package Easy;

public class PowerOfThree_326 {

    public static boolean isPowerOfThree(int n) {

        if (n <= 0) {
            return false;
        }

        while (n % 3 == 0) {
            n = n / 3;
        }

        return n == 1;
    }

    public static void main(String[] args) {

        int n = 29;

        if (isPowerOfThree(n)) {
            System.out.println(n + " is a Power of Three.");
        } else {
            System.out.println(n + " is not a Power of Three.");
        }
    }
}
