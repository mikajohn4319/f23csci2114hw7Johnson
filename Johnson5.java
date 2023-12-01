// 232792560
public class Johnson5 {
    public static void main(String[] args) throws Exception {
        smallestMultiple();
    }

    private static void smallestMultiple() {
        int smallestNum = 1;
        Boolean found = false;
        while (!found) {
            found = true;
            for (int i = 1; i <= 20; i++) {
                if (smallestNum % i != 0) {
                    found = false;
                    smallestNum++;
                    break;
                }
            }
            if (found) {
                System.out.println(smallestNum);
            }
        }
    }
}
