// 233168
public class Johnson1 {
    public static void main(String[] args) throws Exception {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            // find all multiples of 3 OR 5
            if(i % 3 ==0 || i % 5 == 0) {
                sum +=i;
            }
        }
        System.out.println(sum);
    }
}
