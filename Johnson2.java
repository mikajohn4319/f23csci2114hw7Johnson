// 4613732
public class Johnson2 {
    public static void main(String[] args) throws Exception {
        int n = 4_000_000;
        fibonacci(n);
    }

    public static void fibonacci(int n) {
        int number1 = 1;
        int number2 = 2;
        int sum = 0;

        while (number1 <= n) {
            if (number1 % 2 == 0) {
                sum += number1;
            }

            int number3 = number1 + number2;
            number1 = number2;
            number2 = number3;
        }
        System.out.println(sum);
    }
}
