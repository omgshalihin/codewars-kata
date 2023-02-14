package countDivisorsOfNumber;

import java.util.stream.IntStream;

public class FindDivisor {

    public static long numberOfDivisors(int n) {
        long counter = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println("can be divided by: " + i);
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(numberOfDivisors(15));
    }
}
