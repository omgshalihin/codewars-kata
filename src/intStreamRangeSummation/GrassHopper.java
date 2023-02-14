package intStreamRangeSummation;

import java.util.stream.IntStream;

public class GrassHopper {
    public static int summation(int n) {
//        int sum = 0;
//        do {
//            sum = sum + n;
//            n--;
//        } while (n > 0);
//        return sum;
        return IntStream.rangeClosed(1,n).sum();
    }

    public static void main(String[] args) {
        System.out.println(summation(5));
    }
}
