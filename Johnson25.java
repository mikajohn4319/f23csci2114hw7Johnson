// 4782
import java.math.BigInteger;

public class Johnson25 {
    public static void main(String[] args) {
        BigInteger firstNum = BigInteger.ONE;
        BigInteger secondNum = BigInteger.ONE;

        int num = 2; // already have the first two (1, 1)

        while (true) {
            BigInteger next = firstNum.add(secondNum);
            num++;

            if (next.toString().length() >= 1000) {
                System.out.println(num);
                break;
            }

            // move to the next pair of fibonacci numbers
            firstNum = secondNum;
            secondNum = next;
        }
    }
}
