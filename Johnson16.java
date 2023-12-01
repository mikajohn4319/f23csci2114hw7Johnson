// 1366
import java.math.BigInteger;

public class Johnson16 {
    public static void main(String[] args) {
        int num = 2;
        int power = 1000;

        // calculate 2 to the power of 1000
        BigInteger result = BigInteger.valueOf(num).pow(power);

        calcSum(result);
    }

    // calculate the sum
    public static void calcSum(BigInteger n) {
        // convert bigint to string
        String numberString = n.toString();
        int sum = 0;

        // iterate through the strings
        for (int i = 0; i < numberString.length(); i++) {
            // add to sum
            sum += numberString.charAt(i) - '0';
        }

        System.out.println(sum);
    }
}
