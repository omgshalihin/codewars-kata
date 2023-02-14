package squareSum;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Kata {

    public static int squareSum(int[] numbers) {

        double sum = Arrays.stream(numbers)
                .mapToDouble(num -> Math.pow(num, 2))
                .sum();
        return (int) sum;

//        int sum = 0;
//        for (int num : numbers) {
//            sum += Math.pow(num, 2);
//        }
//        return sum;
    }

    public static void main(String[] args) {
        System.out.println(squareSum(new int[]{1, 2, 2}));
    }
}
