// 906609

public class Johnson4 {
    public static void main(String[] args) throws Exception {
        palindrome();
    }

    private static void palindrome() {
        int largestPalindrome = 0;

        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                int product = i * j;
                if (isPalindrome(product) && product > largestPalindrome) {
                    largestPalindrome = product;
                }
            }
        }
        System.out.println(largestPalindrome);
    }

    private static boolean isPalindrome(int n) {
        String number = String.valueOf(n);
        String reversed = new StringBuilder(number).reverse().toString();
        return number.equals(reversed);
    }
}
