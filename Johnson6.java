// 25164150
public class Johnson6 {

    public static void main(String[] args) {
        int n = 100;
        sumSquared(n);
    }
	
	public static void sumSquared(int n) {
        // sums
		int sumNumbers = 0;
		int sumSquares = 0;
        //
		for (int i = 1; i <= n; i++) {
            //calc sum of squares
			sumSquares += i * i;

            // calc sum of numbers
			sumNumbers += i;
		}
        int output = (sumNumbers * sumNumbers) - sumSquares;
		System.out.println(output);
	}
}
