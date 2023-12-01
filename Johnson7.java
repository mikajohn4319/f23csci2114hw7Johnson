// 104743
public class Johnson7 {

    public static void main(String[] args) {
        int n = 10001;
        bigPrime(n);
    }

    public static void bigPrime(int n) {
        int count = 0;
        for (int i = 2; count <= n; i++) {
            if (isPrime(i)) {
                count++;
                if (count == n) {
                    System.out.println(i);
                    break;
                }
            }
        }
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
