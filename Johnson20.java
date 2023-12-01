// 648
import java.math.BigInteger;

public class Johnson20 {

    public static void main(String[] args) {
        int n = 100;
        BigInteger factorial = calculateFactorial(n);
        int sum = sum(factorial);
        System.out.println(sum);
    }

    // calculates the factorial 
    private static BigInteger calculateFactorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    // calculates sum of the numbers
    private static int sum(BigInteger number) {
        String num = number.toString();
        int sum = 0;
        for (char digit : num.toCharArray()) {
            sum += Character.getNumericValue(digit);
        }
        return sum;
    }
}
