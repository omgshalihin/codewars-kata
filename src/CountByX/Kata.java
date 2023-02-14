package CountByX;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Kata {
    public static int[] countBy(int x, int n) {
        return IntStream
                .range(1, n + 1)
                .map(el -> el * x)
                .toArray();
    }

    public static void main(String[] args) {
        System.out.println(countBy(2, 5));
    }
}
