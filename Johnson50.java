// 997651
import java.util.ArrayList;
import java.util.List;

public class Johnson50 {

    public static void main(String[] args) {
        int max = 1_000_000;
        findPrimes(max);
    }

    // finds sum of the the consecutive primes
    private static void findPrimes(int max) {
        // list to store prime numbers
        List<Integer> primes = new ArrayList<>();

         // add only the prime numbers to the list
        for (int i = 2; i < max; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }

        // store sum
        long maxSum = 0;
        // store the length of the sum sequence
        int maxRun = -1;

        // iterate through the list of prime numbers
        // find the prime with the most consecutive sums below the max
        for (int i = 0; i < primes.size(); i++) {
            long sum = 0;
            int consecutive = 0;

            for (int j = i; j < primes.size(); j++) {
                sum += primes.get(j);
                consecutive++;

                // break if sum exceeds the maximum
                if (sum > max) {
                    break;
                }

                if (isPrime((int) sum) && consecutive > maxRun) {
                    maxSum = sum;
                    maxRun = consecutive;
                }
            }
        }

        System.out.println(maxSum);
    }

    // check if the input number is prime
    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
