package Medium;

public class Pow_50 {
    public static double myPow(double x, int n) {
        if (n == 0)
            return 1;
        long power = Math.abs((long) n);
        double ans = 1;
        for (long i = 0; i < power; i++) {
            ans *= x;
        }
        if (n < 0)
            return 1 / ans;
        return ans;
    }

    public static void main(String[] args) {

        double x = 2.100000;
        int n = -3;
        double result = myPow(x, n);
        System.out.println("Base Number= " + x);
        System.out.println("Exponent = " + n);
        System.out.println("Answer = " + result);
    }
}