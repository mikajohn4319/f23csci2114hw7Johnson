// 5
// find the largest prime factor for a given number
public class Johnson3 {
    public static void main(String[] args) throws Exception {
        long n = 1_000_000;
        primeFactor(n);
    }

    public static void primeFactor(long n) {
        long i = 2;
        // divisible by i?
        while (i * i <= n) {
            if (n % i != 0) {
                i++;
            } else {
                n /= i;
            }
        }
        System.out.println(n);
    } 
}
