package Medium;
import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyStrings_43 {
    public static String multiply(String num1, String num2) {
        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);
        return a.multiply(b).toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        String num1 = sc.nextLine();

        System.out.print("Enter second number: ");
        String num2 = sc.nextLine();
        String result = multiply(num1, num2);
        System.out.println("Product = " + result);
        sc.close();
    }
}