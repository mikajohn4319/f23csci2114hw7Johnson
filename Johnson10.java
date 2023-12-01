// 142913828922
import java.util.ArrayList;
import java.util.List;

public class Johnson10 {

    public static void main(String[] args) {
        int max = 2_000_000;
        findPrimeNumbers(max);
    }

    // calculate the sum of the primes
    private static void findPrimeNumbers(int max) {
        boolean[] primeArray = new boolean[max + 1];
        eratosthenes(max, primeArray);

        // add the primes to the list
        // stored as true for prime, false otherwise
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= max; i++) {
            if (!primeArray[i]) {
                primes.add(i);
            }
        }

        // calc the sum
        long sum = 0;
        for (int prime : primes) {
            sum += prime;
        }

        System.out.println(sum);
    }

    // sieve of eratosthenes from class
    public static void eratosthenes(int n, boolean[] primeArray) {
        for (int i = 2; i <= n; i++) {
            primeArray[i] = false;
        }

        for (int i = 2; i * i <= n; i++) {
            for (int j = i * i; j <= n; j += i) {
                primeArray[j] = true;
            }
        }
    }
}

